# Copyright 2018 Google LLC
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

"""This script is used to synthesize generated parts of this library."""


import glob
import json
import logging
from os import path
from pathlib import Path
import re
import sys
from typing import List

import attr
import synthtool as s
from synthtool.__main__ import extra_args
from synthtool import log, shell
from synthtool.sources import git

logging.basicConfig(level=logging.DEBUG)

TEMPLATE_VERSIONS = ["1.26.0", "1.27.0"]
discovery_url = "https://github.com/googleapis/discovery-artifact-manager.git"

repository = Path(".")

log.debug(f"Cloning {discovery_url}.")
discovery = git.clone(discovery_url, depth=1)

log.debug("Cleaning output directory.")
shell.run("rm -rf .cache".split(), cwd=repository)

log.debug("Installing dependencies.")
shell.run("python2 -m pip install -e generator/ --user".split(), cwd=repository)


def dasherize(name: str):
    s1 = re.sub("(.)([A-Z][a-z]+)", r"\1-\2", name)
    return re.sub("([a-z0-9])([A-Z])", r"\1-\2", s1).lower()


@attr.s(auto_attribs=True)
class Discovery:
    name: str = None
    api_version: str = None
    revision: str = None
    definition: Path = None

    @staticmethod
    def from_disco(disco: Path):
        with open(disco) as f:
            data = json.load(f)
            return Discovery(
                name=data["name"],
                api_version=data["version"],
                revision=data["revision"],
                definition=disco,
            )

        return None


def generate_service(name: str, discos: List[Discovery]) -> None:
    library_name = f"google-api-services-{name}"

    for template in TEMPLATE_VERSIONS:
        for disco in discos:
            log.info(f"Generating {name} {disco.api_version} {template}.")
            output_dir = repository / ".cache" / library_name / disco.api_version
            input_file = discovery / "discoveries" / disco.definition

            command = (
                f"python2 -m googleapis.codegen --output_dir={output_dir}"
                + f" --input={input_file} --language=java --language_variant={template}"
                + " --version_package"
            )

            shell.run(f"mkdir -p {output_dir}".split(), cwd=repository / "generator")
            shell.run(command.split(), cwd=repository)

            s.copy(output_dir, f"clients/{template}/{library_name}")

        # TODO(chingor): fix pom version


def all_discoveries():
    discos = {}
    for file in glob.glob(str(discovery / "discoveries/*.v*.json")):
        disco = Discovery.from_disco(file)

        if not disco.name in discos:
            discos[disco.name] = []

        discos[disco.name].append(disco)

    return discos


discoveries = all_discoveries()


if extra_args():
    api_name = extra_args()[0]
    discoveries = {api_name: discoveries[api_name]}
    #     discovery for discovery in discoveries if discovery.split(".")[0] == api_name
    # ]

print(discoveries)

for name, discos in discoveries.items():
    generate_service(name, discos)

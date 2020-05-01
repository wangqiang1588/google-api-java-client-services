/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.remotebuildexecution.v1.model;

/**
 * A worker pool resource in the Remote Build Execution API.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Remote Build Execution API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool extends com.google.api.client.json.GenericJson {

  /**
   * The autoscale policy to apply on a pool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleDevtoolsRemotebuildexecutionAdminV1alphaAutoscale autoscale;

  /**
   * WorkerPool resource name formatted as:
   * `projects/[PROJECT_ID]/instances/[INSTANCE_ID]/workerpools/[POOL_ID]`. name should not be
   * populated when creating a worker pool since it is provided in the `poolId` field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. State of the worker pool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Specifies the properties, such as machine type and disk size, used for creating workers in a
   * worker pool.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig workerConfig;

  /**
   * The desired number of workers in the worker pool. Must be a value between 0 and 15000.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long workerCount;

  /**
   * The autoscale policy to apply on a pool.
   * @return value or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaAutoscale getAutoscale() {
    return autoscale;
  }

  /**
   * The autoscale policy to apply on a pool.
   * @param autoscale autoscale or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool setAutoscale(GoogleDevtoolsRemotebuildexecutionAdminV1alphaAutoscale autoscale) {
    this.autoscale = autoscale;
    return this;
  }

  /**
   * WorkerPool resource name formatted as:
   * `projects/[PROJECT_ID]/instances/[INSTANCE_ID]/workerpools/[POOL_ID]`. name should not be
   * populated when creating a worker pool since it is provided in the `poolId` field.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * WorkerPool resource name formatted as:
   * `projects/[PROJECT_ID]/instances/[INSTANCE_ID]/workerpools/[POOL_ID]`. name should not be
   * populated when creating a worker pool since it is provided in the `poolId` field.
   * @param name name or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. State of the worker pool.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. State of the worker pool.
   * @param state state or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Specifies the properties, such as machine type and disk size, used for creating workers in a
   * worker pool.
   * @return value or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig getWorkerConfig() {
    return workerConfig;
  }

  /**
   * Specifies the properties, such as machine type and disk size, used for creating workers in a
   * worker pool.
   * @param workerConfig workerConfig or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool setWorkerConfig(GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig workerConfig) {
    this.workerConfig = workerConfig;
    return this;
  }

  /**
   * The desired number of workers in the worker pool. Must be a value between 0 and 15000.
   * @return value or {@code null} for none
   */
  public java.lang.Long getWorkerCount() {
    return workerCount;
  }

  /**
   * The desired number of workers in the worker pool. Must be a value between 0 and 15000.
   * @param workerCount workerCount or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool setWorkerCount(java.lang.Long workerCount) {
    this.workerCount = workerCount;
    return this;
  }

  @Override
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool set(String fieldName, Object value) {
    return (GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool) super.set(fieldName, value);
  }

  @Override
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool clone() {
    return (GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool) super.clone();
  }

}

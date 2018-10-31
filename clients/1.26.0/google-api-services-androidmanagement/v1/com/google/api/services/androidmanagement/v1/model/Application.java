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

package com.google.api.services.androidmanagement.v1.model;

/**
 * Information about an app.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Android Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Application extends com.google.api.client.json.GenericJson {

  /**
   * The set of managed properties available to be pre-configured for the app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ManagedProperty> managedProperties;

  static {
    // hack to force ProGuard to consider ManagedProperty used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ManagedProperty.class);
  }

  /**
   * The name of the app in the form enterprises/{enterpriseId}/applications/{package_name}.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The permissions required by the app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ApplicationPermission> permissions;

  static {
    // hack to force ProGuard to consider ApplicationPermission used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ApplicationPermission.class);
  }

  /**
   * The title of the app. Localized.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The set of managed properties available to be pre-configured for the app.
   * @return value or {@code null} for none
   */
  public java.util.List<ManagedProperty> getManagedProperties() {
    return managedProperties;
  }

  /**
   * The set of managed properties available to be pre-configured for the app.
   * @param managedProperties managedProperties or {@code null} for none
   */
  public Application setManagedProperties(java.util.List<ManagedProperty> managedProperties) {
    this.managedProperties = managedProperties;
    return this;
  }

  /**
   * The name of the app in the form enterprises/{enterpriseId}/applications/{package_name}.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the app in the form enterprises/{enterpriseId}/applications/{package_name}.
   * @param name name or {@code null} for none
   */
  public Application setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The permissions required by the app.
   * @return value or {@code null} for none
   */
  public java.util.List<ApplicationPermission> getPermissions() {
    return permissions;
  }

  /**
   * The permissions required by the app.
   * @param permissions permissions or {@code null} for none
   */
  public Application setPermissions(java.util.List<ApplicationPermission> permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * The title of the app. Localized.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The title of the app. Localized.
   * @param title title or {@code null} for none
   */
  public Application setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public Application set(String fieldName, Object value) {
    return (Application) super.set(fieldName, value);
  }

  @Override
  public Application clone() {
    return (Application) super.clone();
  }

}

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

package com.google.api.services.digitalassetlinks.v1.model;

/**
 * Response message for the List call.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Digital Asset Links API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListResponse extends com.google.api.client.json.GenericJson {

  /**
   * Human-readable message containing information intended to help end users understand, reproduce
   * and debug the result. The message will be in English and we are currently not planning to offer
   * any translations. Please note that no guarantees are made about the contents or format of this
   * string. Any aspect of it may be subject to change without notice. You should not attempt to
   * programmatically parse this data. For programmatic access, use the error_code field below.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String debugString;

  /**
   * Error codes that describe the result of the List operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> errorCode;

  /**
   * From serving time, how much longer the response should be considered valid barring further
   * updates. REQUIRED
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String maxAge;

  /**
   * A list of all the matching statements that have been found.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Statement> statements;

  /**
   * Human-readable message containing information intended to help end users understand, reproduce
   * and debug the result. The message will be in English and we are currently not planning to offer
   * any translations. Please note that no guarantees are made about the contents or format of this
   * string. Any aspect of it may be subject to change without notice. You should not attempt to
   * programmatically parse this data. For programmatic access, use the error_code field below.
   * @return value or {@code null} for none
   */
  public java.lang.String getDebugString() {
    return debugString;
  }

  /**
   * Human-readable message containing information intended to help end users understand, reproduce
   * and debug the result. The message will be in English and we are currently not planning to offer
   * any translations. Please note that no guarantees are made about the contents or format of this
   * string. Any aspect of it may be subject to change without notice. You should not attempt to
   * programmatically parse this data. For programmatic access, use the error_code field below.
   * @param debugString debugString or {@code null} for none
   */
  public ListResponse setDebugString(java.lang.String debugString) {
    this.debugString = debugString;
    return this;
  }

  /**
   * Error codes that describe the result of the List operation.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getErrorCode() {
    return errorCode;
  }

  /**
   * Error codes that describe the result of the List operation.
   * @param errorCode errorCode or {@code null} for none
   */
  public ListResponse setErrorCode(java.util.List<java.lang.String> errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * From serving time, how much longer the response should be considered valid barring further
   * updates. REQUIRED
   * @return value or {@code null} for none
   */
  public String getMaxAge() {
    return maxAge;
  }

  /**
   * From serving time, how much longer the response should be considered valid barring further
   * updates. REQUIRED
   * @param maxAge maxAge or {@code null} for none
   */
  public ListResponse setMaxAge(String maxAge) {
    this.maxAge = maxAge;
    return this;
  }

  /**
   * A list of all the matching statements that have been found.
   * @return value or {@code null} for none
   */
  public java.util.List<Statement> getStatements() {
    return statements;
  }

  /**
   * A list of all the matching statements that have been found.
   * @param statements statements or {@code null} for none
   */
  public ListResponse setStatements(java.util.List<Statement> statements) {
    this.statements = statements;
    return this;
  }

  @Override
  public ListResponse set(String fieldName, Object value) {
    return (ListResponse) super.set(fieldName, value);
  }

  @Override
  public ListResponse clone() {
    return (ListResponse) super.clone();
  }

}

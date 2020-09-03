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

package com.google.api.services.safebrowsing.v4.model;

/**
 * An update to an individual list.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Safe Browsing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListUpdateResponse extends com.google.api.client.json.GenericJson {

  /**
   * A set of entries to add to a local threat type's list. Repeated to allow for a combination of
   * compressed and raw data to be sent in a single response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ThreatEntrySet> additions;

  /**
   * The expected SHA256 hash of the client state; that is, of the sorted list of all hashes present
   * in the database after applying the provided update. If the client state doesn't match the
   * expected state, the client must disregard this update and retry later.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Checksum checksum;

  /**
   * The new client state, in encrypted format. Opaque to clients.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String newClientState;

  /**
   * The platform type for which data is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String platformType;

  /**
   * A set of entries to remove from a local threat type's list. In practice, this field is empty or
   * contains exactly one ThreatEntrySet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ThreatEntrySet> removals;

  /**
   * The type of response. This may indicate that an action is required by the client when the
   * response is received.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String responseType;

  /**
   * The format of the threats.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String threatEntryType;

  /**
   * The threat type for which data is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String threatType;

  /**
   * A set of entries to add to a local threat type's list. Repeated to allow for a combination of
   * compressed and raw data to be sent in a single response.
   * @return value or {@code null} for none
   */
  public java.util.List<ThreatEntrySet> getAdditions() {
    return additions;
  }

  /**
   * A set of entries to add to a local threat type's list. Repeated to allow for a combination of
   * compressed and raw data to be sent in a single response.
   * @param additions additions or {@code null} for none
   */
  public ListUpdateResponse setAdditions(java.util.List<ThreatEntrySet> additions) {
    this.additions = additions;
    return this;
  }

  /**
   * The expected SHA256 hash of the client state; that is, of the sorted list of all hashes present
   * in the database after applying the provided update. If the client state doesn't match the
   * expected state, the client must disregard this update and retry later.
   * @return value or {@code null} for none
   */
  public Checksum getChecksum() {
    return checksum;
  }

  /**
   * The expected SHA256 hash of the client state; that is, of the sorted list of all hashes present
   * in the database after applying the provided update. If the client state doesn't match the
   * expected state, the client must disregard this update and retry later.
   * @param checksum checksum or {@code null} for none
   */
  public ListUpdateResponse setChecksum(Checksum checksum) {
    this.checksum = checksum;
    return this;
  }

  /**
   * The new client state, in encrypted format. Opaque to clients.
   * @see #decodeNewClientState()
   * @return value or {@code null} for none
   */
  public java.lang.String getNewClientState() {
    return newClientState;
  }

  /**
   * The new client state, in encrypted format. Opaque to clients.
   * @see #getNewClientState()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeNewClientState() {
    return com.google.api.client.util.Base64.decodeBase64(newClientState);
  }

  /**
   * The new client state, in encrypted format. Opaque to clients.
   * @see #encodeNewClientState()
   * @param newClientState newClientState or {@code null} for none
   */
  public ListUpdateResponse setNewClientState(java.lang.String newClientState) {
    this.newClientState = newClientState;
    return this;
  }

  /**
   * The new client state, in encrypted format. Opaque to clients.
   * @see #setNewClientState()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public ListUpdateResponse encodeNewClientState(byte[] newClientState) {
    this.newClientState = com.google.api.client.util.Base64.encodeBase64URLSafeString(newClientState);
    return this;
  }

  /**
   * The platform type for which data is returned.
   * @return value or {@code null} for none
   */
  public java.lang.String getPlatformType() {
    return platformType;
  }

  /**
   * The platform type for which data is returned.
   * @param platformType platformType or {@code null} for none
   */
  public ListUpdateResponse setPlatformType(java.lang.String platformType) {
    this.platformType = platformType;
    return this;
  }

  /**
   * A set of entries to remove from a local threat type's list. In practice, this field is empty or
   * contains exactly one ThreatEntrySet.
   * @return value or {@code null} for none
   */
  public java.util.List<ThreatEntrySet> getRemovals() {
    return removals;
  }

  /**
   * A set of entries to remove from a local threat type's list. In practice, this field is empty or
   * contains exactly one ThreatEntrySet.
   * @param removals removals or {@code null} for none
   */
  public ListUpdateResponse setRemovals(java.util.List<ThreatEntrySet> removals) {
    this.removals = removals;
    return this;
  }

  /**
   * The type of response. This may indicate that an action is required by the client when the
   * response is received.
   * @return value or {@code null} for none
   */
  public java.lang.String getResponseType() {
    return responseType;
  }

  /**
   * The type of response. This may indicate that an action is required by the client when the
   * response is received.
   * @param responseType responseType or {@code null} for none
   */
  public ListUpdateResponse setResponseType(java.lang.String responseType) {
    this.responseType = responseType;
    return this;
  }

  /**
   * The format of the threats.
   * @return value or {@code null} for none
   */
  public java.lang.String getThreatEntryType() {
    return threatEntryType;
  }

  /**
   * The format of the threats.
   * @param threatEntryType threatEntryType or {@code null} for none
   */
  public ListUpdateResponse setThreatEntryType(java.lang.String threatEntryType) {
    this.threatEntryType = threatEntryType;
    return this;
  }

  /**
   * The threat type for which data is returned.
   * @return value or {@code null} for none
   */
  public java.lang.String getThreatType() {
    return threatType;
  }

  /**
   * The threat type for which data is returned.
   * @param threatType threatType or {@code null} for none
   */
  public ListUpdateResponse setThreatType(java.lang.String threatType) {
    this.threatType = threatType;
    return this;
  }

  @Override
  public ListUpdateResponse set(String fieldName, Object value) {
    return (ListUpdateResponse) super.set(fieldName, value);
  }

  @Override
  public ListUpdateResponse clone() {
    return (ListUpdateResponse) super.clone();
  }

}

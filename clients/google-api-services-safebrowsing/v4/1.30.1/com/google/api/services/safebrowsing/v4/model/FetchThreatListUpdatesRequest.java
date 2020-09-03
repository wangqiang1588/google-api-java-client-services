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
 * Describes a Safe Browsing API update request. Clients can request updates for multiple lists in a
 * single request. NOTE: Field index 2 is unused. NEXT: 5
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Safe Browsing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FetchThreatListUpdatesRequest extends com.google.api.client.json.GenericJson {

  /**
   * The client metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ClientInfo client;

  /**
   * The requested threat list updates.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ListUpdateRequest> listUpdateRequests;

  /**
   * The client metadata.
   * @return value or {@code null} for none
   */
  public ClientInfo getClient() {
    return client;
  }

  /**
   * The client metadata.
   * @param client client or {@code null} for none
   */
  public FetchThreatListUpdatesRequest setClient(ClientInfo client) {
    this.client = client;
    return this;
  }

  /**
   * The requested threat list updates.
   * @return value or {@code null} for none
   */
  public java.util.List<ListUpdateRequest> getListUpdateRequests() {
    return listUpdateRequests;
  }

  /**
   * The requested threat list updates.
   * @param listUpdateRequests listUpdateRequests or {@code null} for none
   */
  public FetchThreatListUpdatesRequest setListUpdateRequests(java.util.List<ListUpdateRequest> listUpdateRequests) {
    this.listUpdateRequests = listUpdateRequests;
    return this;
  }

  @Override
  public FetchThreatListUpdatesRequest set(String fieldName, Object value) {
    return (FetchThreatListUpdatesRequest) super.set(fieldName, value);
  }

  @Override
  public FetchThreatListUpdatesRequest clone() {
    return (FetchThreatListUpdatesRequest) super.clone();
  }

}

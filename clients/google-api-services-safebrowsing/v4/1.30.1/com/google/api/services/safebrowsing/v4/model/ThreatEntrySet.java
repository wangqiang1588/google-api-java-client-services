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
 * A set of threats that should be added or removed from a client's local database.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Safe Browsing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ThreatEntrySet extends com.google.api.client.json.GenericJson {

  /**
   * The compression type for the entries in this set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String compressionType;

  /**
   * The raw SHA256-formatted entries.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RawHashes rawHashes;

  /**
   * The raw removal indices for a local list.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RawIndices rawIndices;

  /**
   * The encoded 4-byte prefixes of SHA256-formatted entries, using a Golomb-Rice encoding. The
   * hashes are converted to uint32, sorted in ascending order, then delta encoded and stored as
   * encoded_data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RiceDeltaEncoding riceHashes;

  /**
   * The encoded local, lexicographically-sorted list indices, using a Golomb-Rice encoding. Used
   * for sending compressed removal indices. The removal indices (uint32) are sorted in ascending
   * order, then delta encoded and stored as encoded_data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RiceDeltaEncoding riceIndices;

  /**
   * The compression type for the entries in this set.
   * @return value or {@code null} for none
   */
  public java.lang.String getCompressionType() {
    return compressionType;
  }

  /**
   * The compression type for the entries in this set.
   * @param compressionType compressionType or {@code null} for none
   */
  public ThreatEntrySet setCompressionType(java.lang.String compressionType) {
    this.compressionType = compressionType;
    return this;
  }

  /**
   * The raw SHA256-formatted entries.
   * @return value or {@code null} for none
   */
  public RawHashes getRawHashes() {
    return rawHashes;
  }

  /**
   * The raw SHA256-formatted entries.
   * @param rawHashes rawHashes or {@code null} for none
   */
  public ThreatEntrySet setRawHashes(RawHashes rawHashes) {
    this.rawHashes = rawHashes;
    return this;
  }

  /**
   * The raw removal indices for a local list.
   * @return value or {@code null} for none
   */
  public RawIndices getRawIndices() {
    return rawIndices;
  }

  /**
   * The raw removal indices for a local list.
   * @param rawIndices rawIndices or {@code null} for none
   */
  public ThreatEntrySet setRawIndices(RawIndices rawIndices) {
    this.rawIndices = rawIndices;
    return this;
  }

  /**
   * The encoded 4-byte prefixes of SHA256-formatted entries, using a Golomb-Rice encoding. The
   * hashes are converted to uint32, sorted in ascending order, then delta encoded and stored as
   * encoded_data.
   * @return value or {@code null} for none
   */
  public RiceDeltaEncoding getRiceHashes() {
    return riceHashes;
  }

  /**
   * The encoded 4-byte prefixes of SHA256-formatted entries, using a Golomb-Rice encoding. The
   * hashes are converted to uint32, sorted in ascending order, then delta encoded and stored as
   * encoded_data.
   * @param riceHashes riceHashes or {@code null} for none
   */
  public ThreatEntrySet setRiceHashes(RiceDeltaEncoding riceHashes) {
    this.riceHashes = riceHashes;
    return this;
  }

  /**
   * The encoded local, lexicographically-sorted list indices, using a Golomb-Rice encoding. Used
   * for sending compressed removal indices. The removal indices (uint32) are sorted in ascending
   * order, then delta encoded and stored as encoded_data.
   * @return value or {@code null} for none
   */
  public RiceDeltaEncoding getRiceIndices() {
    return riceIndices;
  }

  /**
   * The encoded local, lexicographically-sorted list indices, using a Golomb-Rice encoding. Used
   * for sending compressed removal indices. The removal indices (uint32) are sorted in ascending
   * order, then delta encoded and stored as encoded_data.
   * @param riceIndices riceIndices or {@code null} for none
   */
  public ThreatEntrySet setRiceIndices(RiceDeltaEncoding riceIndices) {
    this.riceIndices = riceIndices;
    return this;
  }

  @Override
  public ThreatEntrySet set(String fieldName, Object value) {
    return (ThreatEntrySet) super.set(fieldName, value);
  }

  @Override
  public ThreatEntrySet clone() {
    return (ThreatEntrySet) super.clone();
  }

}

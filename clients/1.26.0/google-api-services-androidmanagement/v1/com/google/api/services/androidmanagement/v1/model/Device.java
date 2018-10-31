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
 * A device owned by an enterprise. Unless otherwise noted, all fields are read-only and can't be
 * modified by enterprises.devices.patch.
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
public final class Device extends com.google.api.client.json.GenericJson {

  /**
   * The API level of the Android platform version running on the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer apiLevel;

  /**
   * Reports for apps installed on the device. This information is only available when
   * application_reports_enabled is true in the device's policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ApplicationReport> applicationReports;

  static {
    // hack to force ProGuard to consider ApplicationReport used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ApplicationReport.class);
  }

  /**
   * The name of the policy currently applied to the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String appliedPolicyName;

  /**
   * The version of the policy currently applied to the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long appliedPolicyVersion;

  /**
   * The state currently applied to the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String appliedState;

  /**
   * Device settings information. This information is only available if deviceSettingsEnabled is
   * true in the device's policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeviceSettings deviceSettings;

  /**
   * If the device state is DISABLED, an optional message that is displayed on the device indicating
   * the reason the device is disabled. This field can be modified by a patch request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private UserFacingMessage disabledReason;

  /**
   * Detailed information about displays on the device. This information is only available if
   * displayInfoEnabled is true in the device's policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Display> displays;

  static {
    // hack to force ProGuard to consider Display used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Display.class);
  }

  /**
   * The time of device enrollment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String enrollmentTime;

  /**
   * If the device was enrolled with an enrollment token with additional data provided, this field
   * contains that data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String enrollmentTokenData;

  /**
   * If the device was enrolled with an enrollment token, this field contains the name of the token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String enrollmentTokenName;

  /**
   * Detailed information about the device hardware.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HardwareInfo hardwareInfo;

  /**
   * Hardware status samples in chronological order. This information is only available if
   * hardwareStatusEnabled is true in the device's policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<HardwareStatus> hardwareStatusSamples;

  /**
   * Deprecated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastPolicyComplianceReportTime;

  /**
   * The last time the device fetched its policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastPolicySyncTime;

  /**
   * The last time the device sent a status report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastStatusReportTime;

  /**
   * The type of management mode Android Device Policy takes on the device. This influences which
   * policy settings are supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String managementMode;

  /**
   * Events related to memory and storage measurements in chronological order. This information is
   * only available if memoryInfoEnabled is true in the device's policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MemoryEvent> memoryEvents;

  static {
    // hack to force ProGuard to consider MemoryEvent used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(MemoryEvent.class);
  }

  /**
   * Memory information. This information is only available if memoryInfoEnabled is true in the
   * device's policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MemoryInfo memoryInfo;

  /**
   * The name of the device in the form enterprises/{enterpriseId}/devices/{deviceId}.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Device network information. This information is only available if networkInfoEnabled is true in
   * the device's policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NetworkInfo networkInfo;

  /**
   * Details about policy settings that the device is not compliant with.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<NonComplianceDetail> nonComplianceDetails;

  static {
    // hack to force ProGuard to consider NonComplianceDetail used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(NonComplianceDetail.class);
  }

  /**
   * Whether the device is compliant with its policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean policyCompliant;

  /**
   * The name of the policy applied to the device, in the form
   * enterprises/{enterpriseId}/policies/{policyId}. If not specified, the policy_name for the
   * device's user is applied. This field can be modified by a patch request. You can specify only
   * the policyId when calling enterprises.devices.patch, as long as the policyId doesn’t contain
   * any slashes. The rest of the policy name is inferred.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String policyName;

  /**
   * Power management events on the device in chronological order. This information is only
   * available if powerManagementEventsEnabled is true in the device's policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PowerManagementEvent> powerManagementEvents;

  static {
    // hack to force ProGuard to consider PowerManagementEvent used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(PowerManagementEvent.class);
  }

  /**
   * If the same physical device has been enrolled multiple times, this field contains its previous
   * device names. The serial number is used as the unique identifier to determine if the same
   * physical device has enrolled previously. The names are in chronological order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> previousDeviceNames;

  /**
   * Detailed information about the device software. This information is only available if
   * softwareInfoEnabled is true in the device's policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SoftwareInfo softwareInfo;

  /**
   * The state to be applied to the device. This field can be modified by a patch request. Note that
   * when calling enterprises.devices.patch, ACTIVE and DISABLED are the only allowable values. To
   * enter the device into a DELETED state, call enterprises.devices.delete.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The user who owns the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private User user;

  /**
   * The resource name of the user that owns this device in the form
   * enterprises/{enterpriseId}/users/{userId}.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userName;

  /**
   * The API level of the Android platform version running on the device.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getApiLevel() {
    return apiLevel;
  }

  /**
   * The API level of the Android platform version running on the device.
   * @param apiLevel apiLevel or {@code null} for none
   */
  public Device setApiLevel(java.lang.Integer apiLevel) {
    this.apiLevel = apiLevel;
    return this;
  }

  /**
   * Reports for apps installed on the device. This information is only available when
   * application_reports_enabled is true in the device's policy.
   * @return value or {@code null} for none
   */
  public java.util.List<ApplicationReport> getApplicationReports() {
    return applicationReports;
  }

  /**
   * Reports for apps installed on the device. This information is only available when
   * application_reports_enabled is true in the device's policy.
   * @param applicationReports applicationReports or {@code null} for none
   */
  public Device setApplicationReports(java.util.List<ApplicationReport> applicationReports) {
    this.applicationReports = applicationReports;
    return this;
  }

  /**
   * The name of the policy currently applied to the device.
   * @return value or {@code null} for none
   */
  public java.lang.String getAppliedPolicyName() {
    return appliedPolicyName;
  }

  /**
   * The name of the policy currently applied to the device.
   * @param appliedPolicyName appliedPolicyName or {@code null} for none
   */
  public Device setAppliedPolicyName(java.lang.String appliedPolicyName) {
    this.appliedPolicyName = appliedPolicyName;
    return this;
  }

  /**
   * The version of the policy currently applied to the device.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAppliedPolicyVersion() {
    return appliedPolicyVersion;
  }

  /**
   * The version of the policy currently applied to the device.
   * @param appliedPolicyVersion appliedPolicyVersion or {@code null} for none
   */
  public Device setAppliedPolicyVersion(java.lang.Long appliedPolicyVersion) {
    this.appliedPolicyVersion = appliedPolicyVersion;
    return this;
  }

  /**
   * The state currently applied to the device.
   * @return value or {@code null} for none
   */
  public java.lang.String getAppliedState() {
    return appliedState;
  }

  /**
   * The state currently applied to the device.
   * @param appliedState appliedState or {@code null} for none
   */
  public Device setAppliedState(java.lang.String appliedState) {
    this.appliedState = appliedState;
    return this;
  }

  /**
   * Device settings information. This information is only available if deviceSettingsEnabled is
   * true in the device's policy.
   * @return value or {@code null} for none
   */
  public DeviceSettings getDeviceSettings() {
    return deviceSettings;
  }

  /**
   * Device settings information. This information is only available if deviceSettingsEnabled is
   * true in the device's policy.
   * @param deviceSettings deviceSettings or {@code null} for none
   */
  public Device setDeviceSettings(DeviceSettings deviceSettings) {
    this.deviceSettings = deviceSettings;
    return this;
  }

  /**
   * If the device state is DISABLED, an optional message that is displayed on the device indicating
   * the reason the device is disabled. This field can be modified by a patch request.
   * @return value or {@code null} for none
   */
  public UserFacingMessage getDisabledReason() {
    return disabledReason;
  }

  /**
   * If the device state is DISABLED, an optional message that is displayed on the device indicating
   * the reason the device is disabled. This field can be modified by a patch request.
   * @param disabledReason disabledReason or {@code null} for none
   */
  public Device setDisabledReason(UserFacingMessage disabledReason) {
    this.disabledReason = disabledReason;
    return this;
  }

  /**
   * Detailed information about displays on the device. This information is only available if
   * displayInfoEnabled is true in the device's policy.
   * @return value or {@code null} for none
   */
  public java.util.List<Display> getDisplays() {
    return displays;
  }

  /**
   * Detailed information about displays on the device. This information is only available if
   * displayInfoEnabled is true in the device's policy.
   * @param displays displays or {@code null} for none
   */
  public Device setDisplays(java.util.List<Display> displays) {
    this.displays = displays;
    return this;
  }

  /**
   * The time of device enrollment.
   * @return value or {@code null} for none
   */
  public String getEnrollmentTime() {
    return enrollmentTime;
  }

  /**
   * The time of device enrollment.
   * @param enrollmentTime enrollmentTime or {@code null} for none
   */
  public Device setEnrollmentTime(String enrollmentTime) {
    this.enrollmentTime = enrollmentTime;
    return this;
  }

  /**
   * If the device was enrolled with an enrollment token with additional data provided, this field
   * contains that data.
   * @return value or {@code null} for none
   */
  public java.lang.String getEnrollmentTokenData() {
    return enrollmentTokenData;
  }

  /**
   * If the device was enrolled with an enrollment token with additional data provided, this field
   * contains that data.
   * @param enrollmentTokenData enrollmentTokenData or {@code null} for none
   */
  public Device setEnrollmentTokenData(java.lang.String enrollmentTokenData) {
    this.enrollmentTokenData = enrollmentTokenData;
    return this;
  }

  /**
   * If the device was enrolled with an enrollment token, this field contains the name of the token.
   * @return value or {@code null} for none
   */
  public java.lang.String getEnrollmentTokenName() {
    return enrollmentTokenName;
  }

  /**
   * If the device was enrolled with an enrollment token, this field contains the name of the token.
   * @param enrollmentTokenName enrollmentTokenName or {@code null} for none
   */
  public Device setEnrollmentTokenName(java.lang.String enrollmentTokenName) {
    this.enrollmentTokenName = enrollmentTokenName;
    return this;
  }

  /**
   * Detailed information about the device hardware.
   * @return value or {@code null} for none
   */
  public HardwareInfo getHardwareInfo() {
    return hardwareInfo;
  }

  /**
   * Detailed information about the device hardware.
   * @param hardwareInfo hardwareInfo or {@code null} for none
   */
  public Device setHardwareInfo(HardwareInfo hardwareInfo) {
    this.hardwareInfo = hardwareInfo;
    return this;
  }

  /**
   * Hardware status samples in chronological order. This information is only available if
   * hardwareStatusEnabled is true in the device's policy.
   * @return value or {@code null} for none
   */
  public java.util.List<HardwareStatus> getHardwareStatusSamples() {
    return hardwareStatusSamples;
  }

  /**
   * Hardware status samples in chronological order. This information is only available if
   * hardwareStatusEnabled is true in the device's policy.
   * @param hardwareStatusSamples hardwareStatusSamples or {@code null} for none
   */
  public Device setHardwareStatusSamples(java.util.List<HardwareStatus> hardwareStatusSamples) {
    this.hardwareStatusSamples = hardwareStatusSamples;
    return this;
  }

  /**
   * Deprecated.
   * @return value or {@code null} for none
   */
  public String getLastPolicyComplianceReportTime() {
    return lastPolicyComplianceReportTime;
  }

  /**
   * Deprecated.
   * @param lastPolicyComplianceReportTime lastPolicyComplianceReportTime or {@code null} for none
   */
  public Device setLastPolicyComplianceReportTime(String lastPolicyComplianceReportTime) {
    this.lastPolicyComplianceReportTime = lastPolicyComplianceReportTime;
    return this;
  }

  /**
   * The last time the device fetched its policy.
   * @return value or {@code null} for none
   */
  public String getLastPolicySyncTime() {
    return lastPolicySyncTime;
  }

  /**
   * The last time the device fetched its policy.
   * @param lastPolicySyncTime lastPolicySyncTime or {@code null} for none
   */
  public Device setLastPolicySyncTime(String lastPolicySyncTime) {
    this.lastPolicySyncTime = lastPolicySyncTime;
    return this;
  }

  /**
   * The last time the device sent a status report.
   * @return value or {@code null} for none
   */
  public String getLastStatusReportTime() {
    return lastStatusReportTime;
  }

  /**
   * The last time the device sent a status report.
   * @param lastStatusReportTime lastStatusReportTime or {@code null} for none
   */
  public Device setLastStatusReportTime(String lastStatusReportTime) {
    this.lastStatusReportTime = lastStatusReportTime;
    return this;
  }

  /**
   * The type of management mode Android Device Policy takes on the device. This influences which
   * policy settings are supported.
   * @return value or {@code null} for none
   */
  public java.lang.String getManagementMode() {
    return managementMode;
  }

  /**
   * The type of management mode Android Device Policy takes on the device. This influences which
   * policy settings are supported.
   * @param managementMode managementMode or {@code null} for none
   */
  public Device setManagementMode(java.lang.String managementMode) {
    this.managementMode = managementMode;
    return this;
  }

  /**
   * Events related to memory and storage measurements in chronological order. This information is
   * only available if memoryInfoEnabled is true in the device's policy.
   * @return value or {@code null} for none
   */
  public java.util.List<MemoryEvent> getMemoryEvents() {
    return memoryEvents;
  }

  /**
   * Events related to memory and storage measurements in chronological order. This information is
   * only available if memoryInfoEnabled is true in the device's policy.
   * @param memoryEvents memoryEvents or {@code null} for none
   */
  public Device setMemoryEvents(java.util.List<MemoryEvent> memoryEvents) {
    this.memoryEvents = memoryEvents;
    return this;
  }

  /**
   * Memory information. This information is only available if memoryInfoEnabled is true in the
   * device's policy.
   * @return value or {@code null} for none
   */
  public MemoryInfo getMemoryInfo() {
    return memoryInfo;
  }

  /**
   * Memory information. This information is only available if memoryInfoEnabled is true in the
   * device's policy.
   * @param memoryInfo memoryInfo or {@code null} for none
   */
  public Device setMemoryInfo(MemoryInfo memoryInfo) {
    this.memoryInfo = memoryInfo;
    return this;
  }

  /**
   * The name of the device in the form enterprises/{enterpriseId}/devices/{deviceId}.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the device in the form enterprises/{enterpriseId}/devices/{deviceId}.
   * @param name name or {@code null} for none
   */
  public Device setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Device network information. This information is only available if networkInfoEnabled is true in
   * the device's policy.
   * @return value or {@code null} for none
   */
  public NetworkInfo getNetworkInfo() {
    return networkInfo;
  }

  /**
   * Device network information. This information is only available if networkInfoEnabled is true in
   * the device's policy.
   * @param networkInfo networkInfo or {@code null} for none
   */
  public Device setNetworkInfo(NetworkInfo networkInfo) {
    this.networkInfo = networkInfo;
    return this;
  }

  /**
   * Details about policy settings that the device is not compliant with.
   * @return value or {@code null} for none
   */
  public java.util.List<NonComplianceDetail> getNonComplianceDetails() {
    return nonComplianceDetails;
  }

  /**
   * Details about policy settings that the device is not compliant with.
   * @param nonComplianceDetails nonComplianceDetails or {@code null} for none
   */
  public Device setNonComplianceDetails(java.util.List<NonComplianceDetail> nonComplianceDetails) {
    this.nonComplianceDetails = nonComplianceDetails;
    return this;
  }

  /**
   * Whether the device is compliant with its policy.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPolicyCompliant() {
    return policyCompliant;
  }

  /**
   * Whether the device is compliant with its policy.
   * @param policyCompliant policyCompliant or {@code null} for none
   */
  public Device setPolicyCompliant(java.lang.Boolean policyCompliant) {
    this.policyCompliant = policyCompliant;
    return this;
  }

  /**
   * The name of the policy applied to the device, in the form
   * enterprises/{enterpriseId}/policies/{policyId}. If not specified, the policy_name for the
   * device's user is applied. This field can be modified by a patch request. You can specify only
   * the policyId when calling enterprises.devices.patch, as long as the policyId doesn’t contain
   * any slashes. The rest of the policy name is inferred.
   * @return value or {@code null} for none
   */
  public java.lang.String getPolicyName() {
    return policyName;
  }

  /**
   * The name of the policy applied to the device, in the form
   * enterprises/{enterpriseId}/policies/{policyId}. If not specified, the policy_name for the
   * device's user is applied. This field can be modified by a patch request. You can specify only
   * the policyId when calling enterprises.devices.patch, as long as the policyId doesn’t contain
   * any slashes. The rest of the policy name is inferred.
   * @param policyName policyName or {@code null} for none
   */
  public Device setPolicyName(java.lang.String policyName) {
    this.policyName = policyName;
    return this;
  }

  /**
   * Power management events on the device in chronological order. This information is only
   * available if powerManagementEventsEnabled is true in the device's policy.
   * @return value or {@code null} for none
   */
  public java.util.List<PowerManagementEvent> getPowerManagementEvents() {
    return powerManagementEvents;
  }

  /**
   * Power management events on the device in chronological order. This information is only
   * available if powerManagementEventsEnabled is true in the device's policy.
   * @param powerManagementEvents powerManagementEvents or {@code null} for none
   */
  public Device setPowerManagementEvents(java.util.List<PowerManagementEvent> powerManagementEvents) {
    this.powerManagementEvents = powerManagementEvents;
    return this;
  }

  /**
   * If the same physical device has been enrolled multiple times, this field contains its previous
   * device names. The serial number is used as the unique identifier to determine if the same
   * physical device has enrolled previously. The names are in chronological order.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPreviousDeviceNames() {
    return previousDeviceNames;
  }

  /**
   * If the same physical device has been enrolled multiple times, this field contains its previous
   * device names. The serial number is used as the unique identifier to determine if the same
   * physical device has enrolled previously. The names are in chronological order.
   * @param previousDeviceNames previousDeviceNames or {@code null} for none
   */
  public Device setPreviousDeviceNames(java.util.List<java.lang.String> previousDeviceNames) {
    this.previousDeviceNames = previousDeviceNames;
    return this;
  }

  /**
   * Detailed information about the device software. This information is only available if
   * softwareInfoEnabled is true in the device's policy.
   * @return value or {@code null} for none
   */
  public SoftwareInfo getSoftwareInfo() {
    return softwareInfo;
  }

  /**
   * Detailed information about the device software. This information is only available if
   * softwareInfoEnabled is true in the device's policy.
   * @param softwareInfo softwareInfo or {@code null} for none
   */
  public Device setSoftwareInfo(SoftwareInfo softwareInfo) {
    this.softwareInfo = softwareInfo;
    return this;
  }

  /**
   * The state to be applied to the device. This field can be modified by a patch request. Note that
   * when calling enterprises.devices.patch, ACTIVE and DISABLED are the only allowable values. To
   * enter the device into a DELETED state, call enterprises.devices.delete.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The state to be applied to the device. This field can be modified by a patch request. Note that
   * when calling enterprises.devices.patch, ACTIVE and DISABLED are the only allowable values. To
   * enter the device into a DELETED state, call enterprises.devices.delete.
   * @param state state or {@code null} for none
   */
  public Device setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * The user who owns the device.
   * @return value or {@code null} for none
   */
  public User getUser() {
    return user;
  }

  /**
   * The user who owns the device.
   * @param user user or {@code null} for none
   */
  public Device setUser(User user) {
    this.user = user;
    return this;
  }

  /**
   * The resource name of the user that owns this device in the form
   * enterprises/{enterpriseId}/users/{userId}.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserName() {
    return userName;
  }

  /**
   * The resource name of the user that owns this device in the form
   * enterprises/{enterpriseId}/users/{userId}.
   * @param userName userName or {@code null} for none
   */
  public Device setUserName(java.lang.String userName) {
    this.userName = userName;
    return this;
  }

  @Override
  public Device set(String fieldName, Object value) {
    return (Device) super.set(fieldName, value);
  }

  @Override
  public Device clone() {
    return (Device) super.clone();
  }

}

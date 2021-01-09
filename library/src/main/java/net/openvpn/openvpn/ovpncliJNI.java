package net.openvpn.openvpn;

public class ovpncliJNI
{
    static {
        swig_module_init();
    }
    
    public static final native boolean ClientAPI_Config_allowLocalLanAccess_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_allowLocalLanAccess_set(final long p0, final ClientAPI_Config p1, final boolean p2);
    
    public static final native boolean ClientAPI_Config_altProxy_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_altProxy_set(final long p0, final ClientAPI_Config p1, final boolean p2);
    
    public static final native boolean ClientAPI_Config_autologinSessions_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_autologinSessions_set(final long p0, final ClientAPI_Config p1, final boolean p2);
    
    public static final native long ClientAPI_Config_clockTickMS_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_clockTickMS_set(final long p0, final ClientAPI_Config p1, final long p2);
    
    public static final native String ClientAPI_Config_compressionMode_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_compressionMode_set(final long p0, final ClientAPI_Config p1, final String p2);
    
    public static final native int ClientAPI_Config_connTimeout_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_connTimeout_set(final long p0, final ClientAPI_Config p1, final int p2);
    
    public static final native long ClientAPI_Config_contentList_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_contentList_set(final long p0, final ClientAPI_Config p1, final long p2);
    
    public static final native String ClientAPI_Config_content_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_content_set(final long p0, final ClientAPI_Config p1, final String p2);
    
    public static final native boolean ClientAPI_Config_dco_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_dco_set(final long p0, final ClientAPI_Config p1, final boolean p2);
    
    public static final native int ClientAPI_Config_defaultKeyDirection_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_defaultKeyDirection_set(final long p0, final ClientAPI_Config p1, final int p2);
    
    public static final native boolean ClientAPI_Config_disableClientCert_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_disableClientCert_set(final long p0, final ClientAPI_Config p1, final boolean p2);
    
    public static final native boolean ClientAPI_Config_echo_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_echo_set(final long p0, final ClientAPI_Config p1, final boolean p2);
    
    public static final native String ClientAPI_Config_externalPkiAlias_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_externalPkiAlias_set(final long p0, final ClientAPI_Config p1, final String p2);
    
    public static final native boolean ClientAPI_Config_forceAesCbcCiphersuites_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_forceAesCbcCiphersuites_set(final long p0, final ClientAPI_Config p1, final boolean p2);
    
    public static final native boolean ClientAPI_Config_googleDnsFallback_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_googleDnsFallback_set(final long p0, final ClientAPI_Config p1, final boolean p2);
    
    public static final native String ClientAPI_Config_gremlinConfig_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_gremlinConfig_set(final long p0, final ClientAPI_Config p1, final String p2);
    
    public static final native String ClientAPI_Config_guiVersion_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_guiVersion_set(final long p0, final ClientAPI_Config p1, final String p2);
    
    public static final native String ClientAPI_Config_hwAddrOverride_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_hwAddrOverride_set(final long p0, final ClientAPI_Config p1, final String p2);
    
    public static final native boolean ClientAPI_Config_info_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_info_set(final long p0, final ClientAPI_Config p1, final boolean p2);
    
    public static final native String ClientAPI_Config_ipv6_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_ipv6_set(final long p0, final ClientAPI_Config p1, final String p2);
    
    public static final native long ClientAPI_Config_peerInfo_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_peerInfo_set(final long p0, final ClientAPI_Config p1, final long p2);
    
    public static final native String ClientAPI_Config_platformVersion_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_platformVersion_set(final long p0, final ClientAPI_Config p1, final String p2);
    
    public static final native String ClientAPI_Config_portOverride_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_portOverride_set(final long p0, final ClientAPI_Config p1, final String p2);
    
    public static final native String ClientAPI_Config_privateKeyPassword_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_privateKeyPassword_set(final long p0, final ClientAPI_Config p1, final String p2);
    
    public static final native String ClientAPI_Config_protoOverride_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_protoOverride_set(final long p0, final ClientAPI_Config p1, final String p2);
    
    public static final native boolean ClientAPI_Config_proxyAllowCleartextAuth_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_proxyAllowCleartextAuth_set(final long p0, final ClientAPI_Config p1, final boolean p2);
    
    public static final native String ClientAPI_Config_proxyHost_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_proxyHost_set(final long p0, final ClientAPI_Config p1, final String p2);
    
    public static final native String ClientAPI_Config_proxyPassword_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_proxyPassword_set(final long p0, final ClientAPI_Config p1, final String p2);
    
    public static final native String ClientAPI_Config_proxyPort_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_proxyPort_set(final long p0, final ClientAPI_Config p1, final String p2);
    
    public static final native String ClientAPI_Config_proxyUsername_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_proxyUsername_set(final long p0, final ClientAPI_Config p1, final String p2);
    
    public static final native boolean ClientAPI_Config_retryOnAuthFailed_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_retryOnAuthFailed_set(final long p0, final ClientAPI_Config p1, final boolean p2);
    
    public static final native String ClientAPI_Config_serverOverride_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_serverOverride_set(final long p0, final ClientAPI_Config p1, final String p2);
    
    public static final native int ClientAPI_Config_sslDebugLevel_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_sslDebugLevel_set(final long p0, final ClientAPI_Config p1, final int p2);
    
    public static final native String ClientAPI_Config_ssoMethods_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_ssoMethods_set(final long p0, final ClientAPI_Config p1, final String p2);
    
    public static final native boolean ClientAPI_Config_synchronousDnsLookup_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_synchronousDnsLookup_set(final long p0, final ClientAPI_Config p1, final boolean p2);
    
    public static final native String ClientAPI_Config_tlsCertProfileOverride_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_tlsCertProfileOverride_set(final long p0, final ClientAPI_Config p1, final String p2);
    
    public static final native String ClientAPI_Config_tlsVersionMinOverride_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_tlsVersionMinOverride_set(final long p0, final ClientAPI_Config p1, final String p2);
    
    public static final native boolean ClientAPI_Config_tunPersist_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_tunPersist_set(final long p0, final ClientAPI_Config p1, final boolean p2);
    
    public static final native boolean ClientAPI_Config_wintun_get(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_Config_wintun_set(final long p0, final ClientAPI_Config p1, final boolean p2);
    
    public static final native String ClientAPI_ConnectionInfo_clientIp_get(final long p0, final ClientAPI_ConnectionInfo p1);
    
    public static final native void ClientAPI_ConnectionInfo_clientIp_set(final long p0, final ClientAPI_ConnectionInfo p1, final String p2);
    
    public static final native boolean ClientAPI_ConnectionInfo_defined_get(final long p0, final ClientAPI_ConnectionInfo p1);
    
    public static final native void ClientAPI_ConnectionInfo_defined_set(final long p0, final ClientAPI_ConnectionInfo p1, final boolean p2);
    
    public static final native String ClientAPI_ConnectionInfo_gw4_get(final long p0, final ClientAPI_ConnectionInfo p1);
    
    public static final native void ClientAPI_ConnectionInfo_gw4_set(final long p0, final ClientAPI_ConnectionInfo p1, final String p2);
    
    public static final native String ClientAPI_ConnectionInfo_gw6_get(final long p0, final ClientAPI_ConnectionInfo p1);
    
    public static final native void ClientAPI_ConnectionInfo_gw6_set(final long p0, final ClientAPI_ConnectionInfo p1, final String p2);
    
    public static final native String ClientAPI_ConnectionInfo_serverHost_get(final long p0, final ClientAPI_ConnectionInfo p1);
    
    public static final native void ClientAPI_ConnectionInfo_serverHost_set(final long p0, final ClientAPI_ConnectionInfo p1, final String p2);
    
    public static final native String ClientAPI_ConnectionInfo_serverIp_get(final long p0, final ClientAPI_ConnectionInfo p1);
    
    public static final native void ClientAPI_ConnectionInfo_serverIp_set(final long p0, final ClientAPI_ConnectionInfo p1, final String p2);
    
    public static final native String ClientAPI_ConnectionInfo_serverPort_get(final long p0, final ClientAPI_ConnectionInfo p1);
    
    public static final native void ClientAPI_ConnectionInfo_serverPort_set(final long p0, final ClientAPI_ConnectionInfo p1, final String p2);
    
    public static final native String ClientAPI_ConnectionInfo_serverProto_get(final long p0, final ClientAPI_ConnectionInfo p1);
    
    public static final native void ClientAPI_ConnectionInfo_serverProto_set(final long p0, final ClientAPI_ConnectionInfo p1, final String p2);
    
    public static final native String ClientAPI_ConnectionInfo_tunName_get(final long p0, final ClientAPI_ConnectionInfo p1);
    
    public static final native void ClientAPI_ConnectionInfo_tunName_set(final long p0, final ClientAPI_ConnectionInfo p1, final String p2);
    
    public static final native String ClientAPI_ConnectionInfo_user_get(final long p0, final ClientAPI_ConnectionInfo p1);
    
    public static final native void ClientAPI_ConnectionInfo_user_set(final long p0, final ClientAPI_ConnectionInfo p1, final String p2);
    
    public static final native String ClientAPI_ConnectionInfo_vpnIp4_get(final long p0, final ClientAPI_ConnectionInfo p1);
    
    public static final native void ClientAPI_ConnectionInfo_vpnIp4_set(final long p0, final ClientAPI_ConnectionInfo p1, final String p2);
    
    public static final native String ClientAPI_ConnectionInfo_vpnIp6_get(final long p0, final ClientAPI_ConnectionInfo p1);
    
    public static final native void ClientAPI_ConnectionInfo_vpnIp6_set(final long p0, final ClientAPI_ConnectionInfo p1, final String p2);
    
    public static final native String ClientAPI_DynamicChallenge_challenge_get(final long p0, final ClientAPI_DynamicChallenge p1);
    
    public static final native void ClientAPI_DynamicChallenge_challenge_set(final long p0, final ClientAPI_DynamicChallenge p1, final String p2);
    
    public static final native boolean ClientAPI_DynamicChallenge_echo_get(final long p0, final ClientAPI_DynamicChallenge p1);
    
    public static final native void ClientAPI_DynamicChallenge_echo_set(final long p0, final ClientAPI_DynamicChallenge p1, final boolean p2);
    
    public static final native boolean ClientAPI_DynamicChallenge_responseRequired_get(final long p0, final ClientAPI_DynamicChallenge p1);
    
    public static final native void ClientAPI_DynamicChallenge_responseRequired_set(final long p0, final ClientAPI_DynamicChallenge p1, final boolean p2);
    
    public static final native String ClientAPI_DynamicChallenge_stateID_get(final long p0, final ClientAPI_DynamicChallenge p1);
    
    public static final native void ClientAPI_DynamicChallenge_stateID_set(final long p0, final ClientAPI_DynamicChallenge p1, final String p2);
    
    public static final native boolean ClientAPI_EvalConfig_allowPasswordSave_get(final long p0, final ClientAPI_EvalConfig p1);
    
    public static final native void ClientAPI_EvalConfig_allowPasswordSave_set(final long p0, final ClientAPI_EvalConfig p1, final boolean p2);
    
    public static final native boolean ClientAPI_EvalConfig_autologin_get(final long p0, final ClientAPI_EvalConfig p1);
    
    public static final native void ClientAPI_EvalConfig_autologin_set(final long p0, final ClientAPI_EvalConfig p1, final boolean p2);
    
    public static final native boolean ClientAPI_EvalConfig_error_get(final long p0, final ClientAPI_EvalConfig p1);
    
    public static final native void ClientAPI_EvalConfig_error_set(final long p0, final ClientAPI_EvalConfig p1, final boolean p2);
    
    public static final native boolean ClientAPI_EvalConfig_externalPki_get(final long p0, final ClientAPI_EvalConfig p1);
    
    public static final native void ClientAPI_EvalConfig_externalPki_set(final long p0, final ClientAPI_EvalConfig p1, final boolean p2);
    
    public static final native String ClientAPI_EvalConfig_friendlyName_get(final long p0, final ClientAPI_EvalConfig p1);
    
    public static final native void ClientAPI_EvalConfig_friendlyName_set(final long p0, final ClientAPI_EvalConfig p1, final String p2);
    
    public static final native String ClientAPI_EvalConfig_message_get(final long p0, final ClientAPI_EvalConfig p1);
    
    public static final native void ClientAPI_EvalConfig_message_set(final long p0, final ClientAPI_EvalConfig p1, final String p2);
    
    public static final native boolean ClientAPI_EvalConfig_privateKeyPasswordRequired_get(final long p0, final ClientAPI_EvalConfig p1);
    
    public static final native void ClientAPI_EvalConfig_privateKeyPasswordRequired_set(final long p0, final ClientAPI_EvalConfig p1, final boolean p2);
    
    public static final native String ClientAPI_EvalConfig_profileName_get(final long p0, final ClientAPI_EvalConfig p1);
    
    public static final native void ClientAPI_EvalConfig_profileName_set(final long p0, final ClientAPI_EvalConfig p1, final String p2);
    
    public static final native String ClientAPI_EvalConfig_remoteHost_get(final long p0, final ClientAPI_EvalConfig p1);
    
    public static final native void ClientAPI_EvalConfig_remoteHost_set(final long p0, final ClientAPI_EvalConfig p1, final String p2);
    
    public static final native String ClientAPI_EvalConfig_remotePort_get(final long p0, final ClientAPI_EvalConfig p1);
    
    public static final native void ClientAPI_EvalConfig_remotePort_set(final long p0, final ClientAPI_EvalConfig p1, final String p2);
    
    public static final native String ClientAPI_EvalConfig_remoteProto_get(final long p0, final ClientAPI_EvalConfig p1);
    
    public static final native void ClientAPI_EvalConfig_remoteProto_set(final long p0, final ClientAPI_EvalConfig p1, final String p2);
    
    public static final native long ClientAPI_EvalConfig_serverList_get(final long p0, final ClientAPI_EvalConfig p1);
    
    public static final native void ClientAPI_EvalConfig_serverList_set(final long p0, final ClientAPI_EvalConfig p1, final long p2, final ClientAPI_ServerEntryVector p3);
    
    public static final native boolean ClientAPI_EvalConfig_staticChallengeEcho_get(final long p0, final ClientAPI_EvalConfig p1);
    
    public static final native void ClientAPI_EvalConfig_staticChallengeEcho_set(final long p0, final ClientAPI_EvalConfig p1, final boolean p2);
    
    public static final native String ClientAPI_EvalConfig_staticChallenge_get(final long p0, final ClientAPI_EvalConfig p1);
    
    public static final native void ClientAPI_EvalConfig_staticChallenge_set(final long p0, final ClientAPI_EvalConfig p1, final String p2);
    
    public static final native String ClientAPI_EvalConfig_userlockedUsername_get(final long p0, final ClientAPI_EvalConfig p1);
    
    public static final native void ClientAPI_EvalConfig_userlockedUsername_set(final long p0, final ClientAPI_EvalConfig p1, final String p2);
    
    public static final native boolean ClientAPI_Event_error_get(final long p0, final ClientAPI_Event p1);
    
    public static final native void ClientAPI_Event_error_set(final long p0, final ClientAPI_Event p1, final boolean p2);
    
    public static final native boolean ClientAPI_Event_fatal_get(final long p0, final ClientAPI_Event p1);
    
    public static final native void ClientAPI_Event_fatal_set(final long p0, final ClientAPI_Event p1, final boolean p2);
    
    public static final native String ClientAPI_Event_info_get(final long p0, final ClientAPI_Event p1);
    
    public static final native void ClientAPI_Event_info_set(final long p0, final ClientAPI_Event p1, final String p2);
    
    public static final native String ClientAPI_Event_name_get(final long p0, final ClientAPI_Event p1);
    
    public static final native void ClientAPI_Event_name_set(final long p0, final ClientAPI_Event p1, final String p2);
    
    public static final native boolean ClientAPI_ExternalPKIBase_sign(final long p0, final ClientAPI_ExternalPKIBase p1, final String p2, final long p3, final String p4);
    
    public static final native long ClientAPI_ExternalPKICertRequest_SWIGUpcast(final long p0);
    
    public static final native String ClientAPI_ExternalPKICertRequest_cert_get(final long p0, final ClientAPI_ExternalPKICertRequest p1);
    
    public static final native void ClientAPI_ExternalPKICertRequest_cert_set(final long p0, final ClientAPI_ExternalPKICertRequest p1, final String p2);
    
    public static final native String ClientAPI_ExternalPKICertRequest_supportingChain_get(final long p0, final ClientAPI_ExternalPKICertRequest p1);
    
    public static final native void ClientAPI_ExternalPKICertRequest_supportingChain_set(final long p0, final ClientAPI_ExternalPKICertRequest p1, final String p2);
    
    public static final native String ClientAPI_ExternalPKIRequestBase_alias_get(final long p0, final ClientAPI_ExternalPKIRequestBase p1);
    
    public static final native void ClientAPI_ExternalPKIRequestBase_alias_set(final long p0, final ClientAPI_ExternalPKIRequestBase p1, final String p2);
    
    public static final native String ClientAPI_ExternalPKIRequestBase_errorText_get(final long p0, final ClientAPI_ExternalPKIRequestBase p1);
    
    public static final native void ClientAPI_ExternalPKIRequestBase_errorText_set(final long p0, final ClientAPI_ExternalPKIRequestBase p1, final String p2);
    
    public static final native boolean ClientAPI_ExternalPKIRequestBase_error_get(final long p0, final ClientAPI_ExternalPKIRequestBase p1);
    
    public static final native void ClientAPI_ExternalPKIRequestBase_error_set(final long p0, final ClientAPI_ExternalPKIRequestBase p1, final boolean p2);
    
    public static final native boolean ClientAPI_ExternalPKIRequestBase_invalidAlias_get(final long p0, final ClientAPI_ExternalPKIRequestBase p1);
    
    public static final native void ClientAPI_ExternalPKIRequestBase_invalidAlias_set(final long p0, final ClientAPI_ExternalPKIRequestBase p1, final boolean p2);
    
    public static final native long ClientAPI_ExternalPKISignRequest_SWIGUpcast(final long p0);
    
    public static final native String ClientAPI_ExternalPKISignRequest_algorithm_get(final long p0, final ClientAPI_ExternalPKISignRequest p1);
    
    public static final native void ClientAPI_ExternalPKISignRequest_algorithm_set(final long p0, final ClientAPI_ExternalPKISignRequest p1, final String p2);
    
    public static final native String ClientAPI_ExternalPKISignRequest_data_get(final long p0, final ClientAPI_ExternalPKISignRequest p1);
    
    public static final native void ClientAPI_ExternalPKISignRequest_data_set(final long p0, final ClientAPI_ExternalPKISignRequest p1, final String p2);
    
    public static final native String ClientAPI_ExternalPKISignRequest_sig_get(final long p0, final ClientAPI_ExternalPKISignRequest p1);
    
    public static final native void ClientAPI_ExternalPKISignRequest_sig_set(final long p0, final ClientAPI_ExternalPKISignRequest p1, final String p2);
    
    public static final native long ClientAPI_InterfaceStats_bytesIn_get(final long p0, final ClientAPI_InterfaceStats p1);
    
    public static final native void ClientAPI_InterfaceStats_bytesIn_set(final long p0, final ClientAPI_InterfaceStats p1, final long p2);
    
    public static final native long ClientAPI_InterfaceStats_bytesOut_get(final long p0, final ClientAPI_InterfaceStats p1);
    
    public static final native void ClientAPI_InterfaceStats_bytesOut_set(final long p0, final ClientAPI_InterfaceStats p1, final long p2);
    
    public static final native long ClientAPI_InterfaceStats_errorsIn_get(final long p0, final ClientAPI_InterfaceStats p1);
    
    public static final native void ClientAPI_InterfaceStats_errorsIn_set(final long p0, final ClientAPI_InterfaceStats p1, final long p2);
    
    public static final native long ClientAPI_InterfaceStats_errorsOut_get(final long p0, final ClientAPI_InterfaceStats p1);
    
    public static final native void ClientAPI_InterfaceStats_errorsOut_set(final long p0, final ClientAPI_InterfaceStats p1, final long p2);
    
    public static final native long ClientAPI_InterfaceStats_packetsIn_get(final long p0, final ClientAPI_InterfaceStats p1);
    
    public static final native void ClientAPI_InterfaceStats_packetsIn_set(final long p0, final ClientAPI_InterfaceStats p1, final long p2);
    
    public static final native long ClientAPI_InterfaceStats_packetsOut_get(final long p0, final ClientAPI_InterfaceStats p1);
    
    public static final native void ClientAPI_InterfaceStats_packetsOut_set(final long p0, final ClientAPI_InterfaceStats p1, final long p2);
    
    public static final native String ClientAPI_KeyValue_key_get(final long p0, final ClientAPI_KeyValue p1);
    
    public static final native void ClientAPI_KeyValue_key_set(final long p0, final ClientAPI_KeyValue p1, final String p2);
    
    public static final native String ClientAPI_KeyValue_value_get(final long p0, final ClientAPI_KeyValue p1);
    
    public static final native void ClientAPI_KeyValue_value_set(final long p0, final ClientAPI_KeyValue p1, final String p2);
    
    public static final native long ClientAPI_LLVector_capacity(final long p0, final ClientAPI_LLVector p1);
    
    public static final native void ClientAPI_LLVector_clear(final long p0, final ClientAPI_LLVector p1);
    
    public static final native void ClientAPI_LLVector_doAdd__SWIG_0(final long p0, final ClientAPI_LLVector p1, final long p2);
    
    public static final native void ClientAPI_LLVector_doAdd__SWIG_1(final long p0, final ClientAPI_LLVector p1, final int p2, final long p3);
    
    public static final native long ClientAPI_LLVector_doGet(final long p0, final ClientAPI_LLVector p1, final int p2);
    
    public static final native long ClientAPI_LLVector_doRemove(final long p0, final ClientAPI_LLVector p1, final int p2);
    
    public static final native void ClientAPI_LLVector_doRemoveRange(final long p0, final ClientAPI_LLVector p1, final int p2, final int p3);
    
    public static final native long ClientAPI_LLVector_doSet(final long p0, final ClientAPI_LLVector p1, final int p2, final long p3);
    
    public static final native int ClientAPI_LLVector_doSize(final long p0, final ClientAPI_LLVector p1);
    
    public static final native boolean ClientAPI_LLVector_isEmpty(final long p0, final ClientAPI_LLVector p1);
    
    public static final native void ClientAPI_LLVector_reserve(final long p0, final ClientAPI_LLVector p1, final long p2);
    
    public static final native String ClientAPI_LogInfo_text_get(final long p0, final ClientAPI_LogInfo p1);
    
    public static final native void ClientAPI_LogInfo_text_set(final long p0, final ClientAPI_LogInfo p1, final String p2);
    
    public static final native String ClientAPI_MergeConfig_basename_get(final long p0, final ClientAPI_MergeConfig p1);
    
    public static final native void ClientAPI_MergeConfig_basename_set(final long p0, final ClientAPI_MergeConfig p1, final String p2);
    
    public static final native String ClientAPI_MergeConfig_errorText_get(final long p0, final ClientAPI_MergeConfig p1);
    
    public static final native void ClientAPI_MergeConfig_errorText_set(final long p0, final ClientAPI_MergeConfig p1, final String p2);
    
    public static final native String ClientAPI_MergeConfig_profileContent_get(final long p0, final ClientAPI_MergeConfig p1);
    
    public static final native void ClientAPI_MergeConfig_profileContent_set(final long p0, final ClientAPI_MergeConfig p1, final String p2);
    
    public static final native long ClientAPI_MergeConfig_refPathList_get(final long p0, final ClientAPI_MergeConfig p1);
    
    public static final native void ClientAPI_MergeConfig_refPathList_set(final long p0, final ClientAPI_MergeConfig p1, final long p2, final ClientAPI_StringVec p3);
    
    public static final native String ClientAPI_MergeConfig_status_get(final long p0, final ClientAPI_MergeConfig p1);
    
    public static final native void ClientAPI_MergeConfig_status_set(final long p0, final ClientAPI_MergeConfig p1, final String p2);
    
    public static final native long ClientAPI_OpenVPNClient_SWIGUpcast(final long p0);
    
    public static final native int ClientAPI_OpenVPNClient_app_expire();
    
    public static final native void ClientAPI_OpenVPNClient_change_ownership(final ClientAPI_OpenVPNClient p0, final long p1, final boolean p2);
    
    public static final native void ClientAPI_OpenVPNClient_clock_tick(final long p0, final ClientAPI_OpenVPNClient p1);
    
    public static final native void ClientAPI_OpenVPNClient_clock_tickSwigExplicitClientAPI_OpenVPNClient(final long p0, final ClientAPI_OpenVPNClient p1);
    
    public static final native long ClientAPI_OpenVPNClient_connect(final long p0, final ClientAPI_OpenVPNClient p1);
    
    public static final native long ClientAPI_OpenVPNClient_connection_info(final long p0, final ClientAPI_OpenVPNClient p1);
    
    public static final native String ClientAPI_OpenVPNClient_copyright();
    
    public static final native String ClientAPI_OpenVPNClient_crypto_self_test();
    
    public static final native void ClientAPI_OpenVPNClient_director_connect(final ClientAPI_OpenVPNClient p0, final long p1, final boolean p2, final boolean p3);
    
    public static final native long ClientAPI_OpenVPNClient_eval_config(final long p0, final ClientAPI_OpenVPNClient p1, final long p2, final ClientAPI_Config p3);
    
    public static final native long ClientAPI_OpenVPNClient_eval_config_static(final long p0, final ClientAPI_Config p1);
    
    public static final native void ClientAPI_OpenVPNClient_event(final long p0, final ClientAPI_OpenVPNClient p1, final long p2, final ClientAPI_Event p3);
    
    public static final native void ClientAPI_OpenVPNClient_external_pki_cert_request(final long p0, final ClientAPI_OpenVPNClient p1, final long p2, final ClientAPI_ExternalPKICertRequest p3);
    
    public static final native void ClientAPI_OpenVPNClient_external_pki_sign_request(final long p0, final ClientAPI_OpenVPNClient p1, final long p2, final ClientAPI_ExternalPKISignRequest p3);
    
    public static final native void ClientAPI_OpenVPNClient_init_process();
    
    public static final native void ClientAPI_OpenVPNClient_log(final long p0, final ClientAPI_OpenVPNClient p1, final long p2, final ClientAPI_LogInfo p3);
    
    public static final native int ClientAPI_OpenVPNClient_max_profile_size();
    
    public static final native long ClientAPI_OpenVPNClient_merge_config_static(final String p0, final boolean p1);
    
    public static final native long ClientAPI_OpenVPNClient_merge_config_string_static(final String p0);
    
    public static final native boolean ClientAPI_OpenVPNClient_parse_dynamic_challenge(final String p0, final long p1, final ClientAPI_DynamicChallenge p2);
    
    public static final native void ClientAPI_OpenVPNClient_pause(final long p0, final ClientAPI_OpenVPNClient p1, final String p2);
    
    public static final native boolean ClientAPI_OpenVPNClient_pause_on_connection_timeout(final long p0, final ClientAPI_OpenVPNClient p1);
    
    public static final native String ClientAPI_OpenVPNClient_platform();
    
    public static final native void ClientAPI_OpenVPNClient_post_cc_msg(final long p0, final ClientAPI_OpenVPNClient p1, final String p2);
    
    public static final native long ClientAPI_OpenVPNClient_provide_creds(final long p0, final ClientAPI_OpenVPNClient p1, final long p2, final ClientAPI_ProvideCreds p3);
    
    public static final native void ClientAPI_OpenVPNClient_reconnect(final long p0, final ClientAPI_OpenVPNClient p1, final int p2);
    
    public static final native void ClientAPI_OpenVPNClient_remote_override(final long p0, final ClientAPI_OpenVPNClient p1, final long p2, final ClientAPI_RemoteOverride p3);
    
    public static final native void ClientAPI_OpenVPNClient_remote_overrideSwigExplicitClientAPI_OpenVPNClient(final long p0, final ClientAPI_OpenVPNClient p1, final long p2, final ClientAPI_RemoteOverride p3);
    
    public static final native boolean ClientAPI_OpenVPNClient_remote_override_enabled(final long p0, final ClientAPI_OpenVPNClient p1);
    
    public static final native boolean ClientAPI_OpenVPNClient_remote_override_enabledSwigExplicitClientAPI_OpenVPNClient(final long p0, final ClientAPI_OpenVPNClient p1);
    
    public static final native void ClientAPI_OpenVPNClient_resume(final long p0, final ClientAPI_OpenVPNClient p1);
    
    public static final native boolean ClientAPI_OpenVPNClient_session_token(final long p0, final ClientAPI_OpenVPNClient p1, final long p2, final ClientAPI_SessionToken p3);
    
    public static final native boolean ClientAPI_OpenVPNClient_socket_protect(final long p0, final ClientAPI_OpenVPNClient p1, final int p2, final String p3, final boolean p4);
    
    public static final native boolean ClientAPI_OpenVPNClient_socket_protectSwigExplicitClientAPI_OpenVPNClient(final long p0, final ClientAPI_OpenVPNClient p1, final int p2, final String p3, final boolean p4);
    
    public static final native long ClientAPI_OpenVPNClient_stats_bundle(final long p0, final ClientAPI_OpenVPNClient p1);
    
    public static final native int ClientAPI_OpenVPNClient_stats_n();
    
    public static final native String ClientAPI_OpenVPNClient_stats_name(final int p0);
    
    public static final native long ClientAPI_OpenVPNClient_stats_value(final long p0, final ClientAPI_OpenVPNClient p1, final int p2);
    
    public static final native void ClientAPI_OpenVPNClient_stop(final long p0, final ClientAPI_OpenVPNClient p1);
    
    public static final native long ClientAPI_OpenVPNClient_transport_stats(final long p0, final ClientAPI_OpenVPNClient p1);
    
    public static final native long ClientAPI_OpenVPNClient_tun_stats(final long p0, final ClientAPI_OpenVPNClient p1);
    
    public static final native void ClientAPI_OpenVPNClient_uninit_process();
    
    public static final native boolean ClientAPI_ProvideCreds_cachePassword_get(final long p0, final ClientAPI_ProvideCreds p1);
    
    public static final native void ClientAPI_ProvideCreds_cachePassword_set(final long p0, final ClientAPI_ProvideCreds p1, final boolean p2);
    
    public static final native String ClientAPI_ProvideCreds_dynamicChallengeCookie_get(final long p0, final ClientAPI_ProvideCreds p1);
    
    public static final native void ClientAPI_ProvideCreds_dynamicChallengeCookie_set(final long p0, final ClientAPI_ProvideCreds p1, final String p2);
    
    public static final native String ClientAPI_ProvideCreds_password_get(final long p0, final ClientAPI_ProvideCreds p1);
    
    public static final native void ClientAPI_ProvideCreds_password_set(final long p0, final ClientAPI_ProvideCreds p1, final String p2);
    
    public static final native boolean ClientAPI_ProvideCreds_replacePasswordWithSessionID_get(final long p0, final ClientAPI_ProvideCreds p1);
    
    public static final native void ClientAPI_ProvideCreds_replacePasswordWithSessionID_set(final long p0, final ClientAPI_ProvideCreds p1, final boolean p2);
    
    public static final native String ClientAPI_ProvideCreds_response_get(final long p0, final ClientAPI_ProvideCreds p1);
    
    public static final native void ClientAPI_ProvideCreds_response_set(final long p0, final ClientAPI_ProvideCreds p1, final String p2);
    
    public static final native String ClientAPI_ProvideCreds_username_get(final long p0, final ClientAPI_ProvideCreds p1);
    
    public static final native void ClientAPI_ProvideCreds_username_set(final long p0, final ClientAPI_ProvideCreds p1, final String p2);
    
    public static final native String ClientAPI_RemoteOverride_error_get(final long p0, final ClientAPI_RemoteOverride p1);
    
    public static final native void ClientAPI_RemoteOverride_error_set(final long p0, final ClientAPI_RemoteOverride p1, final String p2);
    
    public static final native String ClientAPI_RemoteOverride_host_get(final long p0, final ClientAPI_RemoteOverride p1);
    
    public static final native void ClientAPI_RemoteOverride_host_set(final long p0, final ClientAPI_RemoteOverride p1, final String p2);
    
    public static final native String ClientAPI_RemoteOverride_ip_get(final long p0, final ClientAPI_RemoteOverride p1);
    
    public static final native void ClientAPI_RemoteOverride_ip_set(final long p0, final ClientAPI_RemoteOverride p1, final String p2);
    
    public static final native String ClientAPI_RemoteOverride_port_get(final long p0, final ClientAPI_RemoteOverride p1);
    
    public static final native void ClientAPI_RemoteOverride_port_set(final long p0, final ClientAPI_RemoteOverride p1, final String p2);
    
    public static final native String ClientAPI_RemoteOverride_proto_get(final long p0, final ClientAPI_RemoteOverride p1);
    
    public static final native void ClientAPI_RemoteOverride_proto_set(final long p0, final ClientAPI_RemoteOverride p1, final String p2);
    
    public static final native long ClientAPI_ServerEntryVector_capacity(final long p0, final ClientAPI_ServerEntryVector p1);
    
    public static final native void ClientAPI_ServerEntryVector_clear(final long p0, final ClientAPI_ServerEntryVector p1);
    
    public static final native void ClientAPI_ServerEntryVector_doAdd__SWIG_0(final long p0, final ClientAPI_ServerEntryVector p1, final long p2, final ClientAPI_ServerEntry p3);
    
    public static final native void ClientAPI_ServerEntryVector_doAdd__SWIG_1(final long p0, final ClientAPI_ServerEntryVector p1, final int p2, final long p3, final ClientAPI_ServerEntry p4);
    
    public static final native long ClientAPI_ServerEntryVector_doGet(final long p0, final ClientAPI_ServerEntryVector p1, final int p2);
    
    public static final native long ClientAPI_ServerEntryVector_doRemove(final long p0, final ClientAPI_ServerEntryVector p1, final int p2);
    
    public static final native void ClientAPI_ServerEntryVector_doRemoveRange(final long p0, final ClientAPI_ServerEntryVector p1, final int p2, final int p3);
    
    public static final native long ClientAPI_ServerEntryVector_doSet(final long p0, final ClientAPI_ServerEntryVector p1, final int p2, final long p3, final ClientAPI_ServerEntry p4);
    
    public static final native int ClientAPI_ServerEntryVector_doSize(final long p0, final ClientAPI_ServerEntryVector p1);
    
    public static final native boolean ClientAPI_ServerEntryVector_isEmpty(final long p0, final ClientAPI_ServerEntryVector p1);
    
    public static final native void ClientAPI_ServerEntryVector_reserve(final long p0, final ClientAPI_ServerEntryVector p1, final long p2);
    
    public static final native String ClientAPI_ServerEntry_friendlyName_get(final long p0, final ClientAPI_ServerEntry p1);
    
    public static final native void ClientAPI_ServerEntry_friendlyName_set(final long p0, final ClientAPI_ServerEntry p1, final String p2);
    
    public static final native String ClientAPI_ServerEntry_server_get(final long p0, final ClientAPI_ServerEntry p1);
    
    public static final native void ClientAPI_ServerEntry_server_set(final long p0, final ClientAPI_ServerEntry p1, final String p2);
    
    public static final native String ClientAPI_SessionToken_session_id_get(final long p0, final ClientAPI_SessionToken p1);
    
    public static final native void ClientAPI_SessionToken_session_id_set(final long p0, final ClientAPI_SessionToken p1, final String p2);
    
    public static final native String ClientAPI_SessionToken_username_get(final long p0, final ClientAPI_SessionToken p1);
    
    public static final native void ClientAPI_SessionToken_username_set(final long p0, final ClientAPI_SessionToken p1, final String p2);
    
    public static final native boolean ClientAPI_Status_error_get(final long p0, final ClientAPI_Status p1);
    
    public static final native void ClientAPI_Status_error_set(final long p0, final ClientAPI_Status p1, final boolean p2);
    
    public static final native String ClientAPI_Status_message_get(final long p0, final ClientAPI_Status p1);
    
    public static final native void ClientAPI_Status_message_set(final long p0, final ClientAPI_Status p1, final String p2);
    
    public static final native String ClientAPI_Status_status_get(final long p0, final ClientAPI_Status p1);
    
    public static final native void ClientAPI_Status_status_set(final long p0, final ClientAPI_Status p1, final String p2);
    
    public static final native long ClientAPI_StringVec_capacity(final long p0, final ClientAPI_StringVec p1);
    
    public static final native void ClientAPI_StringVec_clear(final long p0, final ClientAPI_StringVec p1);
    
    public static final native void ClientAPI_StringVec_doAdd__SWIG_0(final long p0, final ClientAPI_StringVec p1, final String p2);
    
    public static final native void ClientAPI_StringVec_doAdd__SWIG_1(final long p0, final ClientAPI_StringVec p1, final int p2, final String p3);
    
    public static final native String ClientAPI_StringVec_doGet(final long p0, final ClientAPI_StringVec p1, final int p2);
    
    public static final native String ClientAPI_StringVec_doRemove(final long p0, final ClientAPI_StringVec p1, final int p2);
    
    public static final native void ClientAPI_StringVec_doRemoveRange(final long p0, final ClientAPI_StringVec p1, final int p2, final int p3);
    
    public static final native String ClientAPI_StringVec_doSet(final long p0, final ClientAPI_StringVec p1, final int p2, final String p3);
    
    public static final native int ClientAPI_StringVec_doSize(final long p0, final ClientAPI_StringVec p1);
    
    public static final native boolean ClientAPI_StringVec_isEmpty(final long p0, final ClientAPI_StringVec p1);
    
    public static final native void ClientAPI_StringVec_reserve(final long p0, final ClientAPI_StringVec p1, final long p2);
    
    public static final native long ClientAPI_TransportStats_bytesIn_get(final long p0, final ClientAPI_TransportStats p1);
    
    public static final native void ClientAPI_TransportStats_bytesIn_set(final long p0, final ClientAPI_TransportStats p1, final long p2);
    
    public static final native long ClientAPI_TransportStats_bytesOut_get(final long p0, final ClientAPI_TransportStats p1);
    
    public static final native void ClientAPI_TransportStats_bytesOut_set(final long p0, final ClientAPI_TransportStats p1, final long p2);
    
    public static final native int ClientAPI_TransportStats_lastPacketReceived_get(final long p0, final ClientAPI_TransportStats p1);
    
    public static final native void ClientAPI_TransportStats_lastPacketReceived_set(final long p0, final ClientAPI_TransportStats p1, final int p2);
    
    public static final native long ClientAPI_TransportStats_packetsIn_get(final long p0, final ClientAPI_TransportStats p1);
    
    public static final native void ClientAPI_TransportStats_packetsIn_set(final long p0, final ClientAPI_TransportStats p1, final long p2);
    
    public static final native long ClientAPI_TransportStats_packetsOut_get(final long p0, final ClientAPI_TransportStats p1);
    
    public static final native void ClientAPI_TransportStats_packetsOut_set(final long p0, final ClientAPI_TransportStats p1, final long p2);
    
    public static final native boolean ClientAPI_TunBuilderBase_tun_builder_add_address(final long p0, final ClientAPI_TunBuilderBase p1, final String p2, final int p3, final String p4, final boolean p5, final boolean p6);
    
    public static final native boolean ClientAPI_TunBuilderBase_tun_builder_add_dns_server(final long p0, final ClientAPI_TunBuilderBase p1, final String p2, final boolean p3);
    
    public static final native boolean ClientAPI_TunBuilderBase_tun_builder_add_proxy_bypass(final long p0, final ClientAPI_TunBuilderBase p1, final String p2);
    
    public static final native boolean ClientAPI_TunBuilderBase_tun_builder_add_route(final long p0, final ClientAPI_TunBuilderBase p1, final String p2, final int p3, final int p4, final boolean p5);
    
    public static final native boolean ClientAPI_TunBuilderBase_tun_builder_add_search_domain(final long p0, final ClientAPI_TunBuilderBase p1, final String p2);
    
    public static final native boolean ClientAPI_TunBuilderBase_tun_builder_add_wins_server(final long p0, final ClientAPI_TunBuilderBase p1, final String p2);
    
    public static final native int ClientAPI_TunBuilderBase_tun_builder_establish(final long p0, final ClientAPI_TunBuilderBase p1);
    
    public static final native void ClientAPI_TunBuilderBase_tun_builder_establish_lite(final long p0, final ClientAPI_TunBuilderBase p1);
    
    public static final native boolean ClientAPI_TunBuilderBase_tun_builder_exclude_route(final long p0, final ClientAPI_TunBuilderBase p1, final String p2, final int p3, final int p4, final boolean p5);
    
    public static final native long ClientAPI_TunBuilderBase_tun_builder_get_local_networks(final long p0, final ClientAPI_TunBuilderBase p1, final boolean p2);
    
    public static final native boolean ClientAPI_TunBuilderBase_tun_builder_new(final long p0, final ClientAPI_TunBuilderBase p1);
    
    public static final native boolean ClientAPI_TunBuilderBase_tun_builder_persist(final long p0, final ClientAPI_TunBuilderBase p1);
    
    public static final native boolean ClientAPI_TunBuilderBase_tun_builder_reroute_gw(final long p0, final ClientAPI_TunBuilderBase p1, final boolean p2, final boolean p3, final long p4);
    
    public static final native boolean ClientAPI_TunBuilderBase_tun_builder_set_adapter_domain_suffix(final long p0, final ClientAPI_TunBuilderBase p1, final String p2);
    
    public static final native boolean ClientAPI_TunBuilderBase_tun_builder_set_block_ipv6(final long p0, final ClientAPI_TunBuilderBase p1, final boolean p2);
    
    public static final native boolean ClientAPI_TunBuilderBase_tun_builder_set_layer(final long p0, final ClientAPI_TunBuilderBase p1, final int p2);
    
    public static final native boolean ClientAPI_TunBuilderBase_tun_builder_set_mtu(final long p0, final ClientAPI_TunBuilderBase p1, final int p2);
    
    public static final native boolean ClientAPI_TunBuilderBase_tun_builder_set_proxy_auto_config_url(final long p0, final ClientAPI_TunBuilderBase p1, final String p2);
    
    public static final native boolean ClientAPI_TunBuilderBase_tun_builder_set_proxy_http(final long p0, final ClientAPI_TunBuilderBase p1, final String p2, final int p3);
    
    public static final native boolean ClientAPI_TunBuilderBase_tun_builder_set_proxy_https(final long p0, final ClientAPI_TunBuilderBase p1, final String p2, final int p3);
    
    public static final native boolean ClientAPI_TunBuilderBase_tun_builder_set_remote_address(final long p0, final ClientAPI_TunBuilderBase p1, final String p2, final boolean p3);
    
    public static final native boolean ClientAPI_TunBuilderBase_tun_builder_set_route_metric_default(final long p0, final ClientAPI_TunBuilderBase p1, final int p2);
    
    public static final native boolean ClientAPI_TunBuilderBase_tun_builder_set_session_name(final long p0, final ClientAPI_TunBuilderBase p1, final String p2);
    
    public static final native void ClientAPI_TunBuilderBase_tun_builder_teardown(final long p0, final ClientAPI_TunBuilderBase p1, final boolean p2);
    
    public static void SwigDirector_ClientAPI_OpenVPNClient_clock_tick(final ClientAPI_OpenVPNClient clientAPI_OpenVPNClient) {
        clientAPI_OpenVPNClient.clock_tick();
    }
    
    public static void SwigDirector_ClientAPI_OpenVPNClient_event(final ClientAPI_OpenVPNClient clientAPI_OpenVPNClient, final long n) {
        clientAPI_OpenVPNClient.event(new ClientAPI_Event(n, false));
    }
    
    public static void SwigDirector_ClientAPI_OpenVPNClient_external_pki_cert_request(final ClientAPI_OpenVPNClient clientAPI_OpenVPNClient, final long n) {
        clientAPI_OpenVPNClient.external_pki_cert_request(new ClientAPI_ExternalPKICertRequest(n, false));
    }
    
    public static void SwigDirector_ClientAPI_OpenVPNClient_external_pki_sign_request(final ClientAPI_OpenVPNClient clientAPI_OpenVPNClient, final long n) {
        clientAPI_OpenVPNClient.external_pki_sign_request(new ClientAPI_ExternalPKISignRequest(n, false));
    }
    
    public static void SwigDirector_ClientAPI_OpenVPNClient_log(final ClientAPI_OpenVPNClient clientAPI_OpenVPNClient, final long n) {
        clientAPI_OpenVPNClient.log(new ClientAPI_LogInfo(n, false));
    }
    
    public static boolean SwigDirector_ClientAPI_OpenVPNClient_pause_on_connection_timeout(final ClientAPI_OpenVPNClient clientAPI_OpenVPNClient) {
        return clientAPI_OpenVPNClient.pause_on_connection_timeout();
    }
    
    public static void SwigDirector_ClientAPI_OpenVPNClient_remote_override(final ClientAPI_OpenVPNClient clientAPI_OpenVPNClient, final long n) {
        clientAPI_OpenVPNClient.remote_override(new ClientAPI_RemoteOverride(n, false));
    }
    
    public static boolean SwigDirector_ClientAPI_OpenVPNClient_remote_override_enabled(final ClientAPI_OpenVPNClient clientAPI_OpenVPNClient) {
        return clientAPI_OpenVPNClient.remote_override_enabled();
    }
    
    public static boolean SwigDirector_ClientAPI_OpenVPNClient_socket_protect(final ClientAPI_OpenVPNClient clientAPI_OpenVPNClient, final int n, final String s, final boolean b) {
        return clientAPI_OpenVPNClient.socket_protect(n, s, b);
    }
    
    public static boolean SwigDirector_ClientAPI_OpenVPNClient_tun_builder_add_address(final ClientAPI_OpenVPNClient clientAPI_OpenVPNClient, final String s, final int n, final String s2, final boolean b, final boolean b2) {
        return clientAPI_OpenVPNClient.tun_builder_add_address(s, n, s2, b, b2);
    }
    
    public static boolean SwigDirector_ClientAPI_OpenVPNClient_tun_builder_add_dns_server(final ClientAPI_OpenVPNClient clientAPI_OpenVPNClient, final String s, final boolean b) {
        return clientAPI_OpenVPNClient.tun_builder_add_dns_server(s, b);
    }
    
    public static boolean SwigDirector_ClientAPI_OpenVPNClient_tun_builder_add_proxy_bypass(final ClientAPI_OpenVPNClient clientAPI_OpenVPNClient, final String s) {
        return clientAPI_OpenVPNClient.tun_builder_add_proxy_bypass(s);
    }
    
    public static boolean SwigDirector_ClientAPI_OpenVPNClient_tun_builder_add_route(final ClientAPI_OpenVPNClient clientAPI_OpenVPNClient, final String s, final int n, final int n2, final boolean b) {
        return clientAPI_OpenVPNClient.tun_builder_add_route(s, n, n2, b);
    }
    
    public static boolean SwigDirector_ClientAPI_OpenVPNClient_tun_builder_add_search_domain(final ClientAPI_OpenVPNClient clientAPI_OpenVPNClient, final String s) {
        return clientAPI_OpenVPNClient.tun_builder_add_search_domain(s);
    }
    
    public static boolean SwigDirector_ClientAPI_OpenVPNClient_tun_builder_add_wins_server(final ClientAPI_OpenVPNClient clientAPI_OpenVPNClient, final String s) {
        return clientAPI_OpenVPNClient.tun_builder_add_wins_server(s);
    }
    
    public static int SwigDirector_ClientAPI_OpenVPNClient_tun_builder_establish(final ClientAPI_OpenVPNClient clientAPI_OpenVPNClient) {
        return clientAPI_OpenVPNClient.tun_builder_establish();
    }
    
    public static void SwigDirector_ClientAPI_OpenVPNClient_tun_builder_establish_lite(final ClientAPI_OpenVPNClient clientAPI_OpenVPNClient) {
        clientAPI_OpenVPNClient.tun_builder_establish_lite();
    }
    
    public static boolean SwigDirector_ClientAPI_OpenVPNClient_tun_builder_exclude_route(final ClientAPI_OpenVPNClient clientAPI_OpenVPNClient, final String s, final int n, final int n2, final boolean b) {
        return clientAPI_OpenVPNClient.tun_builder_exclude_route(s, n, n2, b);
    }
    
    public static long SwigDirector_ClientAPI_OpenVPNClient_tun_builder_get_local_networks(final ClientAPI_OpenVPNClient clientAPI_OpenVPNClient, final boolean b) {
        return ClientAPI_StringVec.getCPtr(clientAPI_OpenVPNClient.tun_builder_get_local_networks(b));
    }
    
    public static boolean SwigDirector_ClientAPI_OpenVPNClient_tun_builder_new(final ClientAPI_OpenVPNClient clientAPI_OpenVPNClient) {
        return clientAPI_OpenVPNClient.tun_builder_new();
    }
    
    public static boolean SwigDirector_ClientAPI_OpenVPNClient_tun_builder_persist(final ClientAPI_OpenVPNClient clientAPI_OpenVPNClient) {
        return clientAPI_OpenVPNClient.tun_builder_persist();
    }
    
    public static boolean SwigDirector_ClientAPI_OpenVPNClient_tun_builder_reroute_gw(final ClientAPI_OpenVPNClient clientAPI_OpenVPNClient, final boolean b, final boolean b2, final long n) {
        return clientAPI_OpenVPNClient.tun_builder_reroute_gw(b, b2, n);
    }
    
    public static boolean SwigDirector_ClientAPI_OpenVPNClient_tun_builder_set_adapter_domain_suffix(final ClientAPI_OpenVPNClient clientAPI_OpenVPNClient, final String s) {
        return clientAPI_OpenVPNClient.tun_builder_set_adapter_domain_suffix(s);
    }
    
    public static boolean SwigDirector_ClientAPI_OpenVPNClient_tun_builder_set_block_ipv6(final ClientAPI_OpenVPNClient clientAPI_OpenVPNClient, final boolean b) {
        return clientAPI_OpenVPNClient.tun_builder_set_block_ipv6(b);
    }
    
    public static boolean SwigDirector_ClientAPI_OpenVPNClient_tun_builder_set_layer(final ClientAPI_OpenVPNClient clientAPI_OpenVPNClient, final int n) {
        return clientAPI_OpenVPNClient.tun_builder_set_layer(n);
    }
    
    public static boolean SwigDirector_ClientAPI_OpenVPNClient_tun_builder_set_mtu(final ClientAPI_OpenVPNClient clientAPI_OpenVPNClient, final int n) {
        return clientAPI_OpenVPNClient.tun_builder_set_mtu(n);
    }
    
    public static boolean SwigDirector_ClientAPI_OpenVPNClient_tun_builder_set_proxy_auto_config_url(final ClientAPI_OpenVPNClient clientAPI_OpenVPNClient, final String s) {
        return clientAPI_OpenVPNClient.tun_builder_set_proxy_auto_config_url(s);
    }
    
    public static boolean SwigDirector_ClientAPI_OpenVPNClient_tun_builder_set_proxy_http(final ClientAPI_OpenVPNClient clientAPI_OpenVPNClient, final String s, final int n) {
        return clientAPI_OpenVPNClient.tun_builder_set_proxy_http(s, n);
    }
    
    public static boolean SwigDirector_ClientAPI_OpenVPNClient_tun_builder_set_proxy_https(final ClientAPI_OpenVPNClient clientAPI_OpenVPNClient, final String s, final int n) {
        return clientAPI_OpenVPNClient.tun_builder_set_proxy_https(s, n);
    }
    
    public static boolean SwigDirector_ClientAPI_OpenVPNClient_tun_builder_set_remote_address(final ClientAPI_OpenVPNClient clientAPI_OpenVPNClient, final String s, final boolean b) {
        return clientAPI_OpenVPNClient.tun_builder_set_remote_address(s, b);
    }
    
    public static boolean SwigDirector_ClientAPI_OpenVPNClient_tun_builder_set_route_metric_default(final ClientAPI_OpenVPNClient clientAPI_OpenVPNClient, final int n) {
        return clientAPI_OpenVPNClient.tun_builder_set_route_metric_default(n);
    }
    
    public static boolean SwigDirector_ClientAPI_OpenVPNClient_tun_builder_set_session_name(final ClientAPI_OpenVPNClient clientAPI_OpenVPNClient, final String s) {
        return clientAPI_OpenVPNClient.tun_builder_set_session_name(s);
    }
    
    public static void SwigDirector_ClientAPI_OpenVPNClient_tun_builder_teardown(final ClientAPI_OpenVPNClient clientAPI_OpenVPNClient, final boolean b) {
        clientAPI_OpenVPNClient.tun_builder_teardown(b);
    }
    
    public static final native void delete_ClientAPI_Config(final long p0);
    
    public static final native void delete_ClientAPI_ConnectionInfo(final long p0);
    
    public static final native void delete_ClientAPI_DynamicChallenge(final long p0);
    
    public static final native void delete_ClientAPI_EvalConfig(final long p0);
    
    public static final native void delete_ClientAPI_Event(final long p0);
    
    public static final native void delete_ClientAPI_ExternalPKIBase(final long p0);
    
    public static final native void delete_ClientAPI_ExternalPKICertRequest(final long p0);
    
    public static final native void delete_ClientAPI_ExternalPKIRequestBase(final long p0);
    
    public static final native void delete_ClientAPI_ExternalPKISignRequest(final long p0);
    
    public static final native void delete_ClientAPI_InterfaceStats(final long p0);
    
    public static final native void delete_ClientAPI_KeyValue(final long p0);
    
    public static final native void delete_ClientAPI_LLVector(final long p0);
    
    public static final native void delete_ClientAPI_LogInfo(final long p0);
    
    public static final native void delete_ClientAPI_MergeConfig(final long p0);
    
    public static final native void delete_ClientAPI_OpenVPNClient(final long p0);
    
    public static final native void delete_ClientAPI_ProvideCreds(final long p0);
    
    public static final native void delete_ClientAPI_RemoteOverride(final long p0);
    
    public static final native void delete_ClientAPI_ServerEntry(final long p0);
    
    public static final native void delete_ClientAPI_ServerEntryVector(final long p0);
    
    public static final native void delete_ClientAPI_SessionToken(final long p0);
    
    public static final native void delete_ClientAPI_Status(final long p0);
    
    public static final native void delete_ClientAPI_StringVec(final long p0);
    
    public static final native void delete_ClientAPI_TransportStats(final long p0);
    
    public static final native void delete_ClientAPI_TunBuilderBase(final long p0);
    
    public static final native long new_ClientAPI_Config();
    
    public static final native long new_ClientAPI_ConnectionInfo();
    
    public static final native long new_ClientAPI_DynamicChallenge();
    
    public static final native long new_ClientAPI_EvalConfig();
    
    public static final native long new_ClientAPI_Event();
    
    public static final native long new_ClientAPI_ExternalPKICertRequest();
    
    public static final native long new_ClientAPI_ExternalPKIRequestBase();
    
    public static final native long new_ClientAPI_ExternalPKISignRequest();
    
    public static final native long new_ClientAPI_InterfaceStats();
    
    public static final native long new_ClientAPI_KeyValue__SWIG_0();
    
    public static final native long new_ClientAPI_KeyValue__SWIG_1(final String p0, final String p1);
    
    public static final native long new_ClientAPI_LLVector__SWIG_0();
    
    public static final native long new_ClientAPI_LLVector__SWIG_1(final long p0, final ClientAPI_LLVector p1);
    
    public static final native long new_ClientAPI_LLVector__SWIG_2(final int p0, final long p1);
    
    public static final native long new_ClientAPI_LogInfo__SWIG_0();
    
    public static final native long new_ClientAPI_LogInfo__SWIG_1(final String p0);
    
    public static final native long new_ClientAPI_MergeConfig();
    
    public static final native long new_ClientAPI_OpenVPNClient();
    
    public static final native long new_ClientAPI_ProvideCreds();
    
    public static final native long new_ClientAPI_RemoteOverride();
    
    public static final native long new_ClientAPI_ServerEntry();
    
    public static final native long new_ClientAPI_ServerEntryVector__SWIG_0();
    
    public static final native long new_ClientAPI_ServerEntryVector__SWIG_1(final long p0, final ClientAPI_ServerEntryVector p1);
    
    public static final native long new_ClientAPI_ServerEntryVector__SWIG_2(final int p0, final long p1, final ClientAPI_ServerEntry p2);
    
    public static final native long new_ClientAPI_SessionToken();
    
    public static final native long new_ClientAPI_Status();
    
    public static final native long new_ClientAPI_StringVec__SWIG_0();
    
    public static final native long new_ClientAPI_StringVec__SWIG_1(final long p0, final ClientAPI_StringVec p1);
    
    public static final native long new_ClientAPI_StringVec__SWIG_2(final int p0, final String p1);
    
    public static final native long new_ClientAPI_TransportStats();
    
    public static final native long new_ClientAPI_TunBuilderBase();
    
    private static final native void swig_module_init();
}

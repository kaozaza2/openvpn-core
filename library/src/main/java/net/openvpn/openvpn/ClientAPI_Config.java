package net.openvpn.openvpn;

public class ClientAPI_Config
{
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;
    
    public ClientAPI_Config() {
        this(ovpncliJNI.new_ClientAPI_Config(), true);
    }
    
    protected ClientAPI_Config(final long swigCPtr, final boolean swigCMemOwn) {
        this.swigCMemOwn = swigCMemOwn;
        this.swigCPtr = swigCPtr;
    }
    
    protected static long getCPtr(final ClientAPI_Config clientAPI_Config) {
        long swigCPtr;
        if (clientAPI_Config == null) {
            swigCPtr = 0L;
        }
        else {
            swigCPtr = clientAPI_Config.swigCPtr;
        }
        return swigCPtr;
    }
    
    public void delete() {
        synchronized (this) {
            if (this.swigCPtr != 0L) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ovpncliJNI.delete_ClientAPI_Config(this.swigCPtr);
                }
                this.swigCPtr = 0L;
            }
        }
    }
    
    @Override
    protected void finalize() {
        this.delete();
    }
    
    public boolean getAllowLocalLanAccess() {
        return ovpncliJNI.ClientAPI_Config_allowLocalLanAccess_get(this.swigCPtr, this);
    }
    
    public boolean getAltProxy() {
        return ovpncliJNI.ClientAPI_Config_altProxy_get(this.swigCPtr, this);
    }
    
    public boolean getAutologinSessions() {
        return ovpncliJNI.ClientAPI_Config_autologinSessions_get(this.swigCPtr, this);
    }
    
    public long getClockTickMS() {
        return ovpncliJNI.ClientAPI_Config_clockTickMS_get(this.swigCPtr, this);
    }
    
    public String getCompressionMode() {
        return ovpncliJNI.ClientAPI_Config_compressionMode_get(this.swigCPtr, this);
    }
    
    public int getConnTimeout() {
        return ovpncliJNI.ClientAPI_Config_connTimeout_get(this.swigCPtr, this);
    }
    
    public String getContent() {
        return ovpncliJNI.ClientAPI_Config_content_get(this.swigCPtr, this);
    }
    
    public SWIGTYPE_p_std__vectorT_openvpn__ClientAPI__KeyValue_t getContentList() {
        final long clientAPI_Config_contentList_get = ovpncliJNI.ClientAPI_Config_contentList_get(this.swigCPtr, this);
        SWIGTYPE_p_std__vectorT_openvpn__ClientAPI__KeyValue_t swigtype_p_std__vectorT_openvpn__ClientAPI__KeyValue_t;
        if (clientAPI_Config_contentList_get == 0L) {
            swigtype_p_std__vectorT_openvpn__ClientAPI__KeyValue_t = null;
        }
        else {
            swigtype_p_std__vectorT_openvpn__ClientAPI__KeyValue_t = new SWIGTYPE_p_std__vectorT_openvpn__ClientAPI__KeyValue_t(clientAPI_Config_contentList_get, false);
        }
        return swigtype_p_std__vectorT_openvpn__ClientAPI__KeyValue_t;
    }
    
    public boolean getDco() {
        return ovpncliJNI.ClientAPI_Config_dco_get(this.swigCPtr, this);
    }
    
    public int getDefaultKeyDirection() {
        return ovpncliJNI.ClientAPI_Config_defaultKeyDirection_get(this.swigCPtr, this);
    }
    
    public boolean getDisableClientCert() {
        return ovpncliJNI.ClientAPI_Config_disableClientCert_get(this.swigCPtr, this);
    }
    
    public boolean getEcho() {
        return ovpncliJNI.ClientAPI_Config_echo_get(this.swigCPtr, this);
    }
    
    public String getExternalPkiAlias() {
        return ovpncliJNI.ClientAPI_Config_externalPkiAlias_get(this.swigCPtr, this);
    }
    
    public boolean getForceAesCbcCiphersuites() {
        return ovpncliJNI.ClientAPI_Config_forceAesCbcCiphersuites_get(this.swigCPtr, this);
    }
    
    public boolean getGoogleDnsFallback() {
        return ovpncliJNI.ClientAPI_Config_googleDnsFallback_get(this.swigCPtr, this);
    }
    
    public String getGremlinConfig() {
        return ovpncliJNI.ClientAPI_Config_gremlinConfig_get(this.swigCPtr, this);
    }
    
    public String getGuiVersion() {
        return ovpncliJNI.ClientAPI_Config_guiVersion_get(this.swigCPtr, this);
    }
    
    public String getHwAddrOverride() {
        return ovpncliJNI.ClientAPI_Config_hwAddrOverride_get(this.swigCPtr, this);
    }
    
    public boolean getInfo() {
        return ovpncliJNI.ClientAPI_Config_info_get(this.swigCPtr, this);
    }
    
    public String getIpv6() {
        return ovpncliJNI.ClientAPI_Config_ipv6_get(this.swigCPtr, this);
    }
    
    public SWIGTYPE_p_std__vectorT_openvpn__ClientAPI__KeyValue_t getPeerInfo() {
        final long clientAPI_Config_peerInfo_get = ovpncliJNI.ClientAPI_Config_peerInfo_get(this.swigCPtr, this);
        SWIGTYPE_p_std__vectorT_openvpn__ClientAPI__KeyValue_t swigtype_p_std__vectorT_openvpn__ClientAPI__KeyValue_t;
        if (clientAPI_Config_peerInfo_get == 0L) {
            swigtype_p_std__vectorT_openvpn__ClientAPI__KeyValue_t = null;
        }
        else {
            swigtype_p_std__vectorT_openvpn__ClientAPI__KeyValue_t = new SWIGTYPE_p_std__vectorT_openvpn__ClientAPI__KeyValue_t(clientAPI_Config_peerInfo_get, false);
        }
        return swigtype_p_std__vectorT_openvpn__ClientAPI__KeyValue_t;
    }
    
    public String getPlatformVersion() {
        return ovpncliJNI.ClientAPI_Config_platformVersion_get(this.swigCPtr, this);
    }
    
    public String getPortOverride() {
        return ovpncliJNI.ClientAPI_Config_portOverride_get(this.swigCPtr, this);
    }
    
    public String getPrivateKeyPassword() {
        return ovpncliJNI.ClientAPI_Config_privateKeyPassword_get(this.swigCPtr, this);
    }
    
    public String getProtoOverride() {
        return ovpncliJNI.ClientAPI_Config_protoOverride_get(this.swigCPtr, this);
    }
    
    public boolean getProxyAllowCleartextAuth() {
        return ovpncliJNI.ClientAPI_Config_proxyAllowCleartextAuth_get(this.swigCPtr, this);
    }
    
    public String getProxyHost() {
        return ovpncliJNI.ClientAPI_Config_proxyHost_get(this.swigCPtr, this);
    }
    
    public String getProxyPassword() {
        return ovpncliJNI.ClientAPI_Config_proxyPassword_get(this.swigCPtr, this);
    }
    
    public String getProxyPort() {
        return ovpncliJNI.ClientAPI_Config_proxyPort_get(this.swigCPtr, this);
    }
    
    public String getProxyUsername() {
        return ovpncliJNI.ClientAPI_Config_proxyUsername_get(this.swigCPtr, this);
    }
    
    public boolean getRetryOnAuthFailed() {
        return ovpncliJNI.ClientAPI_Config_retryOnAuthFailed_get(this.swigCPtr, this);
    }
    
    public String getServerOverride() {
        return ovpncliJNI.ClientAPI_Config_serverOverride_get(this.swigCPtr, this);
    }
    
    public int getSslDebugLevel() {
        return ovpncliJNI.ClientAPI_Config_sslDebugLevel_get(this.swigCPtr, this);
    }
    
    public String getSsoMethods() {
        return ovpncliJNI.ClientAPI_Config_ssoMethods_get(this.swigCPtr, this);
    }
    
    public boolean getSynchronousDnsLookup() {
        return ovpncliJNI.ClientAPI_Config_synchronousDnsLookup_get(this.swigCPtr, this);
    }
    
    public String getTlsCertProfileOverride() {
        return ovpncliJNI.ClientAPI_Config_tlsCertProfileOverride_get(this.swigCPtr, this);
    }
    
    public String getTlsVersionMinOverride() {
        return ovpncliJNI.ClientAPI_Config_tlsVersionMinOverride_get(this.swigCPtr, this);
    }
    
    public boolean getTunPersist() {
        return ovpncliJNI.ClientAPI_Config_tunPersist_get(this.swigCPtr, this);
    }
    
    public boolean getWintun() {
        return ovpncliJNI.ClientAPI_Config_wintun_get(this.swigCPtr, this);
    }
    
    public void setAllowLocalLanAccess(final boolean b) {
        ovpncliJNI.ClientAPI_Config_allowLocalLanAccess_set(this.swigCPtr, this, b);
    }
    
    public void setAltProxy(final boolean b) {
        ovpncliJNI.ClientAPI_Config_altProxy_set(this.swigCPtr, this, b);
    }
    
    public void setAutologinSessions(final boolean b) {
        ovpncliJNI.ClientAPI_Config_autologinSessions_set(this.swigCPtr, this, b);
    }
    
    public void setClockTickMS(final long n) {
        ovpncliJNI.ClientAPI_Config_clockTickMS_set(this.swigCPtr, this, n);
    }
    
    public void setCompressionMode(final String s) {
        ovpncliJNI.ClientAPI_Config_compressionMode_set(this.swigCPtr, this, s);
    }
    
    public void setConnTimeout(final int n) {
        ovpncliJNI.ClientAPI_Config_connTimeout_set(this.swigCPtr, this, n);
    }
    
    public void setContent(final String s) {
        ovpncliJNI.ClientAPI_Config_content_set(this.swigCPtr, this, s);
    }
    
    public void setContentList(final SWIGTYPE_p_std__vectorT_openvpn__ClientAPI__KeyValue_t swigtype_p_std__vectorT_openvpn__ClientAPI__KeyValue_t) {
        ovpncliJNI.ClientAPI_Config_contentList_set(this.swigCPtr, this, SWIGTYPE_p_std__vectorT_openvpn__ClientAPI__KeyValue_t.getCPtr(swigtype_p_std__vectorT_openvpn__ClientAPI__KeyValue_t));
    }
    
    public void setDco(final boolean b) {
        ovpncliJNI.ClientAPI_Config_dco_set(this.swigCPtr, this, b);
    }
    
    public void setDefaultKeyDirection(final int n) {
        ovpncliJNI.ClientAPI_Config_defaultKeyDirection_set(this.swigCPtr, this, n);
    }
    
    public void setDisableClientCert(final boolean b) {
        ovpncliJNI.ClientAPI_Config_disableClientCert_set(this.swigCPtr, this, b);
    }
    
    public void setEcho(final boolean b) {
        ovpncliJNI.ClientAPI_Config_echo_set(this.swigCPtr, this, b);
    }
    
    public void setExternalPkiAlias(final String s) {
        ovpncliJNI.ClientAPI_Config_externalPkiAlias_set(this.swigCPtr, this, s);
    }
    
    public void setForceAesCbcCiphersuites(final boolean b) {
        ovpncliJNI.ClientAPI_Config_forceAesCbcCiphersuites_set(this.swigCPtr, this, b);
    }
    
    public void setGoogleDnsFallback(final boolean b) {
        ovpncliJNI.ClientAPI_Config_googleDnsFallback_set(this.swigCPtr, this, b);
    }
    
    public void setGremlinConfig(final String s) {
        ovpncliJNI.ClientAPI_Config_gremlinConfig_set(this.swigCPtr, this, s);
    }
    
    public void setGuiVersion(final String s) {
        ovpncliJNI.ClientAPI_Config_guiVersion_set(this.swigCPtr, this, s);
    }
    
    public void setHwAddrOverride(final String s) {
        ovpncliJNI.ClientAPI_Config_hwAddrOverride_set(this.swigCPtr, this, s);
    }
    
    public void setInfo(final boolean b) {
        ovpncliJNI.ClientAPI_Config_info_set(this.swigCPtr, this, b);
    }
    
    public void setIpv6(final String s) {
        ovpncliJNI.ClientAPI_Config_ipv6_set(this.swigCPtr, this, s);
    }
    
    public void setPeerInfo(final SWIGTYPE_p_std__vectorT_openvpn__ClientAPI__KeyValue_t swigtype_p_std__vectorT_openvpn__ClientAPI__KeyValue_t) {
        ovpncliJNI.ClientAPI_Config_peerInfo_set(this.swigCPtr, this, SWIGTYPE_p_std__vectorT_openvpn__ClientAPI__KeyValue_t.getCPtr(swigtype_p_std__vectorT_openvpn__ClientAPI__KeyValue_t));
    }
    
    public void setPlatformVersion(final String s) {
        ovpncliJNI.ClientAPI_Config_platformVersion_set(this.swigCPtr, this, s);
    }
    
    public void setPortOverride(final String s) {
        ovpncliJNI.ClientAPI_Config_portOverride_set(this.swigCPtr, this, s);
    }
    
    public void setPrivateKeyPassword(final String s) {
        ovpncliJNI.ClientAPI_Config_privateKeyPassword_set(this.swigCPtr, this, s);
    }
    
    public void setProtoOverride(final String s) {
        ovpncliJNI.ClientAPI_Config_protoOverride_set(this.swigCPtr, this, s);
    }
    
    public void setProxyAllowCleartextAuth(final boolean b) {
        ovpncliJNI.ClientAPI_Config_proxyAllowCleartextAuth_set(this.swigCPtr, this, b);
    }
    
    public void setProxyHost(final String s) {
        ovpncliJNI.ClientAPI_Config_proxyHost_set(this.swigCPtr, this, s);
    }
    
    public void setProxyPassword(final String s) {
        ovpncliJNI.ClientAPI_Config_proxyPassword_set(this.swigCPtr, this, s);
    }
    
    public void setProxyPort(final String s) {
        ovpncliJNI.ClientAPI_Config_proxyPort_set(this.swigCPtr, this, s);
    }
    
    public void setProxyUsername(final String s) {
        ovpncliJNI.ClientAPI_Config_proxyUsername_set(this.swigCPtr, this, s);
    }
    
    public void setRetryOnAuthFailed(final boolean b) {
        ovpncliJNI.ClientAPI_Config_retryOnAuthFailed_set(this.swigCPtr, this, b);
    }
    
    public void setServerOverride(final String s) {
        ovpncliJNI.ClientAPI_Config_serverOverride_set(this.swigCPtr, this, s);
    }
    
    public void setSslDebugLevel(final int n) {
        ovpncliJNI.ClientAPI_Config_sslDebugLevel_set(this.swigCPtr, this, n);
    }
    
    public void setSsoMethods(final String s) {
        ovpncliJNI.ClientAPI_Config_ssoMethods_set(this.swigCPtr, this, s);
    }
    
    public void setSynchronousDnsLookup(final boolean b) {
        ovpncliJNI.ClientAPI_Config_synchronousDnsLookup_set(this.swigCPtr, this, b);
    }
    
    public void setTlsCertProfileOverride(final String s) {
        ovpncliJNI.ClientAPI_Config_tlsCertProfileOverride_set(this.swigCPtr, this, s);
    }
    
    public void setTlsVersionMinOverride(final String s) {
        ovpncliJNI.ClientAPI_Config_tlsVersionMinOverride_set(this.swigCPtr, this, s);
    }
    
    public void setTunPersist(final boolean b) {
        ovpncliJNI.ClientAPI_Config_tunPersist_set(this.swigCPtr, this, b);
    }
    
    public void setWintun(final boolean b) {
        ovpncliJNI.ClientAPI_Config_wintun_set(this.swigCPtr, this, b);
    }
}

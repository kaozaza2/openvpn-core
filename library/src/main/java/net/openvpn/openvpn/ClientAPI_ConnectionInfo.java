package net.openvpn.openvpn;

public class ClientAPI_ConnectionInfo
{
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;
    
    public ClientAPI_ConnectionInfo() {
        this(ovpncliJNI.new_ClientAPI_ConnectionInfo(), true);
    }
    
    protected ClientAPI_ConnectionInfo(final long swigCPtr, final boolean swigCMemOwn) {
        this.swigCMemOwn = swigCMemOwn;
        this.swigCPtr = swigCPtr;
    }
    
    protected static long getCPtr(final ClientAPI_ConnectionInfo clientAPI_ConnectionInfo) {
        long swigCPtr;
        if (clientAPI_ConnectionInfo == null) {
            swigCPtr = 0L;
        }
        else {
            swigCPtr = clientAPI_ConnectionInfo.swigCPtr;
        }
        return swigCPtr;
    }
    
    public void delete() {
        synchronized (this) {
            if (this.swigCPtr != 0L) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ovpncliJNI.delete_ClientAPI_ConnectionInfo(this.swigCPtr);
                }
                this.swigCPtr = 0L;
            }
        }
    }
    
    @Override
    protected void finalize() {
        this.delete();
    }
    
    public String getClientIp() {
        return ovpncliJNI.ClientAPI_ConnectionInfo_clientIp_get(this.swigCPtr, this);
    }
    
    public boolean getDefined() {
        return ovpncliJNI.ClientAPI_ConnectionInfo_defined_get(this.swigCPtr, this);
    }
    
    public String getGw4() {
        return ovpncliJNI.ClientAPI_ConnectionInfo_gw4_get(this.swigCPtr, this);
    }
    
    public String getGw6() {
        return ovpncliJNI.ClientAPI_ConnectionInfo_gw6_get(this.swigCPtr, this);
    }
    
    public String getServerHost() {
        return ovpncliJNI.ClientAPI_ConnectionInfo_serverHost_get(this.swigCPtr, this);
    }
    
    public String getServerIp() {
        return ovpncliJNI.ClientAPI_ConnectionInfo_serverIp_get(this.swigCPtr, this);
    }
    
    public String getServerPort() {
        return ovpncliJNI.ClientAPI_ConnectionInfo_serverPort_get(this.swigCPtr, this);
    }
    
    public String getServerProto() {
        return ovpncliJNI.ClientAPI_ConnectionInfo_serverProto_get(this.swigCPtr, this);
    }
    
    public String getTunName() {
        return ovpncliJNI.ClientAPI_ConnectionInfo_tunName_get(this.swigCPtr, this);
    }
    
    public String getUser() {
        return ovpncliJNI.ClientAPI_ConnectionInfo_user_get(this.swigCPtr, this);
    }
    
    public String getVpnIp4() {
        return ovpncliJNI.ClientAPI_ConnectionInfo_vpnIp4_get(this.swigCPtr, this);
    }
    
    public String getVpnIp6() {
        return ovpncliJNI.ClientAPI_ConnectionInfo_vpnIp6_get(this.swigCPtr, this);
    }
    
    public void setClientIp(final String s) {
        ovpncliJNI.ClientAPI_ConnectionInfo_clientIp_set(this.swigCPtr, this, s);
    }
    
    public void setDefined(final boolean b) {
        ovpncliJNI.ClientAPI_ConnectionInfo_defined_set(this.swigCPtr, this, b);
    }
    
    public void setGw4(final String s) {
        ovpncliJNI.ClientAPI_ConnectionInfo_gw4_set(this.swigCPtr, this, s);
    }
    
    public void setGw6(final String s) {
        ovpncliJNI.ClientAPI_ConnectionInfo_gw6_set(this.swigCPtr, this, s);
    }
    
    public void setServerHost(final String s) {
        ovpncliJNI.ClientAPI_ConnectionInfo_serverHost_set(this.swigCPtr, this, s);
    }
    
    public void setServerIp(final String s) {
        ovpncliJNI.ClientAPI_ConnectionInfo_serverIp_set(this.swigCPtr, this, s);
    }
    
    public void setServerPort(final String s) {
        ovpncliJNI.ClientAPI_ConnectionInfo_serverPort_set(this.swigCPtr, this, s);
    }
    
    public void setServerProto(final String s) {
        ovpncliJNI.ClientAPI_ConnectionInfo_serverProto_set(this.swigCPtr, this, s);
    }
    
    public void setTunName(final String s) {
        ovpncliJNI.ClientAPI_ConnectionInfo_tunName_set(this.swigCPtr, this, s);
    }
    
    public void setUser(final String s) {
        ovpncliJNI.ClientAPI_ConnectionInfo_user_set(this.swigCPtr, this, s);
    }
    
    public void setVpnIp4(final String s) {
        ovpncliJNI.ClientAPI_ConnectionInfo_vpnIp4_set(this.swigCPtr, this, s);
    }
    
    public void setVpnIp6(final String s) {
        ovpncliJNI.ClientAPI_ConnectionInfo_vpnIp6_set(this.swigCPtr, this, s);
    }
}

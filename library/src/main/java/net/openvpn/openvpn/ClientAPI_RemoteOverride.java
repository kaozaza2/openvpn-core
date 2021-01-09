package net.openvpn.openvpn;

public class ClientAPI_RemoteOverride
{
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;
    
    public ClientAPI_RemoteOverride() {
        this(ovpncliJNI.new_ClientAPI_RemoteOverride(), true);
    }
    
    protected ClientAPI_RemoteOverride(final long swigCPtr, final boolean swigCMemOwn) {
        this.swigCMemOwn = swigCMemOwn;
        this.swigCPtr = swigCPtr;
    }
    
    protected static long getCPtr(final ClientAPI_RemoteOverride clientAPI_RemoteOverride) {
        long swigCPtr;
        if (clientAPI_RemoteOverride == null) {
            swigCPtr = 0L;
        }
        else {
            swigCPtr = clientAPI_RemoteOverride.swigCPtr;
        }
        return swigCPtr;
    }
    
    public void delete() {
        synchronized (this) {
            if (this.swigCPtr != 0L) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ovpncliJNI.delete_ClientAPI_RemoteOverride(this.swigCPtr);
                }
                this.swigCPtr = 0L;
            }
        }
    }
    
    @Override
    protected void finalize() {
        this.delete();
    }
    
    public String getError() {
        return ovpncliJNI.ClientAPI_RemoteOverride_error_get(this.swigCPtr, this);
    }
    
    public String getHost() {
        return ovpncliJNI.ClientAPI_RemoteOverride_host_get(this.swigCPtr, this);
    }
    
    public String getIp() {
        return ovpncliJNI.ClientAPI_RemoteOverride_ip_get(this.swigCPtr, this);
    }
    
    public String getPort() {
        return ovpncliJNI.ClientAPI_RemoteOverride_port_get(this.swigCPtr, this);
    }
    
    public String getProto() {
        return ovpncliJNI.ClientAPI_RemoteOverride_proto_get(this.swigCPtr, this);
    }
    
    public void setError(final String s) {
        ovpncliJNI.ClientAPI_RemoteOverride_error_set(this.swigCPtr, this, s);
    }
    
    public void setHost(final String s) {
        ovpncliJNI.ClientAPI_RemoteOverride_host_set(this.swigCPtr, this, s);
    }
    
    public void setIp(final String s) {
        ovpncliJNI.ClientAPI_RemoteOverride_ip_set(this.swigCPtr, this, s);
    }
    
    public void setPort(final String s) {
        ovpncliJNI.ClientAPI_RemoteOverride_port_set(this.swigCPtr, this, s);
    }
    
    public void setProto(final String s) {
        ovpncliJNI.ClientAPI_RemoteOverride_proto_set(this.swigCPtr, this, s);
    }
}

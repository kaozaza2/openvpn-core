package net.openvpn.openvpn;

public class ClientAPI_MergeConfig
{
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;
    
    public ClientAPI_MergeConfig() {
        this(ovpncliJNI.new_ClientAPI_MergeConfig(), true);
    }
    
    protected ClientAPI_MergeConfig(final long swigCPtr, final boolean swigCMemOwn) {
        this.swigCMemOwn = swigCMemOwn;
        this.swigCPtr = swigCPtr;
    }
    
    protected static long getCPtr(final ClientAPI_MergeConfig clientAPI_MergeConfig) {
        long swigCPtr;
        if (clientAPI_MergeConfig == null) {
            swigCPtr = 0L;
        }
        else {
            swigCPtr = clientAPI_MergeConfig.swigCPtr;
        }
        return swigCPtr;
    }
    
    public void delete() {
        synchronized (this) {
            if (this.swigCPtr != 0L) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ovpncliJNI.delete_ClientAPI_MergeConfig(this.swigCPtr);
                }
                this.swigCPtr = 0L;
            }
        }
    }
    
    @Override
    protected void finalize() {
        this.delete();
    }
    
    public String getBasename() {
        return ovpncliJNI.ClientAPI_MergeConfig_basename_get(this.swigCPtr, this);
    }
    
    public String getErrorText() {
        return ovpncliJNI.ClientAPI_MergeConfig_errorText_get(this.swigCPtr, this);
    }
    
    public String getProfileContent() {
        return ovpncliJNI.ClientAPI_MergeConfig_profileContent_get(this.swigCPtr, this);
    }
    
    public ClientAPI_StringVec getRefPathList() {
        final long clientAPI_MergeConfig_refPathList_get = ovpncliJNI.ClientAPI_MergeConfig_refPathList_get(this.swigCPtr, this);
        ClientAPI_StringVec clientAPI_StringVec;
        if (clientAPI_MergeConfig_refPathList_get == 0L) {
            clientAPI_StringVec = null;
        }
        else {
            clientAPI_StringVec = new ClientAPI_StringVec(clientAPI_MergeConfig_refPathList_get, false);
        }
        return clientAPI_StringVec;
    }
    
    public String getStatus() {
        return ovpncliJNI.ClientAPI_MergeConfig_status_get(this.swigCPtr, this);
    }
    
    public void setBasename(final String s) {
        ovpncliJNI.ClientAPI_MergeConfig_basename_set(this.swigCPtr, this, s);
    }
    
    public void setErrorText(final String s) {
        ovpncliJNI.ClientAPI_MergeConfig_errorText_set(this.swigCPtr, this, s);
    }
    
    public void setProfileContent(final String s) {
        ovpncliJNI.ClientAPI_MergeConfig_profileContent_set(this.swigCPtr, this, s);
    }
    
    public void setRefPathList(final ClientAPI_StringVec clientAPI_StringVec) {
        ovpncliJNI.ClientAPI_MergeConfig_refPathList_set(this.swigCPtr, this, ClientAPI_StringVec.getCPtr(clientAPI_StringVec), clientAPI_StringVec);
    }
    
    public void setStatus(final String s) {
        ovpncliJNI.ClientAPI_MergeConfig_status_set(this.swigCPtr, this, s);
    }
}

package net.openvpn.openvpn;

public class ClientAPI_ProvideCreds
{
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;
    
    public ClientAPI_ProvideCreds() {
        this(ovpncliJNI.new_ClientAPI_ProvideCreds(), true);
    }
    
    protected ClientAPI_ProvideCreds(final long swigCPtr, final boolean swigCMemOwn) {
        this.swigCMemOwn = swigCMemOwn;
        this.swigCPtr = swigCPtr;
    }
    
    protected static long getCPtr(final ClientAPI_ProvideCreds clientAPI_ProvideCreds) {
        long swigCPtr;
        if (clientAPI_ProvideCreds == null) {
            swigCPtr = 0L;
        }
        else {
            swigCPtr = clientAPI_ProvideCreds.swigCPtr;
        }
        return swigCPtr;
    }
    
    public void delete() {
        synchronized (this) {
            if (this.swigCPtr != 0L) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ovpncliJNI.delete_ClientAPI_ProvideCreds(this.swigCPtr);
                }
                this.swigCPtr = 0L;
            }
        }
    }
    
    @Override
    protected void finalize() {
        this.delete();
    }
    
    public boolean getCachePassword() {
        return ovpncliJNI.ClientAPI_ProvideCreds_cachePassword_get(this.swigCPtr, this);
    }
    
    public String getDynamicChallengeCookie() {
        return ovpncliJNI.ClientAPI_ProvideCreds_dynamicChallengeCookie_get(this.swigCPtr, this);
    }
    
    public String getPassword() {
        return ovpncliJNI.ClientAPI_ProvideCreds_password_get(this.swigCPtr, this);
    }
    
    public boolean getReplacePasswordWithSessionID() {
        return ovpncliJNI.ClientAPI_ProvideCreds_replacePasswordWithSessionID_get(this.swigCPtr, this);
    }
    
    public String getResponse() {
        return ovpncliJNI.ClientAPI_ProvideCreds_response_get(this.swigCPtr, this);
    }
    
    public String getUsername() {
        return ovpncliJNI.ClientAPI_ProvideCreds_username_get(this.swigCPtr, this);
    }
    
    public void setCachePassword(final boolean b) {
        ovpncliJNI.ClientAPI_ProvideCreds_cachePassword_set(this.swigCPtr, this, b);
    }
    
    public void setDynamicChallengeCookie(final String s) {
        ovpncliJNI.ClientAPI_ProvideCreds_dynamicChallengeCookie_set(this.swigCPtr, this, s);
    }
    
    public void setPassword(final String s) {
        ovpncliJNI.ClientAPI_ProvideCreds_password_set(this.swigCPtr, this, s);
    }
    
    public void setReplacePasswordWithSessionID(final boolean b) {
        ovpncliJNI.ClientAPI_ProvideCreds_replacePasswordWithSessionID_set(this.swigCPtr, this, b);
    }
    
    public void setResponse(final String s) {
        ovpncliJNI.ClientAPI_ProvideCreds_response_set(this.swigCPtr, this, s);
    }
    
    public void setUsername(final String s) {
        ovpncliJNI.ClientAPI_ProvideCreds_username_set(this.swigCPtr, this, s);
    }
}

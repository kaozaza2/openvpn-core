package net.openvpn.openvpn;

public class ClientAPI_SessionToken
{
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;
    
    public ClientAPI_SessionToken() {
        this(ovpncliJNI.new_ClientAPI_SessionToken(), true);
    }
    
    protected ClientAPI_SessionToken(final long swigCPtr, final boolean swigCMemOwn) {
        this.swigCMemOwn = swigCMemOwn;
        this.swigCPtr = swigCPtr;
    }
    
    protected static long getCPtr(final ClientAPI_SessionToken clientAPI_SessionToken) {
        long swigCPtr;
        if (clientAPI_SessionToken == null) {
            swigCPtr = 0L;
        }
        else {
            swigCPtr = clientAPI_SessionToken.swigCPtr;
        }
        return swigCPtr;
    }
    
    public void delete() {
        synchronized (this) {
            if (this.swigCPtr != 0L) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ovpncliJNI.delete_ClientAPI_SessionToken(this.swigCPtr);
                }
                this.swigCPtr = 0L;
            }
        }
    }
    
    @Override
    protected void finalize() {
        this.delete();
    }
    
    public String getSession_id() {
        return ovpncliJNI.ClientAPI_SessionToken_session_id_get(this.swigCPtr, this);
    }
    
    public String getUsername() {
        return ovpncliJNI.ClientAPI_SessionToken_username_get(this.swigCPtr, this);
    }
    
    public void setSession_id(final String s) {
        ovpncliJNI.ClientAPI_SessionToken_session_id_set(this.swigCPtr, this, s);
    }
    
    public void setUsername(final String s) {
        ovpncliJNI.ClientAPI_SessionToken_username_set(this.swigCPtr, this, s);
    }
}

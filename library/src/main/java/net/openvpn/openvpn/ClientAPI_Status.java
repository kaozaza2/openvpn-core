package net.openvpn.openvpn;

public class ClientAPI_Status
{
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;
    
    public ClientAPI_Status() {
        this(ovpncliJNI.new_ClientAPI_Status(), true);
    }
    
    protected ClientAPI_Status(final long swigCPtr, final boolean swigCMemOwn) {
        this.swigCMemOwn = swigCMemOwn;
        this.swigCPtr = swigCPtr;
    }
    
    protected static long getCPtr(final ClientAPI_Status clientAPI_Status) {
        long swigCPtr;
        if (clientAPI_Status == null) {
            swigCPtr = 0L;
        }
        else {
            swigCPtr = clientAPI_Status.swigCPtr;
        }
        return swigCPtr;
    }
    
    public void delete() {
        synchronized (this) {
            if (this.swigCPtr != 0L) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ovpncliJNI.delete_ClientAPI_Status(this.swigCPtr);
                }
                this.swigCPtr = 0L;
            }
        }
    }
    
    @Override
    protected void finalize() {
        this.delete();
    }
    
    public boolean getError() {
        return ovpncliJNI.ClientAPI_Status_error_get(this.swigCPtr, this);
    }
    
    public String getMessage() {
        return ovpncliJNI.ClientAPI_Status_message_get(this.swigCPtr, this);
    }
    
    public String getStatus() {
        return ovpncliJNI.ClientAPI_Status_status_get(this.swigCPtr, this);
    }
    
    public void setError(final boolean b) {
        ovpncliJNI.ClientAPI_Status_error_set(this.swigCPtr, this, b);
    }
    
    public void setMessage(final String s) {
        ovpncliJNI.ClientAPI_Status_message_set(this.swigCPtr, this, s);
    }
    
    public void setStatus(final String s) {
        ovpncliJNI.ClientAPI_Status_status_set(this.swigCPtr, this, s);
    }
}

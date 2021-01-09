package net.openvpn.openvpn;

public class ClientAPI_Event
{
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;
    
    public ClientAPI_Event() {
        this(ovpncliJNI.new_ClientAPI_Event(), true);
    }
    
    protected ClientAPI_Event(final long swigCPtr, final boolean swigCMemOwn) {
        this.swigCMemOwn = swigCMemOwn;
        this.swigCPtr = swigCPtr;
    }
    
    protected static long getCPtr(final ClientAPI_Event clientAPI_Event) {
        long swigCPtr;
        if (clientAPI_Event == null) {
            swigCPtr = 0L;
        }
        else {
            swigCPtr = clientAPI_Event.swigCPtr;
        }
        return swigCPtr;
    }
    
    public void delete() {
        synchronized (this) {
            if (this.swigCPtr != 0L) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ovpncliJNI.delete_ClientAPI_Event(this.swigCPtr);
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
        return ovpncliJNI.ClientAPI_Event_error_get(this.swigCPtr, this);
    }
    
    public boolean getFatal() {
        return ovpncliJNI.ClientAPI_Event_fatal_get(this.swigCPtr, this);
    }
    
    public String getInfo() {
        return ovpncliJNI.ClientAPI_Event_info_get(this.swigCPtr, this);
    }
    
    public String getName() {
        return ovpncliJNI.ClientAPI_Event_name_get(this.swigCPtr, this);
    }
    
    public void setError(final boolean b) {
        ovpncliJNI.ClientAPI_Event_error_set(this.swigCPtr, this, b);
    }
    
    public void setFatal(final boolean b) {
        ovpncliJNI.ClientAPI_Event_fatal_set(this.swigCPtr, this, b);
    }
    
    public void setInfo(final String s) {
        ovpncliJNI.ClientAPI_Event_info_set(this.swigCPtr, this, s);
    }
    
    public void setName(final String s) {
        ovpncliJNI.ClientAPI_Event_name_set(this.swigCPtr, this, s);
    }
}

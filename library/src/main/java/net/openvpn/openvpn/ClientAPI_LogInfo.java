package net.openvpn.openvpn;

public class ClientAPI_LogInfo
{
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;
    
    public ClientAPI_LogInfo() {
        this(ovpncliJNI.new_ClientAPI_LogInfo__SWIG_0(), true);
    }
    
    protected ClientAPI_LogInfo(final long swigCPtr, final boolean swigCMemOwn) {
        this.swigCMemOwn = swigCMemOwn;
        this.swigCPtr = swigCPtr;
    }
    
    public ClientAPI_LogInfo(final String s) {
        this(ovpncliJNI.new_ClientAPI_LogInfo__SWIG_1(s), true);
    }
    
    protected static long getCPtr(final ClientAPI_LogInfo clientAPI_LogInfo) {
        long swigCPtr;
        if (clientAPI_LogInfo == null) {
            swigCPtr = 0L;
        }
        else {
            swigCPtr = clientAPI_LogInfo.swigCPtr;
        }
        return swigCPtr;
    }
    
    public void delete() {
        synchronized (this) {
            if (this.swigCPtr != 0L) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ovpncliJNI.delete_ClientAPI_LogInfo(this.swigCPtr);
                }
                this.swigCPtr = 0L;
            }
        }
    }
    
    @Override
    protected void finalize() {
        this.delete();
    }
    
    public String getText() {
        return ovpncliJNI.ClientAPI_LogInfo_text_get(this.swigCPtr, this);
    }
    
    public void setText(final String s) {
        ovpncliJNI.ClientAPI_LogInfo_text_set(this.swigCPtr, this, s);
    }
}

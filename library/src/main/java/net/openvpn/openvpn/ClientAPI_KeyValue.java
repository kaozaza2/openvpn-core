package net.openvpn.openvpn;

public class ClientAPI_KeyValue
{
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;
    
    public ClientAPI_KeyValue() {
        this(ovpncliJNI.new_ClientAPI_KeyValue__SWIG_0(), true);
    }
    
    protected ClientAPI_KeyValue(final long swigCPtr, final boolean swigCMemOwn) {
        this.swigCMemOwn = swigCMemOwn;
        this.swigCPtr = swigCPtr;
    }
    
    public ClientAPI_KeyValue(final String s, final String s2) {
        this(ovpncliJNI.new_ClientAPI_KeyValue__SWIG_1(s, s2), true);
    }
    
    protected static long getCPtr(final ClientAPI_KeyValue clientAPI_KeyValue) {
        long swigCPtr;
        if (clientAPI_KeyValue == null) {
            swigCPtr = 0L;
        }
        else {
            swigCPtr = clientAPI_KeyValue.swigCPtr;
        }
        return swigCPtr;
    }
    
    public void delete() {
        synchronized (this) {
            if (this.swigCPtr != 0L) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ovpncliJNI.delete_ClientAPI_KeyValue(this.swigCPtr);
                }
                this.swigCPtr = 0L;
            }
        }
    }
    
    @Override
    protected void finalize() {
        this.delete();
    }
    
    public String getKey() {
        return ovpncliJNI.ClientAPI_KeyValue_key_get(this.swigCPtr, this);
    }
    
    public String getValue() {
        return ovpncliJNI.ClientAPI_KeyValue_value_get(this.swigCPtr, this);
    }
    
    public void setKey(final String s) {
        ovpncliJNI.ClientAPI_KeyValue_key_set(this.swigCPtr, this, s);
    }
    
    public void setValue(final String s) {
        ovpncliJNI.ClientAPI_KeyValue_value_set(this.swigCPtr, this, s);
    }
}

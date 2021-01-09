package net.openvpn.openvpn;

public class ClientAPI_ExternalPKIRequestBase
{
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;
    
    public ClientAPI_ExternalPKIRequestBase() {
        this(ovpncliJNI.new_ClientAPI_ExternalPKIRequestBase(), true);
    }
    
    protected ClientAPI_ExternalPKIRequestBase(final long swigCPtr, final boolean swigCMemOwn) {
        this.swigCMemOwn = swigCMemOwn;
        this.swigCPtr = swigCPtr;
    }
    
    protected static long getCPtr(final ClientAPI_ExternalPKIRequestBase clientAPI_ExternalPKIRequestBase) {
        long swigCPtr;
        if (clientAPI_ExternalPKIRequestBase == null) {
            swigCPtr = 0L;
        }
        else {
            swigCPtr = clientAPI_ExternalPKIRequestBase.swigCPtr;
        }
        return swigCPtr;
    }
    
    public void delete() {
        synchronized (this) {
            if (this.swigCPtr != 0L) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ovpncliJNI.delete_ClientAPI_ExternalPKIRequestBase(this.swigCPtr);
                }
                this.swigCPtr = 0L;
            }
        }
    }
    
    @Override
    protected void finalize() {
        this.delete();
    }
    
    public String getAlias() {
        return ovpncliJNI.ClientAPI_ExternalPKIRequestBase_alias_get(this.swigCPtr, this);
    }
    
    public boolean getError() {
        return ovpncliJNI.ClientAPI_ExternalPKIRequestBase_error_get(this.swigCPtr, this);
    }
    
    public String getErrorText() {
        return ovpncliJNI.ClientAPI_ExternalPKIRequestBase_errorText_get(this.swigCPtr, this);
    }
    
    public boolean getInvalidAlias() {
        return ovpncliJNI.ClientAPI_ExternalPKIRequestBase_invalidAlias_get(this.swigCPtr, this);
    }
    
    public void setAlias(final String s) {
        ovpncliJNI.ClientAPI_ExternalPKIRequestBase_alias_set(this.swigCPtr, this, s);
    }
    
    public void setError(final boolean b) {
        ovpncliJNI.ClientAPI_ExternalPKIRequestBase_error_set(this.swigCPtr, this, b);
    }
    
    public void setErrorText(final String s) {
        ovpncliJNI.ClientAPI_ExternalPKIRequestBase_errorText_set(this.swigCPtr, this, s);
    }
    
    public void setInvalidAlias(final boolean b) {
        ovpncliJNI.ClientAPI_ExternalPKIRequestBase_invalidAlias_set(this.swigCPtr, this, b);
    }
}

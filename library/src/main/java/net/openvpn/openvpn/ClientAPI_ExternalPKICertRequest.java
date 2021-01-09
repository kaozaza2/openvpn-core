package net.openvpn.openvpn;

public class ClientAPI_ExternalPKICertRequest extends ClientAPI_ExternalPKIRequestBase
{
    private transient long swigCPtr;
    
    public ClientAPI_ExternalPKICertRequest() {
        this(ovpncliJNI.new_ClientAPI_ExternalPKICertRequest(), true);
    }
    
    protected ClientAPI_ExternalPKICertRequest(final long swigCPtr, final boolean b) {
        super(ovpncliJNI.ClientAPI_ExternalPKICertRequest_SWIGUpcast(swigCPtr), b);
        this.swigCPtr = swigCPtr;
    }
    
    protected static long getCPtr(final ClientAPI_ExternalPKICertRequest clientAPI_ExternalPKICertRequest) {
        long swigCPtr;
        if (clientAPI_ExternalPKICertRequest == null) {
            swigCPtr = 0L;
        }
        else {
            swigCPtr = clientAPI_ExternalPKICertRequest.swigCPtr;
        }
        return swigCPtr;
    }
    
    @Override
    public void delete() {
        synchronized (this) {
            if (this.swigCPtr != 0L) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ovpncliJNI.delete_ClientAPI_ExternalPKICertRequest(this.swigCPtr);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        }
    }
    
    @Override
    protected void finalize() {
        this.delete();
    }
    
    public String getCert() {
        return ovpncliJNI.ClientAPI_ExternalPKICertRequest_cert_get(this.swigCPtr, this);
    }
    
    public String getSupportingChain() {
        return ovpncliJNI.ClientAPI_ExternalPKICertRequest_supportingChain_get(this.swigCPtr, this);
    }
    
    public void setCert(final String s) {
        ovpncliJNI.ClientAPI_ExternalPKICertRequest_cert_set(this.swigCPtr, this, s);
    }
    
    public void setSupportingChain(final String s) {
        ovpncliJNI.ClientAPI_ExternalPKICertRequest_supportingChain_set(this.swigCPtr, this, s);
    }
}

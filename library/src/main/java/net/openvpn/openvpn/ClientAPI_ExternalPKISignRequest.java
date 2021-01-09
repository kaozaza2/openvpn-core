package net.openvpn.openvpn;

public class ClientAPI_ExternalPKISignRequest extends ClientAPI_ExternalPKIRequestBase
{
    private transient long swigCPtr;
    
    public ClientAPI_ExternalPKISignRequest() {
        this(ovpncliJNI.new_ClientAPI_ExternalPKISignRequest(), true);
    }
    
    protected ClientAPI_ExternalPKISignRequest(final long swigCPtr, final boolean b) {
        super(ovpncliJNI.ClientAPI_ExternalPKISignRequest_SWIGUpcast(swigCPtr), b);
        this.swigCPtr = swigCPtr;
    }
    
    protected static long getCPtr(final ClientAPI_ExternalPKISignRequest clientAPI_ExternalPKISignRequest) {
        long swigCPtr;
        if (clientAPI_ExternalPKISignRequest == null) {
            swigCPtr = 0L;
        }
        else {
            swigCPtr = clientAPI_ExternalPKISignRequest.swigCPtr;
        }
        return swigCPtr;
    }
    
    @Override
    public void delete() {
        synchronized (this) {
            if (this.swigCPtr != 0L) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ovpncliJNI.delete_ClientAPI_ExternalPKISignRequest(this.swigCPtr);
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
    
    public String getAlgorithm() {
        return ovpncliJNI.ClientAPI_ExternalPKISignRequest_algorithm_get(this.swigCPtr, this);
    }
    
    public String getData() {
        return ovpncliJNI.ClientAPI_ExternalPKISignRequest_data_get(this.swigCPtr, this);
    }
    
    public String getSig() {
        return ovpncliJNI.ClientAPI_ExternalPKISignRequest_sig_get(this.swigCPtr, this);
    }
    
    public void setAlgorithm(final String s) {
        ovpncliJNI.ClientAPI_ExternalPKISignRequest_algorithm_set(this.swigCPtr, this, s);
    }
    
    public void setData(final String s) {
        ovpncliJNI.ClientAPI_ExternalPKISignRequest_data_set(this.swigCPtr, this, s);
    }
    
    public void setSig(final String s) {
        ovpncliJNI.ClientAPI_ExternalPKISignRequest_sig_set(this.swigCPtr, this, s);
    }
}

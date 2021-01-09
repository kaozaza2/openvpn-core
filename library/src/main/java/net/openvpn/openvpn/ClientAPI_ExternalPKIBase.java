package net.openvpn.openvpn;

public class ClientAPI_ExternalPKIBase
{
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;
    
    protected ClientAPI_ExternalPKIBase(final long swigCPtr, final boolean swigCMemOwn) {
        this.swigCMemOwn = swigCMemOwn;
        this.swigCPtr = swigCPtr;
    }
    
    protected static long getCPtr(final ClientAPI_ExternalPKIBase clientAPI_ExternalPKIBase) {
        long swigCPtr;
        if (clientAPI_ExternalPKIBase == null) {
            swigCPtr = 0L;
        }
        else {
            swigCPtr = clientAPI_ExternalPKIBase.swigCPtr;
        }
        return swigCPtr;
    }
    
    public void delete() {
        synchronized (this) {
            if (this.swigCPtr != 0L) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ovpncliJNI.delete_ClientAPI_ExternalPKIBase(this.swigCPtr);
                }
                this.swigCPtr = 0L;
            }
        }
    }
    
    @Override
    protected void finalize() {
        this.delete();
    }
    
    public boolean sign(final String s, final SWIGTYPE_p_std__string swigtype_p_std__string, final String s2) {
        return ovpncliJNI.ClientAPI_ExternalPKIBase_sign(this.swigCPtr, this, s, SWIGTYPE_p_std__string.getCPtr(swigtype_p_std__string), s2);
    }
}

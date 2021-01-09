package net.openvpn.openvpn;

public class ClientAPI_InterfaceStats
{
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;
    
    public ClientAPI_InterfaceStats() {
        this(ovpncliJNI.new_ClientAPI_InterfaceStats(), true);
    }
    
    protected ClientAPI_InterfaceStats(final long swigCPtr, final boolean swigCMemOwn) {
        this.swigCMemOwn = swigCMemOwn;
        this.swigCPtr = swigCPtr;
    }
    
    protected static long getCPtr(final ClientAPI_InterfaceStats clientAPI_InterfaceStats) {
        long swigCPtr;
        if (clientAPI_InterfaceStats == null) {
            swigCPtr = 0L;
        }
        else {
            swigCPtr = clientAPI_InterfaceStats.swigCPtr;
        }
        return swigCPtr;
    }
    
    public void delete() {
        synchronized (this) {
            if (this.swigCPtr != 0L) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ovpncliJNI.delete_ClientAPI_InterfaceStats(this.swigCPtr);
                }
                this.swigCPtr = 0L;
            }
        }
    }
    
    @Override
    protected void finalize() {
        this.delete();
    }
    
    public long getBytesIn() {
        return ovpncliJNI.ClientAPI_InterfaceStats_bytesIn_get(this.swigCPtr, this);
    }
    
    public long getBytesOut() {
        return ovpncliJNI.ClientAPI_InterfaceStats_bytesOut_get(this.swigCPtr, this);
    }
    
    public long getErrorsIn() {
        return ovpncliJNI.ClientAPI_InterfaceStats_errorsIn_get(this.swigCPtr, this);
    }
    
    public long getErrorsOut() {
        return ovpncliJNI.ClientAPI_InterfaceStats_errorsOut_get(this.swigCPtr, this);
    }
    
    public long getPacketsIn() {
        return ovpncliJNI.ClientAPI_InterfaceStats_packetsIn_get(this.swigCPtr, this);
    }
    
    public long getPacketsOut() {
        return ovpncliJNI.ClientAPI_InterfaceStats_packetsOut_get(this.swigCPtr, this);
    }
    
    public void setBytesIn(final long n) {
        ovpncliJNI.ClientAPI_InterfaceStats_bytesIn_set(this.swigCPtr, this, n);
    }
    
    public void setBytesOut(final long n) {
        ovpncliJNI.ClientAPI_InterfaceStats_bytesOut_set(this.swigCPtr, this, n);
    }
    
    public void setErrorsIn(final long n) {
        ovpncliJNI.ClientAPI_InterfaceStats_errorsIn_set(this.swigCPtr, this, n);
    }
    
    public void setErrorsOut(final long n) {
        ovpncliJNI.ClientAPI_InterfaceStats_errorsOut_set(this.swigCPtr, this, n);
    }
    
    public void setPacketsIn(final long n) {
        ovpncliJNI.ClientAPI_InterfaceStats_packetsIn_set(this.swigCPtr, this, n);
    }
    
    public void setPacketsOut(final long n) {
        ovpncliJNI.ClientAPI_InterfaceStats_packetsOut_set(this.swigCPtr, this, n);
    }
}

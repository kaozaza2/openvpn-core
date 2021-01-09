package net.openvpn.openvpn;

public class ClientAPI_TransportStats
{
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;
    
    public ClientAPI_TransportStats() {
        this(ovpncliJNI.new_ClientAPI_TransportStats(), true);
    }
    
    protected ClientAPI_TransportStats(final long swigCPtr, final boolean swigCMemOwn) {
        this.swigCMemOwn = swigCMemOwn;
        this.swigCPtr = swigCPtr;
    }
    
    protected static long getCPtr(final ClientAPI_TransportStats clientAPI_TransportStats) {
        long swigCPtr;
        if (clientAPI_TransportStats == null) {
            swigCPtr = 0L;
        }
        else {
            swigCPtr = clientAPI_TransportStats.swigCPtr;
        }
        return swigCPtr;
    }
    
    public void delete() {
        synchronized (this) {
            if (this.swigCPtr != 0L) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ovpncliJNI.delete_ClientAPI_TransportStats(this.swigCPtr);
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
        return ovpncliJNI.ClientAPI_TransportStats_bytesIn_get(this.swigCPtr, this);
    }
    
    public long getBytesOut() {
        return ovpncliJNI.ClientAPI_TransportStats_bytesOut_get(this.swigCPtr, this);
    }
    
    public int getLastPacketReceived() {
        return ovpncliJNI.ClientAPI_TransportStats_lastPacketReceived_get(this.swigCPtr, this);
    }
    
    public long getPacketsIn() {
        return ovpncliJNI.ClientAPI_TransportStats_packetsIn_get(this.swigCPtr, this);
    }
    
    public long getPacketsOut() {
        return ovpncliJNI.ClientAPI_TransportStats_packetsOut_get(this.swigCPtr, this);
    }
    
    public void setBytesIn(final long n) {
        ovpncliJNI.ClientAPI_TransportStats_bytesIn_set(this.swigCPtr, this, n);
    }
    
    public void setBytesOut(final long n) {
        ovpncliJNI.ClientAPI_TransportStats_bytesOut_set(this.swigCPtr, this, n);
    }
    
    public void setLastPacketReceived(final int n) {
        ovpncliJNI.ClientAPI_TransportStats_lastPacketReceived_set(this.swigCPtr, this, n);
    }
    
    public void setPacketsIn(final long n) {
        ovpncliJNI.ClientAPI_TransportStats_packetsIn_set(this.swigCPtr, this, n);
    }
    
    public void setPacketsOut(final long n) {
        ovpncliJNI.ClientAPI_TransportStats_packetsOut_set(this.swigCPtr, this, n);
    }
}

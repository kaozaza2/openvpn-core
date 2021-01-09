package net.openvpn.openvpn;

public class ClientAPI_ServerEntry
{
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;
    
    public ClientAPI_ServerEntry() {
        this(ovpncliJNI.new_ClientAPI_ServerEntry(), true);
    }
    
    protected ClientAPI_ServerEntry(final long swigCPtr, final boolean swigCMemOwn) {
        this.swigCMemOwn = swigCMemOwn;
        this.swigCPtr = swigCPtr;
    }
    
    protected static long getCPtr(final ClientAPI_ServerEntry clientAPI_ServerEntry) {
        long swigCPtr;
        if (clientAPI_ServerEntry == null) {
            swigCPtr = 0L;
        }
        else {
            swigCPtr = clientAPI_ServerEntry.swigCPtr;
        }
        return swigCPtr;
    }
    
    public void delete() {
        synchronized (this) {
            if (this.swigCPtr != 0L) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ovpncliJNI.delete_ClientAPI_ServerEntry(this.swigCPtr);
                }
                this.swigCPtr = 0L;
            }
        }
    }
    
    @Override
    protected void finalize() {
        this.delete();
    }
    
    public String getFriendlyName() {
        return ovpncliJNI.ClientAPI_ServerEntry_friendlyName_get(this.swigCPtr, this);
    }
    
    public String getServer() {
        return ovpncliJNI.ClientAPI_ServerEntry_server_get(this.swigCPtr, this);
    }
    
    public void setFriendlyName(final String s) {
        ovpncliJNI.ClientAPI_ServerEntry_friendlyName_set(this.swigCPtr, this, s);
    }
    
    public void setServer(final String s) {
        ovpncliJNI.ClientAPI_ServerEntry_server_set(this.swigCPtr, this, s);
    }
}

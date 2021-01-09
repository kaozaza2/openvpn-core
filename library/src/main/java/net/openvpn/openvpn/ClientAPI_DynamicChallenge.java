package net.openvpn.openvpn;

public class ClientAPI_DynamicChallenge
{
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;
    
    public ClientAPI_DynamicChallenge() {
        this(ovpncliJNI.new_ClientAPI_DynamicChallenge(), true);
    }
    
    protected ClientAPI_DynamicChallenge(final long swigCPtr, final boolean swigCMemOwn) {
        this.swigCMemOwn = swigCMemOwn;
        this.swigCPtr = swigCPtr;
    }
    
    protected static long getCPtr(final ClientAPI_DynamicChallenge clientAPI_DynamicChallenge) {
        long swigCPtr;
        if (clientAPI_DynamicChallenge == null) {
            swigCPtr = 0L;
        }
        else {
            swigCPtr = clientAPI_DynamicChallenge.swigCPtr;
        }
        return swigCPtr;
    }
    
    public void delete() {
        synchronized (this) {
            if (this.swigCPtr != 0L) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ovpncliJNI.delete_ClientAPI_DynamicChallenge(this.swigCPtr);
                }
                this.swigCPtr = 0L;
            }
        }
    }
    
    @Override
    protected void finalize() {
        this.delete();
    }
    
    public String getChallenge() {
        return ovpncliJNI.ClientAPI_DynamicChallenge_challenge_get(this.swigCPtr, this);
    }
    
    public boolean getEcho() {
        return ovpncliJNI.ClientAPI_DynamicChallenge_echo_get(this.swigCPtr, this);
    }
    
    public boolean getResponseRequired() {
        return ovpncliJNI.ClientAPI_DynamicChallenge_responseRequired_get(this.swigCPtr, this);
    }
    
    public String getStateID() {
        return ovpncliJNI.ClientAPI_DynamicChallenge_stateID_get(this.swigCPtr, this);
    }
    
    public void setChallenge(final String s) {
        ovpncliJNI.ClientAPI_DynamicChallenge_challenge_set(this.swigCPtr, this, s);
    }
    
    public void setEcho(final boolean b) {
        ovpncliJNI.ClientAPI_DynamicChallenge_echo_set(this.swigCPtr, this, b);
    }
    
    public void setResponseRequired(final boolean b) {
        ovpncliJNI.ClientAPI_DynamicChallenge_responseRequired_set(this.swigCPtr, this, b);
    }
    
    public void setStateID(final String s) {
        ovpncliJNI.ClientAPI_DynamicChallenge_stateID_set(this.swigCPtr, this, s);
    }
}

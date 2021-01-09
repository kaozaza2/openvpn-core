package net.openvpn.openvpn;

public class ClientAPI_EvalConfig
{
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;
    
    public ClientAPI_EvalConfig() {
        this(ovpncliJNI.new_ClientAPI_EvalConfig(), true);
    }
    
    protected ClientAPI_EvalConfig(final long swigCPtr, final boolean swigCMemOwn) {
        this.swigCMemOwn = swigCMemOwn;
        this.swigCPtr = swigCPtr;
    }
    
    protected static long getCPtr(final ClientAPI_EvalConfig clientAPI_EvalConfig) {
        long swigCPtr;
        if (clientAPI_EvalConfig == null) {
            swigCPtr = 0L;
        }
        else {
            swigCPtr = clientAPI_EvalConfig.swigCPtr;
        }
        return swigCPtr;
    }
    
    public void delete() {
        synchronized (this) {
            if (this.swigCPtr != 0L) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ovpncliJNI.delete_ClientAPI_EvalConfig(this.swigCPtr);
                }
                this.swigCPtr = 0L;
            }
        }
    }
    
    @Override
    protected void finalize() {
        this.delete();
    }
    
    public boolean getAllowPasswordSave() {
        return ovpncliJNI.ClientAPI_EvalConfig_allowPasswordSave_get(this.swigCPtr, this);
    }
    
    public boolean getAutologin() {
        return ovpncliJNI.ClientAPI_EvalConfig_autologin_get(this.swigCPtr, this);
    }
    
    public boolean getError() {
        return ovpncliJNI.ClientAPI_EvalConfig_error_get(this.swigCPtr, this);
    }
    
    public boolean getExternalPki() {
        return ovpncliJNI.ClientAPI_EvalConfig_externalPki_get(this.swigCPtr, this);
    }
    
    public String getFriendlyName() {
        return ovpncliJNI.ClientAPI_EvalConfig_friendlyName_get(this.swigCPtr, this);
    }
    
    public String getMessage() {
        return ovpncliJNI.ClientAPI_EvalConfig_message_get(this.swigCPtr, this);
    }
    
    public boolean getPrivateKeyPasswordRequired() {
        return ovpncliJNI.ClientAPI_EvalConfig_privateKeyPasswordRequired_get(this.swigCPtr, this);
    }
    
    public String getProfileName() {
        return ovpncliJNI.ClientAPI_EvalConfig_profileName_get(this.swigCPtr, this);
    }
    
    public String getRemoteHost() {
        return ovpncliJNI.ClientAPI_EvalConfig_remoteHost_get(this.swigCPtr, this);
    }
    
    public String getRemotePort() {
        return ovpncliJNI.ClientAPI_EvalConfig_remotePort_get(this.swigCPtr, this);
    }
    
    public String getRemoteProto() {
        return ovpncliJNI.ClientAPI_EvalConfig_remoteProto_get(this.swigCPtr, this);
    }
    
    public ClientAPI_ServerEntryVector getServerList() {
        final long clientAPI_EvalConfig_serverList_get = ovpncliJNI.ClientAPI_EvalConfig_serverList_get(this.swigCPtr, this);
        ClientAPI_ServerEntryVector clientAPI_ServerEntryVector;
        if (clientAPI_EvalConfig_serverList_get == 0L) {
            clientAPI_ServerEntryVector = null;
        }
        else {
            clientAPI_ServerEntryVector = new ClientAPI_ServerEntryVector(clientAPI_EvalConfig_serverList_get, false);
        }
        return clientAPI_ServerEntryVector;
    }
    
    public String getStaticChallenge() {
        return ovpncliJNI.ClientAPI_EvalConfig_staticChallenge_get(this.swigCPtr, this);
    }
    
    public boolean getStaticChallengeEcho() {
        return ovpncliJNI.ClientAPI_EvalConfig_staticChallengeEcho_get(this.swigCPtr, this);
    }
    
    public String getUserlockedUsername() {
        return ovpncliJNI.ClientAPI_EvalConfig_userlockedUsername_get(this.swigCPtr, this);
    }
    
    public void setAllowPasswordSave(final boolean b) {
        ovpncliJNI.ClientAPI_EvalConfig_allowPasswordSave_set(this.swigCPtr, this, b);
    }
    
    public void setAutologin(final boolean b) {
        ovpncliJNI.ClientAPI_EvalConfig_autologin_set(this.swigCPtr, this, b);
    }
    
    public void setError(final boolean b) {
        ovpncliJNI.ClientAPI_EvalConfig_error_set(this.swigCPtr, this, b);
    }
    
    public void setExternalPki(final boolean b) {
        ovpncliJNI.ClientAPI_EvalConfig_externalPki_set(this.swigCPtr, this, b);
    }
    
    public void setFriendlyName(final String s) {
        ovpncliJNI.ClientAPI_EvalConfig_friendlyName_set(this.swigCPtr, this, s);
    }
    
    public void setMessage(final String s) {
        ovpncliJNI.ClientAPI_EvalConfig_message_set(this.swigCPtr, this, s);
    }
    
    public void setPrivateKeyPasswordRequired(final boolean b) {
        ovpncliJNI.ClientAPI_EvalConfig_privateKeyPasswordRequired_set(this.swigCPtr, this, b);
    }
    
    public void setProfileName(final String s) {
        ovpncliJNI.ClientAPI_EvalConfig_profileName_set(this.swigCPtr, this, s);
    }
    
    public void setRemoteHost(final String s) {
        ovpncliJNI.ClientAPI_EvalConfig_remoteHost_set(this.swigCPtr, this, s);
    }
    
    public void setRemotePort(final String s) {
        ovpncliJNI.ClientAPI_EvalConfig_remotePort_set(this.swigCPtr, this, s);
    }
    
    public void setRemoteProto(final String s) {
        ovpncliJNI.ClientAPI_EvalConfig_remoteProto_set(this.swigCPtr, this, s);
    }
    
    public void setServerList(final ClientAPI_ServerEntryVector clientAPI_ServerEntryVector) {
        ovpncliJNI.ClientAPI_EvalConfig_serverList_set(this.swigCPtr, this, ClientAPI_ServerEntryVector.getCPtr(clientAPI_ServerEntryVector), clientAPI_ServerEntryVector);
    }
    
    public void setStaticChallenge(final String s) {
        ovpncliJNI.ClientAPI_EvalConfig_staticChallenge_set(this.swigCPtr, this, s);
    }
    
    public void setStaticChallengeEcho(final boolean b) {
        ovpncliJNI.ClientAPI_EvalConfig_staticChallengeEcho_set(this.swigCPtr, this, b);
    }
    
    public void setUserlockedUsername(final String s) {
        ovpncliJNI.ClientAPI_EvalConfig_userlockedUsername_set(this.swigCPtr, this, s);
    }
}

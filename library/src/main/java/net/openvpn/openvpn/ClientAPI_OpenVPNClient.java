package net.openvpn.openvpn;

public class ClientAPI_OpenVPNClient extends ClientAPI_TunBuilderBase
{
    private transient long swigCPtr;
    
    public ClientAPI_OpenVPNClient() {
        this(ovpncliJNI.new_ClientAPI_OpenVPNClient(), true);
        ovpncliJNI.ClientAPI_OpenVPNClient_director_connect(this, this.swigCPtr, true, true);
    }
    
    protected ClientAPI_OpenVPNClient(final long swigCPtr, final boolean b) {
        super(ovpncliJNI.ClientAPI_OpenVPNClient_SWIGUpcast(swigCPtr), b);
        this.swigCPtr = swigCPtr;
    }
    
    public static int app_expire() {
        return ovpncliJNI.ClientAPI_OpenVPNClient_app_expire();
    }
    
    public static String copyright() {
        return ovpncliJNI.ClientAPI_OpenVPNClient_copyright();
    }
    
    public static String crypto_self_test() {
        return ovpncliJNI.ClientAPI_OpenVPNClient_crypto_self_test();
    }
    
    public static ClientAPI_EvalConfig eval_config_static(final ClientAPI_Config clientAPI_Config) {
        return new ClientAPI_EvalConfig(ovpncliJNI.ClientAPI_OpenVPNClient_eval_config_static(ClientAPI_Config.getCPtr(clientAPI_Config), clientAPI_Config), true);
    }
    
    protected static long getCPtr(final ClientAPI_OpenVPNClient clientAPI_OpenVPNClient) {
        long swigCPtr;
        if (clientAPI_OpenVPNClient == null) {
            swigCPtr = 0L;
        }
        else {
            swigCPtr = clientAPI_OpenVPNClient.swigCPtr;
        }
        return swigCPtr;
    }
    
    public static void init_process() {
        ovpncliJNI.ClientAPI_OpenVPNClient_init_process();
    }
    
    public static int max_profile_size() {
        return ovpncliJNI.ClientAPI_OpenVPNClient_max_profile_size();
    }
    
    public static ClientAPI_MergeConfig merge_config_static(final String s, final boolean b) {
        return new ClientAPI_MergeConfig(ovpncliJNI.ClientAPI_OpenVPNClient_merge_config_static(s, b), true);
    }
    
    public static ClientAPI_MergeConfig merge_config_string_static(final String s) {
        return new ClientAPI_MergeConfig(ovpncliJNI.ClientAPI_OpenVPNClient_merge_config_string_static(s), true);
    }
    
    public static boolean parse_dynamic_challenge(final String s, final ClientAPI_DynamicChallenge clientAPI_DynamicChallenge) {
        return ovpncliJNI.ClientAPI_OpenVPNClient_parse_dynamic_challenge(s, ClientAPI_DynamicChallenge.getCPtr(clientAPI_DynamicChallenge), clientAPI_DynamicChallenge);
    }
    
    public static String platform() {
        return ovpncliJNI.ClientAPI_OpenVPNClient_platform();
    }
    
    public static int stats_n() {
        return ovpncliJNI.ClientAPI_OpenVPNClient_stats_n();
    }
    
    public static String stats_name(final int n) {
        return ovpncliJNI.ClientAPI_OpenVPNClient_stats_name(n);
    }
    
    public static void uninit_process() {
        ovpncliJNI.ClientAPI_OpenVPNClient_uninit_process();
    }
    
    public void clock_tick() {
        if (this.getClass() == ClientAPI_OpenVPNClient.class) {
            ovpncliJNI.ClientAPI_OpenVPNClient_clock_tick(this.swigCPtr, this);
        }
        else {
            ovpncliJNI.ClientAPI_OpenVPNClient_clock_tickSwigExplicitClientAPI_OpenVPNClient(this.swigCPtr, this);
        }
    }
    
    public ClientAPI_Status connect() {
        return new ClientAPI_Status(ovpncliJNI.ClientAPI_OpenVPNClient_connect(this.swigCPtr, this), true);
    }
    
    public ClientAPI_ConnectionInfo connection_info() {
        return new ClientAPI_ConnectionInfo(ovpncliJNI.ClientAPI_OpenVPNClient_connection_info(this.swigCPtr, this), true);
    }
    
    @Override
    public void delete() {
        synchronized (this) {
            if (this.swigCPtr != 0L) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ovpncliJNI.delete_ClientAPI_OpenVPNClient(this.swigCPtr);
                }
                this.swigCPtr = 0L;
            }
            super.delete();
        }
    }
    
    public ClientAPI_EvalConfig eval_config(final ClientAPI_Config clientAPI_Config) {
        return new ClientAPI_EvalConfig(ovpncliJNI.ClientAPI_OpenVPNClient_eval_config(this.swigCPtr, this, ClientAPI_Config.getCPtr(clientAPI_Config), clientAPI_Config), true);
    }
    
    public void event(final ClientAPI_Event clientAPI_Event) {
        ovpncliJNI.ClientAPI_OpenVPNClient_event(this.swigCPtr, this, ClientAPI_Event.getCPtr(clientAPI_Event), clientAPI_Event);
    }
    
    public void external_pki_cert_request(final ClientAPI_ExternalPKICertRequest clientAPI_ExternalPKICertRequest) {
        ovpncliJNI.ClientAPI_OpenVPNClient_external_pki_cert_request(this.swigCPtr, this, ClientAPI_ExternalPKICertRequest.getCPtr(clientAPI_ExternalPKICertRequest), clientAPI_ExternalPKICertRequest);
    }
    
    public void external_pki_sign_request(final ClientAPI_ExternalPKISignRequest clientAPI_ExternalPKISignRequest) {
        ovpncliJNI.ClientAPI_OpenVPNClient_external_pki_sign_request(this.swigCPtr, this, ClientAPI_ExternalPKISignRequest.getCPtr(clientAPI_ExternalPKISignRequest), clientAPI_ExternalPKISignRequest);
    }
    
    @Override
    protected void finalize() {
        this.delete();
    }
    
    public void log(final ClientAPI_LogInfo clientAPI_LogInfo) {
        ovpncliJNI.ClientAPI_OpenVPNClient_log(this.swigCPtr, this, ClientAPI_LogInfo.getCPtr(clientAPI_LogInfo), clientAPI_LogInfo);
    }
    
    public void pause(final String s) {
        ovpncliJNI.ClientAPI_OpenVPNClient_pause(this.swigCPtr, this, s);
    }
    
    public boolean pause_on_connection_timeout() {
        return ovpncliJNI.ClientAPI_OpenVPNClient_pause_on_connection_timeout(this.swigCPtr, this);
    }
    
    public void post_cc_msg(final String s) {
        ovpncliJNI.ClientAPI_OpenVPNClient_post_cc_msg(this.swigCPtr, this, s);
    }
    
    public ClientAPI_Status provide_creds(final ClientAPI_ProvideCreds clientAPI_ProvideCreds) {
        return new ClientAPI_Status(ovpncliJNI.ClientAPI_OpenVPNClient_provide_creds(this.swigCPtr, this, ClientAPI_ProvideCreds.getCPtr(clientAPI_ProvideCreds), clientAPI_ProvideCreds), true);
    }
    
    public void reconnect(final int n) {
        ovpncliJNI.ClientAPI_OpenVPNClient_reconnect(this.swigCPtr, this, n);
    }
    
    public void remote_override(final ClientAPI_RemoteOverride clientAPI_RemoteOverride) {
        if (this.getClass() == ClientAPI_OpenVPNClient.class) {
            ovpncliJNI.ClientAPI_OpenVPNClient_remote_override(this.swigCPtr, this, ClientAPI_RemoteOverride.getCPtr(clientAPI_RemoteOverride), clientAPI_RemoteOverride);
        }
        else {
            ovpncliJNI.ClientAPI_OpenVPNClient_remote_overrideSwigExplicitClientAPI_OpenVPNClient(this.swigCPtr, this, ClientAPI_RemoteOverride.getCPtr(clientAPI_RemoteOverride), clientAPI_RemoteOverride);
        }
    }
    
    public boolean remote_override_enabled() {
        boolean b;
        if (this.getClass() == ClientAPI_OpenVPNClient.class) {
            b = ovpncliJNI.ClientAPI_OpenVPNClient_remote_override_enabled(this.swigCPtr, this);
        }
        else {
            b = ovpncliJNI.ClientAPI_OpenVPNClient_remote_override_enabledSwigExplicitClientAPI_OpenVPNClient(this.swigCPtr, this);
        }
        return b;
    }
    
    public void resume() {
        ovpncliJNI.ClientAPI_OpenVPNClient_resume(this.swigCPtr, this);
    }
    
    public boolean session_token(final ClientAPI_SessionToken clientAPI_SessionToken) {
        return ovpncliJNI.ClientAPI_OpenVPNClient_session_token(this.swigCPtr, this, ClientAPI_SessionToken.getCPtr(clientAPI_SessionToken), clientAPI_SessionToken);
    }
    
    public boolean socket_protect(final int n, final String s, final boolean b) {
        boolean b2;
        if (this.getClass() == ClientAPI_OpenVPNClient.class) {
            b2 = ovpncliJNI.ClientAPI_OpenVPNClient_socket_protect(this.swigCPtr, this, n, s, b);
        }
        else {
            b2 = ovpncliJNI.ClientAPI_OpenVPNClient_socket_protectSwigExplicitClientAPI_OpenVPNClient(this.swigCPtr, this, n, s, b);
        }
        return b2;
    }
    
    public ClientAPI_LLVector stats_bundle() {
        return new ClientAPI_LLVector(ovpncliJNI.ClientAPI_OpenVPNClient_stats_bundle(this.swigCPtr, this), true);
    }
    
    public long stats_value(final int n) {
        return ovpncliJNI.ClientAPI_OpenVPNClient_stats_value(this.swigCPtr, this, n);
    }
    
    public void stop() {
        ovpncliJNI.ClientAPI_OpenVPNClient_stop(this.swigCPtr, this);
    }
    
    protected void swigDirectorDisconnect() {
        this.swigCMemOwn = false;
        this.delete();
    }
    
    public void swigReleaseOwnership() {
        this.swigCMemOwn = false;
        ovpncliJNI.ClientAPI_OpenVPNClient_change_ownership(this, this.swigCPtr, false);
    }
    
    public void swigTakeOwnership() {
        this.swigCMemOwn = true;
        ovpncliJNI.ClientAPI_OpenVPNClient_change_ownership(this, this.swigCPtr, true);
    }
    
    public ClientAPI_TransportStats transport_stats() {
        return new ClientAPI_TransportStats(ovpncliJNI.ClientAPI_OpenVPNClient_transport_stats(this.swigCPtr, this), true);
    }
    
    public ClientAPI_InterfaceStats tun_stats() {
        return new ClientAPI_InterfaceStats(ovpncliJNI.ClientAPI_OpenVPNClient_tun_stats(this.swigCPtr, this), true);
    }
}

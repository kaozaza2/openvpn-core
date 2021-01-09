package net.openvpn.openvpn;

public class ClientAPI_TunBuilderBase
{
    protected transient boolean swigCMemOwn;
    private transient long swigCPtr;
    
    public ClientAPI_TunBuilderBase() {
        this(ovpncliJNI.new_ClientAPI_TunBuilderBase(), true);
    }
    
    protected ClientAPI_TunBuilderBase(final long swigCPtr, final boolean swigCMemOwn) {
        this.swigCMemOwn = swigCMemOwn;
        this.swigCPtr = swigCPtr;
    }
    
    protected static long getCPtr(final ClientAPI_TunBuilderBase clientAPI_TunBuilderBase) {
        long swigCPtr;
        if (clientAPI_TunBuilderBase == null) {
            swigCPtr = 0L;
        }
        else {
            swigCPtr = clientAPI_TunBuilderBase.swigCPtr;
        }
        return swigCPtr;
    }
    
    public void delete() {
        synchronized (this) {
            if (this.swigCPtr != 0L) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    ovpncliJNI.delete_ClientAPI_TunBuilderBase(this.swigCPtr);
                }
                this.swigCPtr = 0L;
            }
        }
    }
    
    @Override
    protected void finalize() {
        this.delete();
    }
    
    public boolean tun_builder_add_address(final String s, final int n, final String s2, final boolean b, final boolean b2) {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_add_address(this.swigCPtr, this, s, n, s2, b, b2);
    }
    
    public boolean tun_builder_add_dns_server(final String s, final boolean b) {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_add_dns_server(this.swigCPtr, this, s, b);
    }
    
    public boolean tun_builder_add_proxy_bypass(final String s) {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_add_proxy_bypass(this.swigCPtr, this, s);
    }
    
    public boolean tun_builder_add_route(final String s, final int n, final int n2, final boolean b) {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_add_route(this.swigCPtr, this, s, n, n2, b);
    }
    
    public boolean tun_builder_add_search_domain(final String s) {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_add_search_domain(this.swigCPtr, this, s);
    }
    
    public boolean tun_builder_add_wins_server(final String s) {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_add_wins_server(this.swigCPtr, this, s);
    }
    
    public int tun_builder_establish() {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_establish(this.swigCPtr, this);
    }
    
    public void tun_builder_establish_lite() {
        ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_establish_lite(this.swigCPtr, this);
    }
    
    public boolean tun_builder_exclude_route(final String s, final int n, final int n2, final boolean b) {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_exclude_route(this.swigCPtr, this, s, n, n2, b);
    }
    
    public ClientAPI_StringVec tun_builder_get_local_networks(final boolean b) {
        return new ClientAPI_StringVec(ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_get_local_networks(this.swigCPtr, this, b), true);
    }
    
    public boolean tun_builder_new() {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_new(this.swigCPtr, this);
    }
    
    public boolean tun_builder_persist() {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_persist(this.swigCPtr, this);
    }
    
    public boolean tun_builder_reroute_gw(final boolean b, final boolean b2, final long n) {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_reroute_gw(this.swigCPtr, this, b, b2, n);
    }
    
    public boolean tun_builder_set_adapter_domain_suffix(final String s) {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_set_adapter_domain_suffix(this.swigCPtr, this, s);
    }
    
    public boolean tun_builder_set_block_ipv6(final boolean b) {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_set_block_ipv6(this.swigCPtr, this, b);
    }
    
    public boolean tun_builder_set_layer(final int n) {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_set_layer(this.swigCPtr, this, n);
    }
    
    public boolean tun_builder_set_mtu(final int n) {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_set_mtu(this.swigCPtr, this, n);
    }
    
    public boolean tun_builder_set_proxy_auto_config_url(final String s) {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_set_proxy_auto_config_url(this.swigCPtr, this, s);
    }
    
    public boolean tun_builder_set_proxy_http(final String s, final int n) {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_set_proxy_http(this.swigCPtr, this, s, n);
    }
    
    public boolean tun_builder_set_proxy_https(final String s, final int n) {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_set_proxy_https(this.swigCPtr, this, s, n);
    }
    
    public boolean tun_builder_set_remote_address(final String s, final boolean b) {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_set_remote_address(this.swigCPtr, this, s, b);
    }
    
    public boolean tun_builder_set_route_metric_default(final int n) {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_set_route_metric_default(this.swigCPtr, this, n);
    }
    
    public boolean tun_builder_set_session_name(final String s) {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_set_session_name(this.swigCPtr, this, s);
    }
    
    public void tun_builder_teardown(final boolean b) {
        ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_teardown(this.swigCPtr, this, b);
    }
}

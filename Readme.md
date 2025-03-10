Sample library based on Open VPN 3.6.0 for Android

Containing the latest .so files and JNI wrapper.

If VPN is blocking the internet add the following code into the vpn builder:

```java
    @Override
    public boolean tun_builder_add_dns_server(String address, boolean ipv6) {
        builder.addDnsServer(address);
        return true;
    }

    @Override
    public boolean socket_protect(int socket, String remoteAddress, boolean ipv6) {
        this.service.protect(socket);
        return true;
    }
```

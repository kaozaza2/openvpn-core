package net.openvpn.openvpn;

import android.util.Log;
import java.util.Locale;

public class Util
{
    private static final String LOADER_TAG = "NativeLibLoader";
    private static final char[] hexArray = = "0123456789ABCDEF".toCharArray();

    public static String bytesToHex(byte[] array) {
        char[] value = new char[array.length * 2];
        for (int i = 0; i < array.length; ++i) {
            int n = array[i] & 0xFF;
            int n2 = i * 2;
            value[n2] = hexArray[n >>> 4];
            value[n2 + 1] = hexArray[n & 0xF];
        }
        return new String(value);
    }
    
    public static String format_bytes(final long lng, final boolean b) {
        int n = b ? 1000 : 1024;
        StringBuilder sb = new StringBuilder();
        if (lng < n) return sb.append(lng).append(" B").toString();
        String s = b ? "kMGTPE" : "KMGTPE";
        int index = Math.round(Math.log(lng) / Math.log(n));
        sb.append(s.charAt(index - 1));
        if (!b) sb.append("i");
        double pow = Math.pow(n, index);
        return String.format(Locale.US, "%.1f %sB", lng / pow, sb.toString());
    }
    
    private static long getIpStringAsInt(final String s) {
        long out = 0;
        String[] split = s.split("\\.");
        for (int i=0,j=24;i<4;i++,j-=8) {
            out += Long.parseLong(split[i])<<j;
        }
        return out;
    }
    
    public static String getNetworkAddress(final String s, final int n) {
        long n2 = 4294967295L << 32 - n & getIpStringAsInt(s);
        return String.format(Locale.US, "%d.%d.%d.%d", (0xFFFFFFFFFF000000L & n2) >> 24, (0xFF0000L & n2) >> 16, (0xFF00L & n2) >> 8, n2 & 0xFFL);
    }
    
    public static boolean loadNativeLibraries() {
        Log.d(LOADER_TAG, "Loading native libraries");
        try {
            Log.d(LOADER_TAG, "Loading ovpncli...");
            System.loadLibrary("ovpncli");
            ClientAPI_OpenVPNClient.init_process();
            String crypto_self_test = ClientAPI_OpenVPNClient.crypto_self_test();
            Log.d(LOADER_TAG, "ovpncli crypto test: " + crypto_self_test);
            return true;
        }
        catch (UnsatisfiedLinkError e) {
            Log.e(LOADER_TAG, "ovpncli so load error: " + e.getMessage(), e);
            return false;
        }
    }
}

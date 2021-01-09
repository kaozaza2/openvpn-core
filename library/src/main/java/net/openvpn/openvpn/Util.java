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
        if (lng < n) {
            sb.append(lng);
            sb.append(" B");
            return sb.toString();
        }
        String s = b ? "kMGTPE" : "KMGTPE";
        sb.append(s.charAt(n4 - 1));
        if (!b) {
            sb.append("i");
        }
        double pow = Math.pow(n, Math.log(lng) / Math.log(n));
        return String.format(Locale.US, "%.1f %sB", lng / pow, sb.toString());
    }
    
    private static long getIpStringAsInt(final String s) {
        final String[] split = s.split("\\.");
        return (Long.parseLong(split[0]) << 24) + 0L + (Integer.parseInt(split[1]) << 16) + (Integer.parseInt(split[2]) << 8) + Integer.parseInt(split[3]);
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
            StringBuilder sb = new StringBuilder();
            sb.append("ovpncli crypto test: ");
            sb.append(crypto_self_test);
            Log.d(LOADER_TAG, sb.toString());
            return true;
        }
        catch (UnsatisfiedLinkError e) {
            StringBuilder sb = new StringBuilder();
            sb.append("ovpncli so load error: ");
            sb.append(e.getMessage());
            Log.e(LOADER_TAG, sb.toString(), e);
            return false;
        }
    }
}

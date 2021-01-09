package net.openvpn.openvpn;

public class CPUUsage
{
    private double end_time;
    private boolean halted;
    private double start_time;
    
    public CPUUsage() {
        this.halted = false;
        this.start_time = cpu_usage();
        this.end_time = 0.0;
    }
    
    private static native double cpu_usage();
    
    public void stop() {
        if (!this.halted) {
            this.end_time = cpu_usage();
            this.halted = true;
        }
    }
    
    public double usage() {
        double n;
        if (this.halted) {
            n = this.end_time;
        }
        else {
            n = cpu_usage();
        }
        return n - this.start_time;
    }
}

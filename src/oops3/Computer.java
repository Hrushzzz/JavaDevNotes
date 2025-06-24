package oops3;

public class Computer {
    private int ram;
    private static String CpuArch;  // stored at class level

    public static void printRam() {
        // access RAM
    }

    public void printCPUArch() {
        // access static CpuArch
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public static String getCpuArch() {
        return CpuArch;
    }

    public static void setCpuArch(String cpuArch) {
        CpuArch = cpuArch;
    }
}

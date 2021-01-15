//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package computer;

public class Monitor {
    private int monitorDiagonal;
    private String monitorBrand;

    public Monitor(int monitorDiagonal, String monitorBrand) {
        this.monitorDiagonal = monitorDiagonal;
        this.monitorBrand = monitorBrand;
    }

    public int getMonitorDiagonal() {
        return this.monitorDiagonal;
    }

    public void setMonitorDiagonal(int monitorDiagonal) {
        this.monitorDiagonal = monitorDiagonal;
    }

    public String getMonitorBrand() {
        return this.monitorBrand;
    }

    public void setMonitorBrand(String monitorBrand) {
        this.monitorBrand = monitorBrand;
    }

    public String toString() {
        return "Monitor{monitorDiagonal=" + this.monitorDiagonal + ", monitorBrand='" + this.monitorBrand + "'}";
    }
}

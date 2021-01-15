//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package computer;

public class SystemBlock {
    private Motherboard motherboard;
    private Disk disk;

    public SystemBlock(Motherboard motherboard, Disk disk) {
        this.motherboard = motherboard;
        this.disk = disk;
    }

    public Motherboard getMotherboard() {
        return this.motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Disk getDisk() {
        return this.disk;
    }

    public String toString() {
        return "SystemBlock{motherboard=" + this.motherboard + ", disk=" + this.disk + "}";
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }
}

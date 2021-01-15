//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package computer;

public class Computer {
    protected Mouse mouse;
    protected Monitor monitor;
    protected SystemBlock systemBlock;
    protected Adapter adapter;

    public Computer(Mouse mouse, Monitor monitor, SystemBlock systemBlock, Adapter adapter) {
        this.mouse = mouse;
        this.monitor = monitor;
        this.systemBlock = systemBlock;
        this.adapter = adapter;
    }

    public Mouse getMouse() {
        return this.mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Monitor getMonitor() {
        return this.monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public SystemBlock getSystemBlock() {
        return this.systemBlock;
    }

    public void setSystemBlock(SystemBlock systemBlock) {
        this.systemBlock = systemBlock;
    }

    public Adapter getAdapter() {
        return this.adapter;
    }

    public void setAdapter(Adapter adapter) {
        this.adapter = adapter;
    }

    public String toString() {
        return "Computer{mouse=" + this.mouse + ", monitor=" + this.monitor + ", systemBlock=" + this.systemBlock + ", adapter=" + this.adapter + "}";
    }
}

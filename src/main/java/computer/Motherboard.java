//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package computer;

public class Motherboard {
    protected String brand;
    protected String model;
    protected Processor processor;
    protected Memory memory;

    public Motherboard(String brand, String model, Processor processor, Memory memory) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.memory = memory;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Processor getProcessor() {
        return this.processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Memory getMemory() {
        return this.memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public String toString() {
        return "Motherboard{brand='" + this.brand + "', model='" + this.model + "', processor=" + this.processor + ", memory=" + this.memory + "}";
    }
}

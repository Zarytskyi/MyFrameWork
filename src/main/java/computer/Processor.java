//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package computer;

public class Processor {
    private String model;
    private String brand;

    public Processor(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String toString() {
        return "Processor{model='" + this.model + "', brand='" + this.brand + "'}";
    }
}

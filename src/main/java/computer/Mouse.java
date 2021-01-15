//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package computer;

public class Mouse {
    private String mouseBrand;
    private String mouseModel;

    public Mouse(String mouseBrand, String mouseModel) {
        this.mouseBrand = mouseBrand;
        this.mouseModel = mouseModel;
    }

    public String getMouseBrand() {
        return this.mouseBrand;
    }

    public void setMouseBrand(String mouseBrand) {
        this.mouseBrand = mouseBrand;
    }

    public String getMouseModel() {
        return this.mouseModel;
    }

    public void setMouseModel(String mouseModel) {
        this.mouseModel = mouseModel;
    }

    public String toString() {
        return "Mouse{mouseBrand='" + this.mouseBrand + "', mouseModel='" + this.mouseModel + "'}";
    }
}

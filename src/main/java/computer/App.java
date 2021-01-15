//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package computer;

public class App {
    public App() {
    }

    public static void main(String[] args) {
        new Keyboard("razer");
        Motherboard myMotherboard = new Motherboard("amd", "r23", new Processor("amd", "rizen"), new Memory(180));
        System.out.println(myMotherboard);
        SystemBlock mySystemBlock = new SystemBlock(myMotherboard, new Disk("gh45", 123));
        new Adapter("H7");
        Computer myComputer = new Computer(new Mouse("razer", "razer"), new Monitor(19, "samsung"), mySystemBlock, new Adapter("opi10"));
        System.out.println(myComputer);
    }
}

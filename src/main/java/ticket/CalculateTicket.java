package ticket;

public class CalculateTicket {
    private double baseFare;
    private int age;

    public CalculateTicket(double baseFare, int age) {
        this.baseFare = baseFare;
        this.age = age;
    }
    public double getPrice() {
        if (this.age <= 2) {
            return 0;
        }
        if (this.age <= 12) {
            return this.baseFare * 0.5;
        }
        if (this.age > 66) {
            return this.baseFare * 0.8;
        }
        else return this.baseFare;
    }
}

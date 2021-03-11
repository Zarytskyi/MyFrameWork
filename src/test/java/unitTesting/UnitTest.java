package unitTesting;

import org.testng.Assert;
import org.testng.annotations.Test; // any test is only a void method
import ticket.CalculateTicket;

public class UnitTest {
    @Test
    public void infant_ticketPriceIsZero(){
        // Arrange (pre conditions/given)
        CalculateTicket infant = new CalculateTicket(1000,1); // nee instant of CalculateTicket
        // Act
        double price = infant.getPrice(); // method invoke
        // Assert
        Assert.assertEquals(price, 0.0);
    }
    @Test
    public void kid_ticketIs50percent(){
        CalculateTicket kid = new CalculateTicket(1000, 11);
        double price = kid.getPrice();
        Assert.assertEquals(price, 500.0);
    }
    @Test
    public void adult_ticketFullPrice(){
        CalculateTicket adult = new CalculateTicket(1000, 50);
        double price = adult.getPrice();
        Assert.assertEquals(price, 1000.0);
    }
    @Test
    public void senior_Ticketis80percent(){
        CalculateTicket senior = new CalculateTicket(1000, 68);
        double price = senior.getPrice();
        Assert.assertEquals(price, 800.0);
    }
}

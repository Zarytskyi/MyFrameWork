package unitTesting;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ticket.CalculateTicket;

// This is DATA PROVIDER
// can be used if test body is the same but different parameters(data) can be used. That's were we are using it

public class Parametrize { // we create a class
@DataProvider(name = "ticketsInfo") // set a data provider with ....
public Object[][] createData(){
    return new Object[][]{
            {1000, 1,0.0}, // first test
            {1000, 5, 500.0}, // second test
            {1000, 23, 1000.0},
            {1000, 70, 800.0}
    };// this data for test

}
 @Test(dataProvider = "ticketsInfo") // set the same method
    public void testTicketPrice(int basePrice, int age, double expectedPrice){
     CalculateTicket calculateTicket = new CalculateTicket(basePrice, age); // use a class CalculateTicket that contains math
     double actualPrice = calculateTicket.getPrice(); //call for function .getPrice
     Assert.assertEquals(expectedPrice, actualPrice);
 }
}

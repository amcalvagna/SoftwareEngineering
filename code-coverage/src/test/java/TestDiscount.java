import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestDiscount {

    @Test
    public void shouldGiveDiscount() {
        Status s = Discount.giveDiscount(100, true);
        assertEquals(Status.DISCOUNT, s);
    }
 
    @Test
    public void shouldNotGiveDiscount() {
        Status s = Discount.giveDiscount(20, false);
        assertEquals(Status.FULLPRICE, s);
    }
 
    @Test
    public void shouldGiveError() {
        Status s = Discount.giveDiscount(0, false);
        assertEquals(Status.ERROR, s);
    }
 

}

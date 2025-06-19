import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DailySpecialsHelperTest {

    @Test
    public void testIsWeekend() {
        assertTrue(DailySpecialsHelper.isWeekend("Sunday"));
        assertFalse(DailySpecialsHelper.isWeekend("Monday"));
    }

    @Test
    public void testGetCoffee() {
        assertEquals("Latte", DailySpecialsHelper.getCoffee("Monday"));
        assertEquals("Unknown", DailySpecialsHelper.getCoffee("Sunday"));
    }

    @Test
    public void testGetPrice() {
        assertEquals(4.95, DailySpecialsHelper.getPrice("Monday"), 0.01);
    }

    @Test
    public void testCalculateTotal() {
        assertEquals(19.80, DailySpecialsHelper.calculateTotal(4.95, 4), 0.01); // no discount
        assertEquals(22.28, DailySpecialsHelper.calculateTotal(4.95, 5), 0.01); // 10%
        assertEquals(39.60, DailySpecialsHelper.calculateTotal(4.95, 10), 0.01); // 20%
    }
}

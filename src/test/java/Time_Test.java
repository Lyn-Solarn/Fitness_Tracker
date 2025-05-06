import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Time_Test {
    @Test
    public void testHours() {
        Time t = new Time(120);
        int result = t.toHours();
        assertEquals(2, result);
    }
    @Test
    public void testToString() {
        Time t = new Time (130);
        String result = t.toString();
        assertEquals("2 hr 10 min", result);
    }
}

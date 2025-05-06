import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrackerEntry_Test {
    TrackerEntry entry;

    @BeforeEach
    void setup() {
        entry = new TrackerEntry(new Workout(0), new Time(60));
    }

    @Test
    public void getPointsEarned() {
        assertEquals(120, entry.getPointsEarned());
    }

    @Test
    public void toStringTest() {
        assertEquals("Running - 1 hr 0 min -=-=- Points Earned: 120", entry.toString());
    }
}

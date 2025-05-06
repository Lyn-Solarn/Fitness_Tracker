import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tracker_Test {
    Tracker tracker;

    @BeforeEach
    void setup(){
        tracker = new Tracker();
    }

    @Test
    public void addNewEntry() {
        tracker.addEntry(new TrackerEntry(new Workout(1), new Time(45)));
        assertEquals(1, tracker.getSize());
        assertEquals("1. Walking - 0 hr 45 min -=-=- Points Earned: 45\n", tracker.toString());
    }

    @Test
    public void addMultipleEntries() {
        tracker.addEntry(new TrackerEntry(new Workout(1), new Time(45)));
        tracker.addEntry(new TrackerEntry(new Workout(0), new Time(60)));
        tracker.addEntry(new TrackerEntry(new Workout(4), new Time(130)));
        assertEquals(3, tracker.getSize());
        assertEquals("""
                1. Walking - 0 hr 45 min -=-=- Points Earned: 45
                2. Running - 1 hr 0 min -=-=- Points Earned: 120
                3. Weightlifting - 2 hr 10 min -=-=- Points Earned: 650
                """, tracker.toString());
    }

    @Test
    public void removeEntry() {
        tracker.addEntry(new TrackerEntry(new Workout(1), new Time(45)));
        tracker.addEntry(new TrackerEntry(new Workout(0), new Time(60)));
        tracker.addEntry(new TrackerEntry(new Workout(4), new Time(130)));
        tracker.removeEntry(2);
        assertEquals(2, tracker.getSize());
        assertEquals("""
                1. Walking - 0 hr 45 min -=-=- Points Earned: 45
                2. Running - 1 hr 0 min -=-=- Points Earned: 120
                """, tracker.toString());
    }
}

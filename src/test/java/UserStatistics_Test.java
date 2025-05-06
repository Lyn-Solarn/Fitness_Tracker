import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserStatistics_Test {
    UserStatistics user;

    @BeforeEach
    void setup(){
        user = new UserStatistics("John Doe", new Tracker());
        user.getWorkoutTracker().addEntry(new TrackerEntry(new Workout(1), new Time(45)));
        user.getWorkoutTracker().addEntry(new TrackerEntry(new Workout(0), new Time(60)));
        user.getWorkoutTracker().addEntry(new TrackerEntry(new Workout(0), new Time(130)));
    }

    @Test
    public void totalPoints() {
        assertEquals(425, user.totalPoints());
    }

    @Test
    public void totalTime() {
        assertEquals("3 hr 55 min", user.totalTime().toString());
    }

    @Test
    public void averageTime() {
        assertEquals("1 hr 18 min", user.averageTime().toString());
    }

    @Test
    public void leastAndMostPopular() {
        assertEquals("Running", user.mostPopularWorkout());
        assertEquals("Walking", user.leastPopularWorkout());
    }
}

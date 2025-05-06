import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Workout_Test {
    Workout test;

    @BeforeEach
    void setup(){
        test = new Workout(3);
    }

    @Test
    public void getType() {
        assertEquals("Cycling", test.getType());
    }

    @Test
    public void getPointsMultiplier() {
        assertEquals(3, test.getPointsMultiplier());
    }
}

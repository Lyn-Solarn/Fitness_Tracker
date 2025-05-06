import java.util.ArrayList;

public class Workout {
    private static final ArrayList<String> types = new ArrayList<>();
    private static final ArrayList<Integer> multipliers = new ArrayList<>();

    private String type;
    private int multiplier;

    static {
        types.add("Running");
        multipliers.add(2);
        types.add("Walking");
        multipliers.add(1);
        types.add("Swimming");
        multipliers.add(3);
        types.add("Cycling");
        multipliers.add(3);
        types.add("Weightlifting");
        multipliers.add(5);
    }

    public Workout(int index) {
        this.type = types.get(index);
        this.multiplier = multipliers.get(index);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPointsMultiplier() {
        return multiplier;
    }

    public void setPointsMultiplier(int pointsMultiplier) {
        this.multiplier = pointsMultiplier;
    }
}

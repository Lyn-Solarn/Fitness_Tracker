public abstract class Workout {
    private String type;
    private int pointsMultiplier;

    public Workout(String type, int pointsMultiplier) {
        this.type = type;
        this.pointsMultiplier = pointsMultiplier;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPointsMultiplier() {
        return pointsMultiplier;
    }

    public void setPointsMultiplier(int pointsMultiplier) {
        this.pointsMultiplier = pointsMultiplier;
    }
}

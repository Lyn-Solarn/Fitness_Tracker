public class UserStatistics {
    private String username;
    private Tracker workoutTracker;

    public UserStatistics(String username, Tracker workoutTracker) {
        this.username = username;
        this.workoutTracker = workoutTracker;
    }

    //TO-DO
    public int totalPoints() {
        return 0;
    }

    //TO-DO
    public Time averageTime() {
        return null;
    }

    //TO-DO
    public String mostPopularWorkout() {
        return "";
    }

    //TO-DO
    public String leastPopularWorkout() {
        return "";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Tracker getWorkoutTracker() {
        return workoutTracker;
    }

    public void setWorkoutTracker(Tracker workoutTracker) {
        this.workoutTracker = workoutTracker;
    }
}

public class UserStatistics {
    private String username;
    private Tracker workoutTracker;

    public UserStatistics(String username, Tracker workoutTracker) {
        this.username = username;
        this.workoutTracker = workoutTracker;
    }

    public int totalPoints() {
        int totalPoints = 0;
        for(int i=0; i < workoutTracker.getSize(); i++) {
            totalPoints += workoutTracker.getEntry(i).getPointsEarned();
        }
        return totalPoints;
    }
    
    public Time totalTime() {
        int totalTime = 0;
        for(int i=0; i < workoutTracker.getSize(); i++) {
            totalTime += workoutTracker.getEntry(i).getDuration().getMinutes();
        }
        return new Time(totalTime);
    }

    public Time averageTime() {
        return new Time(totalTime().getMinutes()/workoutTracker.getSize());
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

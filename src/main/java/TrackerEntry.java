public class TrackerEntry {
    private Workout workout;
    private Time duration;

    public TrackerEntry(Workout workout, Time duration) {
        this.workout = workout;
        this.duration = duration;
    }

    //TO-DO
    public int getPointsEarned() {
        return 0;
    }

    public Workout getWorkout() {
        return workout;
    }

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }

    public Time getDuration() {
        return duration;
    }

    public void setDuration(Time duration) {
        this.duration = duration;
    }
}

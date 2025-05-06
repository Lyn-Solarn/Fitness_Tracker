import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Workout> workoutChoices = new ArrayList<>();
        UserStatistics user = new UserStatistics("John Doe");

        workoutChoices.add(new Workout(0));
        workoutChoices.add(new Workout(1));
        workoutChoices.add(new Workout(2));
        workoutChoices.add(new Workout(3));
        workoutChoices.add(new Workout(4));

        int index = 1;
        while (index != -1) {
            for (int i = 0; i < workoutChoices.size(); i++) {
                System.out.println(i + " - " + workoutChoices.get(i).getType());
            }
            System.out.print("Enter a workout index (-1 to stop): ");
            index = scan.nextInt();
            if (index == -1) {
                break;
            }
            try {
                workoutChoices.get(index);
            } catch (Exception e) {
                System.out.println("Invalid index");
                continue;
            }
            System.out.print("Enter a duration in minutes: ");
            Time t = new Time(scan.nextInt());
            user.getWorkoutTracker().addEntry(new TrackerEntry(workoutChoices.get(index), t));

        }
        System.out.println(user.getWorkoutTracker());
        System.out.println("Total Points: " + user.totalPoints());
        System.out.println("Total Time: " + user.totalTime());
        System.out.println("Average Time: " + user.averageTime());
        System.out.println("Most Popular: " + user.mostPopularWorkout());
        System.out.println("Least Popular: " + user.leastPopularWorkout());
    }
}

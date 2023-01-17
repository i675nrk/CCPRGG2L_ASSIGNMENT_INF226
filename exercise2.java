import java.util.Scanner;

public class exercise2 {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        drive("training");
        scan.close();
    }

    static void drive(String training) {

        System.out.println("Driving!");
        practice(training);

        String feedback = getFeedBackFromInstructor(training);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            improveSkill(training);

            // Recursive call
            drive(training);
        } else if (feedback.equals("yes")) {
            proceed(training);
        }
    }

    static void practice(String training) {
        System.out.println("Test Drive");
    }

    static String getFeedBackFromInstructor(String training) {
        System.out.println("Did you pass the " + training + " on driving?");

        String feedback = scan.next();

        return feedback;
    }

    static void improveSkill(String training) {
        System.out.print("Enter skill:");
        String skill = scan.next();
        System.out.println("Driving improved. Skill Added: " + skill);
    }

    static void proceed(String training) {
        System.out.println("Passed " + training);
    }

}


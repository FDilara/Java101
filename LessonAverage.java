import java.util.Scanner;
public class LessonAverage {
    //Average calculation without using if,else blocks
    public static void main(String[] args) {
        //Variables
        int maths, physics, chemical;
        double average;

        //For the user to enter a exam points
        Scanner input = new Scanner(System.in);

        System.out.println("Your mathematics grade:");
        maths = input.nextInt();
        System.out.println("Your physics grade:");
        physics = input.nextInt();
        System.out.println("Your chemistry grade:");
        chemical = input.nextInt();

        average = (maths + physics + chemical) / 3.0;

        String result = (average > 60) ? "Passed the class" : "Failed the class";
        System.out.println(result);
    }
}

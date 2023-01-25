import java.util.Scanner;
//Class Passing Status 
public class ClassPassStatus {
    public static void main(String[] args){
        int firstPoint, midtermPoint, finalPoint;
        double result;

        Scanner input = new Scanner(System.in);

        System.out.println("First exam point: ");
        firstPoint = input.nextInt();

        System.out.println("Midterm exam point: ");
        midtermPoint = input.nextInt();

        System.out.println("Final exam point: ");
        finalPoint = input.nextInt();

        if(firstPoint>=50 && midtermPoint>=50 && finalPoint>=50) {
            result = (firstPoint+midtermPoint+finalPoint) / 3.0;
        } else if (firstPoint<50) {
            result = (midtermPoint+finalPoint) / 2.0;
        } else if (midtermPoint<50) {
            result = (firstPoint+finalPoint) / 2.0;
        } else {
            result = (firstPoint+midtermPoint) / 2.0;
        }

        System.out.print("Result: "+ result + "\n");

        if(result>=60) {
            System.out.println("You did pass class!");
        }else {
            System.out.println("You did not pass class!!!");
        }
    }
}

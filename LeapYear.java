import java.util.Scanner;
// Leap year calculator
public class LeapYear {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year: ");
        year = input.nextInt();

        if(year%400==0) {
            System.out.println("Lead Year!");
        } else {
            System.out.println("Not Lead Year!");
        }
    }
}

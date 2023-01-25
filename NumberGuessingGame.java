import java.util.Scanner;
//Number Guessing Game
//Between 0-100
public class NumberGuessingGame {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);
        int value;
        Scanner input = new Scanner(System.in);

        int count = 0;
        while (count < 10) {
            System.out.println("Enter a guess (1-100): ");
            value = input.nextInt();
            if (value == number) {
                System.out.println("Number found: " + number);
                break;
            } else if (value > number) {
                System.out.println("Greater than the number!");
            } else {
                System.out.println("Less than the number!");
            }
            count++;
            System.out.println((10 - count) + " chances left");
            if ((10 - count) == 0) {
                System.out.println("You loss!");
                System.out.println("Number: "+number);
            }
        }
    }
}

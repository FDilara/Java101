import java.util.Scanner;
//Program to print powers of 4 and 5
public class PowerOfNumbers {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        number = input.nextInt();

        System.out.println("Power of 4");
        for(int i=1; i<=number; i*=4) {
            System.out.println(i);
        }

        System.out.println("Power of 5");
        for(int j=1; j<=number; j*=5) {
            System.out.println(j);
        }
    }
}

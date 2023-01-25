import java.util.Scanner;
//Program that calculates exponents
public class ExponentialNumber {
    public static void main(String[] args) {
        int a, b, result=1;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the a value for exponential operation: ");
        a = input.nextInt();

        System.out.println("Enter the b value for exponent: ");
        b = input.nextInt();

        for(int i=0; i<b; i++) {
            result *= a;
        }
        System.out.println("Result: " + result);
    }
}

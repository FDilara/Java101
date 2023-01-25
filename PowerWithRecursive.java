import java.util.Scanner;
//Program that performs exponentiation using the "recursive" method
public class PowerWithRecursive {
    static int power(int a, int b) {
        if(b==0){
            return 1;
        }
        return a * power(a, b-1);
    }

    public static void main(String[] args) {
        int base, exponent;
        Scanner input = new Scanner(System.in);

        System.out.print("Base value: ");
        base = input.nextInt();
        System.out.print("Exponent value: ");
        exponent = input.nextInt();
        System.out.println("Result: "+power(base, exponent));
    }
}

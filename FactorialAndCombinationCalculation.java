import java.util.Scanner;
//C(n,r) = n! / (r! * (n-r)!)
//k! = 1*2*3*4*...*k
public class FactorialAndCombinationCalculation {
    public static void main(String[] args) {
        int k,n,r, combinationResult=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the k value for factorial operation: ");
        k = input.nextInt();

        //factorial(k);

        System.out.println("Enter the n value for combination operation: ");
        n = input.nextInt();

        System.out.println("Enter the r value for combination operation: ");
        r = input.nextInt();

        combinationResult = factorial(n) / (factorial(r) * factorial(n-r));

        System.out.print("Factorial Result: "+ factorial(k)
                + "\n" +
                "Combination Result: "+combinationResult);

    }

    static int factorial(int a) {
        int factorialResult=1;
        for(int i=1; i<=a; i++) {
            factorialResult *= i;
        }
        return factorialResult;
    }
}

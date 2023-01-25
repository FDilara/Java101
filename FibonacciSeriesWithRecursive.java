import java.util.Scanner;
//Program to find element of fibonacci series with recursive function.
public class FibonacciSeriesWithRecursive {
    public static void main(String[] args) {
        int n;

        Scanner input = new Scanner(System.in);

        System.out.println("Which element of the fibonacci series? ");
        n = input.nextInt();

        System.out.println(fibonacci(n));
    }

    static int fibonacci(int a) {
        if(a==1 || a==2) {
            return 1;
        }
        return fibonacci(a-1) + fibonacci(a-2);
    }
}

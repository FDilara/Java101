import java.util.Scanner;
//Program to find fibonacci series with loops.
//Get the number of elements of the Fibonacci series from the user.
public class FibonacciSeries {
    public static void main(String[] args) {
        int n;

        Scanner input = new Scanner(System.in);

        System.out.println("Number of elements: ");
        n = input.nextInt();

        int numbers[] = new int[n];

        numbers[0] = 0;
        numbers[1] = 1;
        System.out.print(numbers[0]+ " "+numbers[1]+" ");
        for (int i=2; i<n; i++) {
            numbers[i] = numbers[i-1] + numbers[i-2];
            System.out.print(numbers[i]+ " ");
        }

    }
}

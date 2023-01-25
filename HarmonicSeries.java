import java.util.Scanner;
//Program to find the harmonic series of the entered number
public class HarmonicSeries {
    //1+(1/2)+(1/3)+(1/4)+...+(1/n)
    public static void main(String[] args) {
        int n;
        double harmonicSeriesTotal=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the n: ");
        n = input.nextInt();

        for (int i=1; i<=n; i++) {
            harmonicSeriesTotal += (1.0/i);
        }

        System.out.println("Sum: " + harmonicSeriesTotal);

    }
}

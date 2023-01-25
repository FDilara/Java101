import java.util.Scanner;
//Program that draws an inverted triangle
public class TriangleWithStars {
    public static void main(String[] args) {
        int n;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the step number: ");
        n = input.nextInt();

        for (int i=10; 0<i; i--) {
            for(int j=i; j<10;j++) {
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println(" ");
        }

    }
}

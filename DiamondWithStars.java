import java.util.Scanner;
//Diamond drawing with stars using loops
public class DiamondWithStars {
    public static void main(String[] args) {
        int i, k, n, j, l, m;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        n = scanner.nextInt();

        for(i=1; i<=n; i++) {
            for(k=n; k>i; k--) {
                System.out.print(" ");
            }
            for (j=1; j<=i ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        for (k=1; k<=n; k++) {
            for (l=1 ; l<=k; l++) {
                System.out.print(" ");
            }
            for (m=n; m>k ; m--) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}

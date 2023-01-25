import java.util.Scanner;
//Program that prints Matrix Transpose
public class MatrixTranspose {
    public static void main(String[] args) {
        int m, n;

        Scanner input = new Scanner(System.in);
        System.out.println("Matrix row value: ");
        m = input.nextInt();
        System.out.println("Matrix column value: ");
        n = input.nextInt();

        int matrix[][] = new int[m][n];
        int matrixTranspose[][] = new int[n][m];

        System.out.println("Enter the matrix elements: ");

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                matrix[i][j] = input.nextInt();
                matrixTranspose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Matrix: ");

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }

        System.out.println("Matrix transpose: ");

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                System.out.print(matrixTranspose[i][j] + " ");
            }
            System.out.print("\n");
        }

    }

}

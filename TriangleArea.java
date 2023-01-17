import java.util.Scanner;
/* Perimeter of triangle: 2u
*  u = (a+b+c) / 2
*  Area*Area = u*(u-a)*(u-b)*(u-c)
* */
public class TriangleArea {
        public static void main(String[] args) {
            int firstEdge, secondEdge, thirdEdge;
            double u, area;

            Scanner input = new Scanner(System.in);

            //Edges values entered
            System.out.println("Enter the first edge:");
            firstEdge = input.nextInt();

            System.out.println("Enter the second edge:");
            secondEdge = input.nextInt();

            System.out.println("Enter the third edge:");
            thirdEdge = input.nextInt();

            //Area calculated
            u = (firstEdge + secondEdge + thirdEdge) / 2;
            area = Math.sqrt(u*(u-firstEdge)*(u-secondEdge)*(u-thirdEdge));

            //Printed to the screen
            System.out.println("Triangle area: " + area);
        }
}

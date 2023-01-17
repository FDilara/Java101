import java.util.Scanner;
//Area of the circle piece
/*
* Area = (pi*(radius*radius)*angle) / 360
* */
public class CircleArea {
    public static void main(String[] args) {
        int angle, radius;
        double pi = 3.14, area;

        Scanner input = new Scanner(System.in);

        //Edges values entered
        System.out.println("Enter the angle:");
        angle = input.nextInt();

        System.out.println("Enter the radius:");
        radius = input.nextInt();

        //Area calculated
        area = pi*(radius*radius)*angle / 360;

        //Printed to the screen
        System.out.println("Circle area: " + area);
    }
}

import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {
        double kg, m, bodyMassIndex;

        Scanner input = new Scanner(System.in);

        //Edges values entered
        System.out.println("Enter the kilo:");
        kg = input.nextDouble();

        System.out.println("Enter the size:");
        m = input.nextDouble();

        bodyMassIndex = kg / (m * m);

        //Printed to the screen
        System.out.println("Your body mass ındex: " + bodyMassIndex);
    }
}

import java.util.Scanner;
//Calculator
public class Calculator {
    public static void main(String[] args) {
        int firstNumber, secondNumber, choice;
        Scanner input = new Scanner(System.in);

        System.out.println("First number: ");
        firstNumber = input.nextInt();
        System.out.println("Second number: ");
        secondNumber = input.nextInt();

        System.out.println("1.Add\n2.Sub\n3.Mul\n4.Div");
        System.out.println("Choose: ");

        choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: "+(firstNumber+secondNumber));
                break;
            case 2:
                System.out.println("Result: "+(firstNumber-secondNumber));
                break;
            case 3:
                System.out.println("Result: "+(firstNumber*secondNumber));
                break;
            case 4:
                if(secondNumber!=0)
                    System.out.println("Result: "+(firstNumber/secondNumber));
                else
                    System.out.println("Second number should not be zero");
                break;
            default:
                System.out.println("False choice");
        }
    }
}

import java.util.Scanner;
//Advanced calculator 
// Operations: Add - Sub - Mul - Div - Power - Factorial - Mod - Area
public class AdvancedCalculator {
    static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        String menu = """
                1- Add
                2- Sub
                3- Mul
                4- Div
                5- Power
                6- Factorial
                7- Mod
                8- Area and Environment
                0- Exit""";

        do {
            System.out.println(menu);
            System.out.print("Enter the choice:");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    sub();
                    break;
                case 3:
                    mul();
                    break;
                case 4:
                    div();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    areaAndEnvironment();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        } while (choice != 0);


    }

    static void add() {
            int number, result=0, i=1;
            while (true) {
                System.out.print(i++ + ". number: ");
                number = input.nextInt();
                if (number==0) {
                    break;
                }
                result += number;
            }
            System.out.println("Result: " + result);
    }

    static void sub() {
        int number1, number2, result=0;

        System.out.print("First number: ");
        number1 = input.nextInt();
        System.out.print("Second number: ");
        number2 = input.nextInt();
        result = number1-number2;

        System.out.println("Result: " + result);
    }

    static void mul() {
        int number, result=1, i=1;

        while (true) {
            System.out.print(i++ + ". number: ");
            number = input.nextInt();

            if (number==1)
                break;

            if (number==0) {
                result=0;
                break;
            }
            result *= number;
        }

        System.out.println("Result: " + result);
    }

    static void div() {
        int number1, number2, result=0;

        System.out.print("First number: ");
        number1 = input.nextInt();
        System.out.print("Second number: ");
        number2 = input.nextInt();
        if(number2!=0) {
            result = number1/number2;
        } else {
            System.out.println("Number2 cannot be zero");
        }

        System.out.println("Result: " + result);
    }

    static void power() {
        System.out.print("Base value: ");
        int base = input.nextInt();
        System.out.print("Exponent value: ");
        int exponent = input.nextInt();
        int result=1;

        for (int i=1; i<=exponent; i++) {
            result *= base;
        }
        System.out.println("Result: " + result);
    }

    static void factorial() {
        System.out.print("Enter the number:");
        int n = input.nextInt();
        int result = 1;

        for (int i=1; i<=n; i++) {
            result *= i;
        }

        System.out.println("Result: " + result);
    }

    static void mod() {
        System.out.print("Enter the number:");
        int n = input.nextInt();
        System.out.print("Mod value:");
        int m = input.nextInt();
        int result = n%m;

        System.out.println("Result: " + result);
    }

    static void areaAndEnvironment() {
        System.out.print("Enter the first edge:");
        int a = input.nextInt();
        System.out.print("Enter the second edge:");
        int b = input.nextInt();
        int result1 = a*b;
        int result2 = 2*(a+b);

        System.out.println("Area: " + result1);
        System.out.println("Environment: " + result2);
    }

}

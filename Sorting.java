import java.util.Scanner;
//Sorting from smallest to largest
public class Sorting {
    public static void main(String[] args) {
        int firstNumber, secondNumber, thirdNumber;

        Scanner input = new Scanner(System.in);

        System.out.println("First number: ");
        firstNumber = input.nextInt();
        System.out.println("Second number: ");
        secondNumber = input.nextInt();
        System.out.println("Third number: ");
        thirdNumber = input.nextInt();

        if(firstNumber<secondNumber && firstNumber<thirdNumber) {
            if(secondNumber<thirdNumber) {
                System.out.println(firstNumber+" "+secondNumber+" "+thirdNumber);
            } else {
                System.out.println(firstNumber+" "+thirdNumber+" "+secondNumber);
            }
        } else if (secondNumber<firstNumber && secondNumber<thirdNumber) {
            if(firstNumber<thirdNumber) {
                System.out.println(secondNumber+" "+firstNumber+" "+thirdNumber);
            } else {
                System.out.println(secondNumber+" "+thirdNumber+" "+firstNumber);
            }
        }else {
            if(firstNumber<secondNumber) {
                System.out.println(thirdNumber+" "+firstNumber+" "+secondNumber);
            } else {
                System.out.println(thirdNumber+" "+secondNumber+" "+firstNumber);
            }
        }

    }
}

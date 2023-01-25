import java.awt.*;
import java.util.Scanner;
//EKOK = (firstNumber*secondNumber) / EBOB
public class EbobAndEkok {
    public static void main(String[] args) {
        int firstNumber, secondNumber, minNumber, ebob = 1, ekok;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        firstNumber = input.nextInt();

        System.out.println("Enter the second number: ");
        secondNumber = input.nextInt();

        if(firstNumber<secondNumber) {
            minNumber = firstNumber;
        } else {
            minNumber = secondNumber;
        }

        //ebob
        for (int i=1; i<minNumber; i++) {
            if(firstNumber%i==0 && secondNumber%i==0) {
                ebob = i;
            }
        }

        ekok = (firstNumber*secondNumber) / ebob;

        System.out.println("EBOB: "+ebob);
        System.out.println("EKOK: "+ekok);

    }
}

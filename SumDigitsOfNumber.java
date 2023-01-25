import java.util.Scanner;
//Program to calculate the sum of digits of a number
public class SumDigitsOfNumber {
    //Sample : 1643 = 1 + 6 + 4 + 3 = 14
    public static void main(String[] args) {
        int number, digitsSum=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        number = input.nextInt();

        int i=number;
        while(i%10!=0) {
            digitsSum += (i%10);
            i = i/10;
        }

        System.out.println("Digits sum: "+digitsSum);
    }
}

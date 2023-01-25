import java.util.Scanner;
//Finding max and min numbers
public class MaxAndMinNumber {
    public static void main(String[] args) {
        int count, minNumber, maxNumber;

        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers you enter?");
        count = input.nextInt();

        int numbers[] = new int[count];

        for(int i=0; i<count; i++) {
            System.out.println("Number: ");
            numbers[i] = input.nextInt();
        }

        minNumber = numbers[0];
        maxNumber = numbers[0];

        for(int i=0; i<count; i++) {
            if(numbers[i]>=maxNumber) {
                maxNumber = numbers[i];
            }
            if(numbers[i]<=minNumber) {
                minNumber = numbers[i];
            }
        }

        System.out.println("Max number: "+maxNumber);
        System.out.println("Min number: "+minNumber);
    }
}

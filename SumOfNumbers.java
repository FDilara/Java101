import java.util.Scanner;
//Sum of numbers divisible by 2 and 4
public class SumOfNumbers {
    public static void main(String[] args) {
        int number=0, sum=0;

        Scanner input = new Scanner(System.in);

        while(number%2==0) {
            System.out.println("Enter the number: ");
            number = input.nextInt();
            if(number%4==0) {
                sum += number;
            }
        }
        System.out.println("Sum of numbers: "+sum);
    }
}

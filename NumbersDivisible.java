import java.util.Scanner;
//Program to find numbers divisible by 3 and 4 up to the entered number
public class NumbersDivisible {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        number = input.nextInt();

        for(int i=0; i<number; i++) {
            if(i%2==0) {
                if(i%3==0 && i%4==0) {
                  System.out.print(i+" ");
                }
            }
        }
    }
}

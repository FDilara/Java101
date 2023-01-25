import java.util.Scanner;
//Program to find if a number is a "palindrome number"
public class PalindromeNumber {
    //Sample: 1, 4, 8, 99, 101, 363, 4004, 9889
    public static void main(String[] args) {
        int r,sum=0,temp;
        int n;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        n = input.nextInt();


        temp=n;
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");

    }
}

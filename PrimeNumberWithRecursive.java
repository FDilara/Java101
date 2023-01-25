import java.util.Scanner;
//Program to find prime number using the "recursive" method
public class PrimeNumberWithRecursive {
    static boolean prime(int a, int i) {
        if (a <= 2){
            if(a==2) {
                return true;
            }
            return false;
        }
        if (a % i == 0)
            return false;
        if (i == (a-1)){
            return true;
        }

        return prime(a, i + 1);

    }

    public static void main(String[] args) {
        int number ,i=2;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        number = input.nextInt();

        if(prime(number, 2)) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }

    }
}

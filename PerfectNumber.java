import java.util.Scanner;
//Perfect number
public class PerfectNumber {
    public static void main(String[] args) {
        int number, sum=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        number = input.nextInt();

        for(int i=1; i<=number; i++) {
            if(number!=i) {
                if(number%i==0){
                    sum += i;
                }
            }
        }

        if(number==sum) {
            System.out.println("Perfect Number!");
        } else {
            System.out.println("Not Perfect Number!");
        }
    }
}

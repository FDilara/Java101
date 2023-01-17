import java.util.Scanner;

public class KDVCalculation {
    public static void main(String[] args) {
        double kdvAmount;
        double totalAmount;
        int inputAmount;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount:");
        inputAmount = input.nextInt();

        //KDV of the entered amount is calculated
        kdvAmount = (inputAmount >= 0 && inputAmount <= 1000) ? (inputAmount * 18 / 100) : (inputAmount * 8 / 100);
        //Price with KDV is calculated
        totalAmount = inputAmount + kdvAmount;

        System.out.println("Price with KDV: " + totalAmount);
        System.out.println("KDV amount : " + kdvAmount);
    }
}

import java.util.Scanner;
public class KMCalculation {
    public static void main(String[] args) {
        double firstAmount = 10, perKm = 2.20, fee;
        int kmAmount;
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the km amount:");
        kmAmount = input.nextInt();

        //Fee calculated
        fee = (((kmAmount * perKm) + firstAmount) < 20) ? 20 : ((kmAmount * perKm) + firstAmount);

        //Printed to the screen
        System.out.println("Taximeter fee to be paid: " + fee);
    }
}

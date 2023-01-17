import java.util.Scanner;
//Total amount of fruits
public class TotalAmount {
    public static void main(String[] args) {
        double pearPrice = 2.14, applePrice = 3.67, tomatoesPrice = 1.11, bananaPrice = 0.95, eggplantPrice = 5.00;
        double pearKg, appleKg, tomatoesKg, bananaKg, eggplantKg, totalAmount;

        Scanner input = new Scanner(System.in);

        System.out.println("How many kg of pear:");
        pearKg = input.nextDouble();

        System.out.println("How many kg of apple:");
        appleKg = input.nextDouble();

        System.out.println("How many kg of tomatoes:");
        tomatoesKg = input.nextDouble();

        System.out.println("How many kg of banana:");
        bananaKg = input.nextDouble();

        System.out.println("How many kg of eggplant:");
        eggplantKg = input.nextDouble();


        totalAmount = (pearPrice*pearKg) + (applePrice*appleKg) + (tomatoesPrice*tomatoesKg)
                      + (bananaPrice*bananaKg) +(eggplantPrice*eggplantKg);

        //Printed to the screen
        System.out.println("Total amount: " + totalAmount);
    }
}

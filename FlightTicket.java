import java.util.Scanner;
//Flight ticket price calculator
public class FlightTicket {
    public static void main(String[] args) {
        int age, tripType;
        double distance, perDistance=0.10, totalPrice, discountPrice;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the distance (km): ");
        distance = input.nextDouble();
        System.out.println("Enter the age: ");
        age = input.nextInt();
        System.out.println("Enter the trip type (1: One Way Ticket,  2: Round Trip Ticket): ");
        tripType = input.nextInt();

        if(distance>0 && age>0 && (tripType==1 || tripType==2)) {
            if(tripType == 1) {
                totalPrice = distance * perDistance;
            } else {
                totalPrice = distance * perDistance * 2;
                //20% discount applies
                totalPrice -= totalPrice * 20 / 100;
            }

            if(age<12) {
                discountPrice = totalPrice - (totalPrice * 50 / 100);
            } else if (age>12 && age<24) {
                discountPrice = totalPrice - (totalPrice * 10 / 100);
            } else if (age>65) {
                discountPrice = totalPrice - (totalPrice * 30 / 100);
            } else {
                discountPrice = totalPrice;
            }

            System.out.println("Total amount: "+discountPrice);

        } else {
            System.out.println("You entered incorrect data!");
        }
    }
}

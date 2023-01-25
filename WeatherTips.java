import java.util.Scanner;
//Recommended activity according to air temperature
public class WeatherTips {
    public static void main(String[] args) {
        double temperature;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the temperature to get a suggestion: ");
        temperature = input.nextDouble();

        if(temperature<=5) {
            System.out.println("Suggestion -> Skiing ");
        } else if (temperature>5 && temperature<=15) {
            System.out.println("Suggestion -> Cinema ");
        } else if (temperature>15 && temperature<=25) {
            System.out.println("Suggestion -> Picnic ");
        } else if (temperature>25) {
            System.out.println("Suggestion -> Swimming ");
        }
    }
}

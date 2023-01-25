import java.util.Scanner;
//"çin zodyağı" homework -  It has the same algorithm, in this project the flower name is returned, not the animal name
public class BirthYear {
    //Flower name according to remainder of dividing by 5 of the year of birth
    public static void main(String[] args) {
        int birthYear, remainder;
        
        String[] flowers = new String[]{"daisy", "rose", "violet", "tulip", "orchid"};

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the birth year: ");
        birthYear = input.nextInt();
        
        remainder = birthYear % 5;

        System.out.println("Your flower: " + flowers[remainder]);
    }
}

import java.util.Scanner;
//Find horoscope by birth information
/*
* Pisces : 20 February - 20 March
* Aries : 21 March - 20 April
* */
public class BirthInformation {
    public static void main(String[] args) {
        int day, month;

        Scanner input = new Scanner(System.in);

        System.out.println("Birth day: ");
        day = input.nextInt();
        System.out.println("Birth month: ");
        month = input.nextInt();

        //Two samples
        switch (month) {
            case 2:
                if(day>=1 && day<=31) {
                    if(day>=20) {
                        System.out.println("Pisces");
                    }
                }else {
                    System.out.println("Invalid day!");
                }
                break;
            case 3:
                if(day>=1 && day<=31) {
                    if(day>=20) {
                        System.out.println("Aries");
                    }else {
                        System.out.println("Pisces");
                    }
                }else {
                    System.out.println("Invalid day!");
                }
                break;
            default:
                System.out.println("Invalid month!");
        }
    }
}

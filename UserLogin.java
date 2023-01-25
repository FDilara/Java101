import java.util.Objects;
import java.util.Scanner;
//User Login Project
public class UserLogin {
    public static void main(String[] args) {
        String userName = "patikaDev", password = "1234";
        //String userNameForControl, passwordForControl;
        boolean exit = false;

        Scanner input = new Scanner(System.in);

        while(!exit) {
            System.out.println("User name: ");
            String userNameForControl = input.nextLine();

            System.out.println("Password: ");
            String passwordForControl = input.nextLine();

            if ((Objects.equals(userNameForControl, userName)) && (Objects.equals(passwordForControl, password))) {
                System.out.println("Logged into the system");
                exit = true;
            } else if (!Objects.equals(userNameForControl, userName)) {
                System.out.println("False user name");
            } else if (!Objects.equals(passwordForControl, password)) {
                System.out.println("False password");
                System.out.println("Do you want to change password(Y/N): ");
                if(Objects.equals(input.nextLine(), "Y")) {
                    System.out.println("New password: ");
                    password = input.nextLine();
                    System.out.println("Password changed!");
                }
            }
        }
    }
}

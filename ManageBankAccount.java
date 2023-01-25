import java.util.Objects;
import java.util.Scanner;
//ATM Project
//Operations: Balance Read / Deposit / Withdraw / Exit
//User has 3 rights to login to the system. If unable to login, the account will be blocked.
public class ManageBankAccount {
    public static void main(String[] args) {
        String userName, password;

        Scanner input = new Scanner(System.in);
        int count=3, balance=1000, choice;

        while(count>0) {
            System.out.println("User name: ");
            userName = input.nextLine();
            System.out.println("Password: ");
            password = input.nextLine();
            if(Objects.equals(userName, "patika") && Objects.equals(password, "patika1234")) {
                System.out.println("You logged into the system!");

                do {
                    System.out.println("Select the action want to do:\n" +
                            "1.Balance\n" +
                            "2.Deposit\n" +
                            "3.Withdraw\n" +
                            "4.Exit");
                    choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Balance: " + balance);
                            break;
                        case 2:
                            int amount = 0;
                            System.out.println("Enter the amount want to deposit: ");
                            amount = input.nextInt();
                            balance += amount;
                            System.out.println("Money has deposited.\n New balance: " + balance);
                            break;
                        case 3:
                            int amount1 = 0;
                            System.out.println("Enter the amount want to withdraw: ");
                            amount1 = input.nextInt();
                            if (amount1 < balance) {
                                balance -= amount1;
                                System.out.println("Money has withdrawn.\n New balance: " + balance);
                            } else {
                                System.out.println("Insufficient balance");
                            }
                            break;
                        case 4:
                            System.out.println("Exited the system.");
                            count = 0;
                            break;
                        default:
                            System.out.println("Wrong choice");
                    }
                } while(choice!=4);
            } else {
                count--;
                System.out.println("You entered incorrectly!!!");
                if(count==0) {
                    System.out.println("Your account blocked!!!");
                } else {
                    System.out.println("Your remaining right to login: "+count);
                }
            }
        }

    }
}

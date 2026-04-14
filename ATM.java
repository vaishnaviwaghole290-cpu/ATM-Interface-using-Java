import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        User user = new User("Divya", "1234");
        ATMOperations atm = new ATMOperations();

        System.out.print("Enter User ID: ");
        String id = sc.nextLine();

        System.out.print("Enter PIN: ");
        String pin = sc.nextLine();

        if(user.login(id, pin)) {
            System.out.println("Login Successful");

            int choice;
            do {
                System.out.println("\n1.Transaction History");
                System.out.println("2.Withdraw");
                System.out.println("3.Deposit");
                System.out.println("4.Transfer");
                System.out.println("5.Quit");

                System.out.print("Choose option: ");
                choice = sc.nextInt();

                switch(choice) {
                    case 1: atm.showHistory(); break;
                    case 2: atm.withdraw(); break;
                    case 3: atm.deposit(); break;
                    case 4: atm.transfer(); break;
                    case 5: System.out.println("Thank you!"); break;
                    default: System.out.println("Invalid choice");
                }

            } while(choice != 5);

        } else {
            System.out.println("Invalid Login");
        }
    }
}
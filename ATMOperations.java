import java.util.Scanner;

public class ATMOperations {
    Account acc = new Account();
    Transaction tx = new Transaction();
    Scanner sc = new Scanner(System.in);

    public void showHistory() {
        tx.show();
    }

    public void deposit() {
        System.out.print("Enter amount: ");
        double amt = sc.nextDouble();
        acc.deposit(amt);
        tx.add("Deposited: " + amt);
        System.out.println("Deposited successfully");
    }

    public void withdraw() {
        System.out.print("Enter amount: ");
        double amt = sc.nextDouble();
        if(acc.withdraw(amt)) {
            tx.add("Withdrawn: " + amt);
            System.out.println("Withdraw successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void transfer() {
        System.out.print("Enter amount: ");
        double amt = sc.nextDouble();
        System.out.print("Enter receiver name: ");
        String name = sc.next();

        if(acc.withdraw(amt)) {
            tx.add("Transferred " + amt + " to " + name);
            System.out.println("Transfer successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
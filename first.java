import java.util.Scanner;
public class first {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();

        while (true) {
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter your name: ");
                    String name = scanner.next();
                    System.out.print("Enter initial deposit amount: ");
                    double initialDeposit = scanner.nextDouble();
                    account.createAccount(name, initialDeposit);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    account.checkBalance();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

class Account {
    private String name;
    private double balance;

    public void createAccount(String name, double initialDeposit) {
        this.name = name;
        this.balance = initialDeposit;
        System.out.println("Account created successfully");
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully");
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully");
        }
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}
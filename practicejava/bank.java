import java.util.Scanner;

public class BankApplication {
    private float balance;
    private String AcNumber;
    private String AcHolderName;
    private Scanner scanner = new Scanner(System.in);

    // Method to open a new account
    public void openAccount() {
        System.out.print("Enter Account Number: ");
        AcNumber = scanner.nextLine();
        System.out.print("Enter Account Holder Name: ");
        AcHolderName = scanner.nextLine();
        System.out.print("Enter Initial Balance: ");
        balance = scanner.nextFloat();
        System.out.println("\nAccount opened successfully!\n");
    }

    // Method to deposit an amount
    public void deposit() {
        System.out.print("Enter amount to deposit: ");
        float amount = scanner.nextFloat();
        balance += amount;
        System.out.println("Amount deposited successfully. New balance: " + balance + "\n");
    }

    // Method to withdraw an amount
    public void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        float amount = scanner.nextFloat();
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance + "\n");
        } else {
            System.out.println("Insufficient balance. Current balance: " + balance + "\n");
        }
    }

    // Method to check current balance
    public void balanceCheck() {
        System.out.println("Current balance: " + balance + "\n");
    }

    // Main method to drive the application
    public static void main(String[] args) {
        BankApplication app = new BankApplication();
        app.openAccount();
        Scanner sc = app.scanner;

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance Check");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    app.deposit();
                    break;
                case 2:
                    app.withdraw();
                    break;
                case 3:
                    app.balanceCheck();
                    break;
                case 4:
                    System.out.println("Thank you for using our services!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.\n");
            }
        }
    }
}

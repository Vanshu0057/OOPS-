class BankAccount {
    private final String accountHolder;
    private final String accountNumber;
    private double balance;

    BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    String getAccountHolder() {
        return accountHolder;
    }

    String getAccountNumber() {
        return accountNumber;
    }

    double getBalance() {
        return balance;
    }

    boolean deposit(double amount) {
        if (amount < 0) {
            System.out.println("Deposit rejected: amount cannot be negative.");
            return false;
        }
        balance += amount;
        System.out.printf("Deposit successful: $%.2f%n", amount);
        return true;
    }

    boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal rejected: amount must be greater than zero.");
            return false;
        }
        if (amount > balance) {
            System.out.println("Withdrawal rejected: insufficient balance.");
            return false;
        }
        balance -= amount;
        System.out.printf("Withdrawal successful: $%.2f%n", amount);
        return true;
    }
}

public class Pritical10 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Jordan Lee", "AC1001", 500.00);

        System.out.println("Account holder: " + account.getAccountHolder());
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.printf("Opening balance: $%.2f%n%n", account.getBalance());

        account.deposit(200.00);
        account.withdraw(100.00);
        account.deposit(-50.00);
        account.withdraw(0.00);
        account.withdraw(-25.00);
        account.withdraw(1000.00);

        System.out.printf("%nUpdated balance: $%.2f%n", account.getBalance());
    }
}
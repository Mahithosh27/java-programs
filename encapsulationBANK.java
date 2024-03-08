// Interface Transaction
interface Transaction {
    void deposit(double amount);

    void withdraw(double amount);
}

abstract class Account implements Transaction {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

public class encapsulationBANK {
    public static void main(String[] args) {

        Account savingsAccount = new SavingsAccount(5000);
        System.out.println("Savings Account:");
        savingsAccount.deposit(2000); // Deposit
        savingsAccount.withdraw(1000); // Withdraw
        savingsAccount.checkBalance(); // Check balance

    }
}

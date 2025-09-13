public class BankSystem {
    public static void main(String[] args) {
        // Create a Savings Account
        SavingsAccount savings = new SavingsAccount("SA123", "Alice", 5000);
        savings.displayDetails();
        savings.deposit(1500);
        savings.withdraw(1000);
        savings.calculateInterest(2); // Calculate interest for 2 years
        savings.displayDetails();

        // Create a Current Account
        CurrentAccount current = new CurrentAccount("CA456", "Bob", 2000);
        current.displayDetails();
        current.deposit(3000);
        current.withdraw(6000); // Should allow due to overdraft
        current.withdraw(7000); // Should fail (overdraft limit exceeded)
        current.displayDetails();
    }
}

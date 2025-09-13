class CurrentAccount extends BankAccount {
    private double overdraftLimit = 10000; // ₹10,000

    public CurrentAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit.");
        }
    }
}


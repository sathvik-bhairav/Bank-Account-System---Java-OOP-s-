class SavingsAccount extends BankAccount {
    private double interestRate = 0.04; 
    public SavingsAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    public void calculateInterest(int years) {
        double interest = balance * interestRate * years;
        balance += interest;
        System.out.println("Interest of ₹" + interest + " added for " + years + " years.");
    }
}

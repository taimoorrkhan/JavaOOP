package BankTask;

public class SavingAccount extends  Account {
    private double interestRate;

    public SavingAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * interestRate / 100;
     super.deposit(interest);
    }

    public double getInterestRate() {
        return interestRate;
    }
}

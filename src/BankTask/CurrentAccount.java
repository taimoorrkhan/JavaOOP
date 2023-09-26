package BankTask;

public class CurrentAccount extends Account{
    private double overDraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overDraftLimit) {
        super(accountNumber, balance);
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount < -overDraftLimit) {
            System.out.println("Letter sent: Account is in overdraft");
        } else {
            super.withdraw(amount);
        }
    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }
}

package BankTask;

public class Bank {
    private Account[] accounts;
    private int numAccounts;

    public Bank(int maxAccounts) {
        accounts = new Account[maxAccounts];
        numAccounts = 0;
    }

    public void openAccount(Account account) {
        if (numAccounts < accounts.length) {
            accounts[numAccounts] = account;
            numAccounts++;
        } else {
            System.out.println("Cannot open more accounts. Bank is full.");
        }
    }

    public void closeAccount(String accountNumber) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                accounts[i] = accounts[numAccounts - 1];
                numAccounts--;
                return;
            }
        }
    }

    public void payDividend(double amount) {
        for (int i = 0; i < numAccounts; i++) {
            accounts[i].deposit(amount);
        }
    }

    public void updateAccounts() {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i] instanceof SavingAccount) {
                ((SavingAccount) accounts[i]).addInterest();
            } else if (accounts[i] instanceof CurrentAccount) {
                ((CurrentAccount) accounts[i]).withdraw(0);

            }
        }
    }
}

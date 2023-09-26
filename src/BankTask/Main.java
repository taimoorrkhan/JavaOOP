package BankTask;

public class Main {
    public static void main(String[] args) {
        SavingAccount savingsAccount = new SavingAccount("SA001", 1000.0, 2.5);
        CurrentAccount currentAccount = new CurrentAccount("CA001", 500.0, 100.0);

        Bank bank = new Bank(10);

        bank.openAccount(savingsAccount);
        bank.openAccount(currentAccount);

        bank.payDividend(100.0);

        bank.updateAccounts();

            System.out.println(savingsAccount.getBalance());
            System.out.println(currentAccount.getBalance());

            currentAccount.withdraw(50);
            System.out.println(currentAccount.getBalance());





    }
}

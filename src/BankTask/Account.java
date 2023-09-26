package BankTask;

class Account {
    private String accountNumber;
    private double balance;


   /* public Account(int a)
    {
        bal=0.0;
        accnum=a;
    }*/

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if(amount > 0)
            balance += amount;
        else
            System.err.println("Account.deposit(...): "
                    +"cannot deposit negative amount.");
    }

    public void withdraw(double amount) {
         if(amount > 0)
                balance -= amount;
          else
                System.err.println("Account.withdraw(...): "
                      +"cannot withdraw negative amount.");
    }

    public double getBalance() {
        return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public final void print() {
        System.out.println(toString());
    }
}


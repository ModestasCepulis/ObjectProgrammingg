public class SavingsAccount extends BankAccount2 {

    private double balance;
    private int bankAccounts=0;

    public void setBalance(double balance){this.balance = balance;};
    public double getBalance(){return balance;};

    public int getNumberOfBankAccounts(){return bankAccounts;};
    public void bankAccountsCounter(){bankAccounts++;};



    public SavingsAccount()
    {
        this.balance = 0;
    }

    public SavingsAccount(double balance, String name, int accnum)
    {
        setBalance(balance);
    }

    public String toString500()
    {
        return "\n\nThe owners name is: " + getName() + "\nThe Account number is: " + getAccnum() + "\nThe balance of the account is: " + getBalance();
    }

    @Override
    public void lodge(double a) {
        balance=a+balance;

    }

    @Override
    public void calcTax(double a) {

    }

    @Override
    public void withdraw(double a) {
        balance=balance-a;

    }
}

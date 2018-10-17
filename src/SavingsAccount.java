public class SavingsAccount {

    private double balance;
    private BankAccount2 owner;

    public void setBalance(double balance){this.balance = balance;};
    public double getBalance(){return balance;};

    public void setOwner(BankAccount2 owner){this.owner = owner;};
    public BankAccount2 getOwner(){return owner;};


    public SavingsAccount()
    {
        this.balance = 0;
        this.owner = new BankAccount2();
    }

    public SavingsAccount(double balance, String name, int accnum)
    {
        setBalance(balance);
        BankAccount2 owner = new BankAccount2(name, accnum);
        setOwner(owner);
    }
}

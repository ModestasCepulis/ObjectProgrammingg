public class BankAccount {

    private String accnum;
    private double balance;
    Person customer;


    public void setAccnum(String accnum){this.accnum = accnum;};
    public String getAccnum(){return accnum;};

    public void setBalance(double balance){this.balance = balance;};
    public double getBalance(){return balance;};

    public void setCustomer(Person customer){this.customer = customer;};
    public Person getCustomer(){return customer;};




    public BankAccount(String accnum, double balance, Person customer)
    {

        //this("No Account Number",0.0, null);
        this.accnum = accnum;
        this.balance = balance;
        this.customer = customer;

    }

    public BankAccount()
    {
        this("No Account Number",0.0, null);
    }

}


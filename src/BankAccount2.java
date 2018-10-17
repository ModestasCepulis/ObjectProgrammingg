public class BankAccount2 implements Transactable, Taxable {

    private String name;
    private int accnum;
    private int bankAccounts=0;
    private SavingsAccount savingsAccount;

    public void setName(String name){this.name = name;};
    public String getName(){return name;};

    public void setAccnum(int accnum){this.accnum = accnum;};
    public int getAccnum(){return accnum;};

    public int getNumberOfBankAccounts(){return bankAccounts;};
    public void bankAccountsCounter(){bankAccounts++;};


    BankAccount2(String name, int accnum)
    {
        this.name = name;
        this.accnum = accnum;
    }

    BankAccount2()
    {
        this.name = "Unknown name";
        this.accnum = 0;
    }

    public String toString500()
    {
        return "\n\nThe owners name is: " + getName() + "\nThe Owner Account number is: " + getAccnum() + "\nThe balance of the account is: " + savingsAccount.getBalance();
    }


}

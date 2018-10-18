public abstract class BankAccount2 implements Transactable, Taxable {

    protected String name;
    protected int accnum;

    public void setName(String name){this.name = name;};
    public String getName(){return name;};

    public void setAccnum(int accnum){this.accnum = accnum;};
    public int getAccnum(){return accnum;};


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


}

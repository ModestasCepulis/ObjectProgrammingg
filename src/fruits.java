public class fruits {

    private String name;
    private int amount;
    public int AmountOfFruitsEntered;

    public void setName(String name){this.name = name;};
    public String getName(){return name;};

    public void setAmount(int amount){this.amount = amount;};
    public int getAmount(){return amount;};

    public int getAmountOfFruitsEntered(){return AmountOfFruitsEntered;};
    public void setAmountOfFruitsEntered(int amountOfFruitsEntered){AmountOfFruitsEntered++;};


    public fruits()
    {
        this.name = "No Name";
        this.amount = 0;
    }

    public fruits(String name, int amount)
    {
        setName(name);
        setAmount(amount);
    }

    public String toString()
    {
        return "The name of the fruit: " +getName() +"The amount of fruits: " + getAmount();
    }

}

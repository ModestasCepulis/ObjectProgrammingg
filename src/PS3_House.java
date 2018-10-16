public class PS3_House {

    private String address;
    private String type;
    private Person owner;
    private double price;

    private int numberOfHouses = 0;

    public void setAddress(String address){this.address = address;};
    public String getAddress(){return address;};

    public void setType(String type){this.type = type;};
    public String getType(){return type;};

    public void setOwner(Person owner){this.owner = owner;};
    public Person getOwner(){return owner;};

    public void setPrice(double price){this.price = price;};
    public double getPrice(){return price;};

    public int getNumberOfHouses(){return numberOfHouses;};
    public void theHouseCounter(){numberOfHouses++;}


    public PS3_House()
    {

        this.address = "No Address Specified";
        this.type = "No Type Specified";
        this.owner =  new Person("No Owner Specified");
        this.price = 0.0;

    }


    //4 argument constructor
    public PS3_House(String address, String type, Person owner, double price)
    {
        this.address = address;
        this.type = type;
        this.price = price;
        this.owner = owner;

    }

    //6 argument constructor
    public PS3_House(String address, String type, double price, String name, int age, char gender)
    {
        setAddress(address);
        setType(type);
        setPrice(price);

        Person owner = new Person(name, age, gender);

        setOwner(owner);
    }

    public String toString()
    {
        return "\n\nThe owner of the house: " + getOwner() + "\nThe type of the house: " + getType() +
                "\nThe address of the house: " + getAddress() + "\nThe price of the house: " + getPrice();
    }

}

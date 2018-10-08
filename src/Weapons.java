public class Weapons {

    private String name;
    private int number;
    private String description;

    public void setName(String name) {this.name = name;}
    public String getName(){return name;};

    public void setNumber(int number) {this.number = number;}
    public int getNumber() {return number;};

    public void setDescription(String description) {this.description = description;}
    public String getDescription() {return description;};

    public Weapons()
    {
        this.name = "No name";
        this.number = 0;
        this.description = "No Description";

    }

    public Weapons(String name, int number, String description)
    {
        setName(name);
        setNumber(number);
        setDescription(description);
    }




}

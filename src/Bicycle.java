public class Bicycle {

    private String name;
    private double value;
    private String make;

    public void setName(String name){this.name = name;}
    public String getName(){return name;}

    public void setValue(double value){this.value = value;}
    public double getValue(){return value;}

    public void setMake(String make){this.make = make;}
    public String getMake(){return make;}

    public Bicycle()
    {
        this.name = "No name";
        this.value = 0.0;
        this.make = "No make";
    }

    public Bicycle(String name, double value, String make)
    {
        setName(name);
        setValue(value);
        setMake(make);
    }

    public String toString()
    {
        return "The owners name: " + getName() + "The value of the bike: " + getValue() + "The make of the bike: " + getMake();
    }
}

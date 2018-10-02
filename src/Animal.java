public class Animal {

    private String type;
    private String[] continents = new String[7];
    private double weight;
    private int age;

    //mutator method
    public void setType(String type) {this.type = type;}
    //accessor method
    public String getType() {return type;}

    public void setContinents(String continents) {this.continents[7] = continents;}
    public String getContinents() {return continents[7];}

    public void setWeight(double weight) {this.weight = weight;}
    public double getWeight() {return weight;}

    public void setAge(int age) {this.age = age;}
    public int getAge(){return age;}

    //constructor method
    public Animal()
    {
        this.type = "No type Specified";
        this.continents = null;
        this.weight = 0.0;
        this.age = 0;

    }

    public Animal(String type, String continents, double weight, int age)
    {
        setType(type);
        setContinents(continents);
        setWeight(weight);
        setAge(age);
    }

    public String toString()
    {
        return "The type of the animal: " + getType() + "\nThe Sender: " + "\nThe continents?: " + getContinents()
                + "\nThe weight of the animal: " + getWeight() + "\nThe age of the animal: " + getAge();
    }

}


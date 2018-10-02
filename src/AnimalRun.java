import javax.swing.*;

public class AnimalRun {

    static Animal anl;

    public static void main(String[] args) {

        anl = new Animal();


        String type = inputType();
        String continents = inputContinents();
        double weight = inputWeight();
        int age = inputAge();

        finalOutput(type,continents,weight,age);

        for(int i=0; i<7; i++)
        {


        }

    }

    public static String inputType()
    {
        String typeString;
        anl.setType(typeString = JOptionPane.showInputDialog("Please enter the animals type"));
        return typeString;
    }

    public static String inputContinents() {
        String returnha="hi";
        return returnha;
    }

    public static double inputWeight()
    {
        double weightDouble=0.0;

        String weightString = JOptionPane.showInputDialog("Please enter the weight");
        weightDouble = Double.parseDouble(weightString);

        anl.setWeight(weightDouble);
        return weightDouble;
    }

    public static int inputAge()
    {
        int ageInt=0;

        String ageString = JOptionPane.showInputDialog("Please enter the age");
        ageInt = Integer.parseInt(ageString);

        anl.setAge(ageInt);
        return ageInt;

    }

    public static void finalOutput(String typeString, String continentsString, double weightDouble, int ageInt)
    {
        anl.setType(typeString);
        anl.setContinents(continentsString);
        anl.setWeight(weightDouble);
        anl.setAge(ageInt);

        JOptionPane.showMessageDialog(null,anl.toString());
    }

}

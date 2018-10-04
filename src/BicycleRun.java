import javax.swing.*;

public class BicycleRun {

    static Bicycle bcle;

    public static void main(String[] args) {

        bcle = new Bicycle();


    }

    public String inputName()
    {
        String nameString;
        nameString = JOptionPane.showInputDialog("Please enter the owners name: ");

        return nameString;
    }

    public double inputValue()
    {
        String valueString;
        double valueDouble;
        valueString = JOptionPane.showInputDialog("Please enter the bikes value: ");
        valueDouble = Double.parseDouble(valueString);

        return valueDouble;
    }

    public String inputMake()
    {
        String valueMake;
        valueMake = JOptionPane.showInputDialog("Please enter the bike's make: ");

        return valueMake;

    }


}

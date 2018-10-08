import javax.swing.*;

public class BicycleRun {

    static Bicycle bcle;

    public static void main(String[] args) {

        bcle = new Bicycle();

        Bicycle [] bicycles = new Bicycle[2];

        for(int i = 0; i < bicycles.length; i++)
        {
            String inputName = inputName();
            double inputValue = inputValue();
            String inputMake = inputMake();

            bicycles[i] = new Bicycle();

            bicycles[i].setName(inputName);
            bicycles[i].setValue(inputValue);
            bicycles[i].setMake(inputMake);



        }


        for(int i = 0; i < bicycles.length; i++)
        {
            JOptionPane.showMessageDialog(null,"The name: " + bicycles[i].getName() + "\nThe Value: " + bicycles[i].getValue() +
                                          "\nThe make: " + bicycles[i].getMake() );
        }

        double totalValue = 0;

        totalValue = bicycles[0].getValue() + bicycles[1].getValue();

        JOptionPane.showMessageDialog(null,"The total value of the 2 bikes is: " + totalValue);




    }



    public static String inputName()
    {

        String nameString;
        nameString = JOptionPane.showInputDialog("Please enter the owners name: ");

        return nameString;
    }

    public static double inputValue()
    {
        String valueString;
        double valueDouble;
        valueString = JOptionPane.showInputDialog("Please enter the bikes value: ");
        valueDouble = Double.parseDouble(valueString);

        return valueDouble;
    }

    public static String inputMake()
    {
        String valueMake;
        valueMake = JOptionPane.showInputDialog("Please enter the bike's make: ");

        return valueMake;

    }



}

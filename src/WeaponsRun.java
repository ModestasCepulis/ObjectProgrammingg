import javax.swing.*;

public class WeaponsRun {

    static Weapons wep;


    public static void main(String[] args) {

        wep = new Weapons();

        Weapons [] weapons = new Weapons[3];

        for(int i = 0; i < weapons.length; i++)
        {
            weapons[i] = new Weapons();

            weapons[i].setName(inputName());
            weapons[i].setNumber(inputNumber());
            weapons[i].setDescription(inputDescription());
        }

        JOptionPane.showMessageDialog(null,"Your chosen wepoans:" +
                "\n1. \nName: " + weapons[0].getName() + "\nAmount: " + weapons[0].getNumber() + "\nDescription: " + weapons[0].getDescription()  + "\n2. " +weapons[1] + "\n3. " + weapons[2]);
    }

    public static String inputName()
    {
        String nameString;

        nameString = JOptionPane.showInputDialog("Please enter the name of the weapon that you want to create: ");

        return nameString;

    }

    public static int inputNumber()
    {
        String numberString;

        numberString = JOptionPane.showInputDialog("Please enter the number of weapons that you want to create: ");
        int numberInt = Integer.parseInt(numberString);

        return numberInt;
    }

    public static String inputDescription()
    {
        String descriptionString;

        descriptionString = JOptionPane.showInputDialog("Please enter the description of the item that you want to create");

        return descriptionString;
    }

}

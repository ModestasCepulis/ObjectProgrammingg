import javax.swing.*;
import java.awt.*;

public class PS3_House_Run {

    static PS3_House house;

    public static void main(String[] args) {

        house = new PS3_House();

        finalOutput();

    }

    public static void finalOutput()
    {
        PS3_House[] catalog = new PS3_House[amountOfHouses()];

        for(int i = 0;i <catalog.length;i++)
        {
            catalog[i] = new PS3_House();

            catalog[i].setOwner(new Person(JOptionPane.showInputDialog("Please enter the owners name: ")));
            catalog[i].setType(JOptionPane.showInputDialog("Please enter the type of the house: "));
            catalog[i].setAddress(JOptionPane.showInputDialog("Please enter the address of the house: "));
            catalog[i].setPrice(Integer.parseInt(JOptionPane.showInputDialog("Please enter the price of the house: ")));

            house.theHouseCounter();

        }

        displayHouses(catalog);
    }


    public static int amountOfHouses()
    {
        String amountHousesString = JOptionPane.showInputDialog("Please enter the amount of houses you want to add");
        int amountHousesInt = Integer.parseInt(amountHousesString);

        return amountHousesInt;
    }

    public static void displayHouses(PS3_House[] array)
    {
        JTextArea text = new JTextArea();
        Font font = new Font("monoscape",Font.PLAIN,12);
        text.setFont(font);

        text.setText("Number Of Houses " + house.getNumberOfHouses());

        for(int i = 0; i < array.length; i++)
        {
            text.append(array[i].toString());
        }

        JOptionPane.showMessageDialog(null,text,"Information",JOptionPane.INFORMATION_MESSAGE);
    }



}

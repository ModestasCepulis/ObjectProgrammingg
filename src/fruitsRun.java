import javax.swing.*;
import java.awt.*;

public class fruitsRun {
    static fruits FRUIT;

    public static void main(String[] args) {
        FRUIT = new fruits();

        finalOutput();
    }

    public static void finalOutput()
    {
        String amountOfFruitsString = (JOptionPane.showInputDialog("Please enter the number of fruits that you want"));
        int amountOfFruitsInt = Integer.parseInt(amountOfFruitsString);

        fruits [] catalog = new fruits[amountOfFruitsInt];
        for(int i = 0; i < catalog.length; i++)
        {
            catalog[i] = new fruits();
            catalog[i].setName(JOptionPane.showInputDialog("Please enter the name of the fruit"));
            catalog[i].setAmount(Integer.parseInt(JOptionPane.showInputDialog("Please enter the amount of fruits that you want")));
            FRUIT.setAmountOfFruitsEntered(amountOfFruitsInt);
        }

        displayText(catalog);
    }

    public static void displayText(fruits [] array)
    {
        JTextArea text = new JTextArea();
        Font font = new Font("monoscape", Font.PLAIN, 12);
        text.setFont(font);

        String displayText = "The amount of fruits that you entered: " + FRUIT.getAmountOfFruitsEntered();

        for(int i = 0; i<array.length; i++)
        {
            displayText += "\n\nThe name of the fruit: " + array[i].getName() + "\n amount of fruits: " + array[i].getAmount();
        }

        text.setText(displayText);

        JOptionPane.showMessageDialog(null,text,"Catalog",JOptionPane.PLAIN_MESSAGE);
    }
}

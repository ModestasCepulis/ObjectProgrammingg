import javax.swing.*;
import java.awt.*;

public class TreeRun {
    static Tree tree;

    public static void main(String[] args) {
        tree = new Tree();

        finalOutput();


    }


    public static int amountOfTreesYouWantToAdd()
    {
        String amountTreesString = JOptionPane.showInputDialog("Please enter the amount of trees that you want to add");
        int amountTreesInt = Integer.parseInt(amountTreesString);
        return amountTreesInt;
    }

    public static void finalOutput()
    {
        Tree [] catalog = new Tree[amountOfTreesYouWantToAdd()];
        for(int i = 0; i < catalog.length; i ++)
        {
            catalog[i] = new Tree();
            catalog[i].setNameOfTree(JOptionPane.showInputDialog("Please enter the name of the tree"));
            catalog[i].setNumberOfLeaves(Integer.parseInt(JOptionPane.showInputDialog("Please enter the amount of leaves")));

        }

        displayText(catalog);

    }

    public static void displayText(Tree [] array)
    {
        JTextArea text = new JTextArea();
        Font font = new Font("monoscape",Font.PLAIN,12);
        text.setFont(font);

        String displayText = "The maount of trees that you entered: " + tree.getNumberOfTrees();

        for(int i = 0; i<array.length; i++)
        {
            displayText += "\n\nThe name of the tree: " + array[i].getNameOfTree() + "\nThe amount of leaves: \n" + array[i].getNumberOfLeaves();
        }

        text.setText(displayText);

        JOptionPane.showMessageDialog(null,text,"catalog",JOptionPane.PLAIN_MESSAGE);
    }



}

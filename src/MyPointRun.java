import javax.swing.*;

public class MyPointRun {

    static MyPoint myp;

    public static void main(String[] args) {

        myp = new MyPoint();
        switchUsedForInputs();

    }

    public static int moveHorizontally()
    {
        String xValueString;
        int xValueInt;

        xValueString = JOptionPane.showInputDialog("Please enter value (X) that you would like to move up horizontally: ");
        xValueInt = Integer.parseInt(xValueString);

        return xValueInt;
    }

    public static int moveVertically()
    {
        String yValueString;
        int yValueInt;

        yValueString = JOptionPane.showInputDialog("Please enter the value (Y) that you would like to move up vertically: ");
        yValueInt = Integer.parseInt(yValueString);

        return yValueInt;
    }

    public static void theFinalOutpout(int xValueInt, int yValueInt)
    {
        myp.setXVal(xValueInt);
        myp.setYVAL(yValueInt);

        JOptionPane.showMessageDialog(null, myp.toString());

    }

    public static void translate()
    {
        theFinalOutpout(moveHorizontally(), moveVertically());
    }

    public static void distanceFromOrigin()
    {
        int moveHorValue = moveHorizontally();
        int moveVerValue = moveVertically();
        int theFinalValue = (moveHorValue * moveHorValue) + (moveVerValue * moveVerValue);

        JOptionPane.showMessageDialog(null,"Your X value: " + moveHorValue + "\nYour Y value: " + moveVerValue +
                     "\n\nThe distance from the origin (0,0) is: \n" + theFinalValue + " units");
    }


    public static void switchUsedForInputs()
    {
        String switchChoice = JOptionPane.showInputDialog(switchQuestion());


        switch(switchChoice) {
            case "A":
                theFinalOutpout(moveHorizontally(), 0);
                break;
            case "B":
                theFinalOutpout(0,moveVertically());
                break;
            case "C":
                translate();
                break;
            case "D":
                distanceFromOrigin();

                break;
            default:
                JOptionPane.showMessageDialog(null,"Sorry but you did not enter a choice! Please do so :)");


        }

    }

    public static String switchQuestion()
    {
        return "Please enter a choice: \n(A) - to move Horizontally \n(B) - to move Vertically" +
                "\n(C) - To move to a specific x and y" + "\n(D) - to know the current distance from the origin x and y";
    }
}

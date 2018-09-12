import javax.swing.*;

public class FirstJavaQs {

    public static void main(String[] args) {

        String customerName, className;
        int snacksCost = 2;

        customerName = JOptionPane.showInputDialog("Please enter your name ");
        className = JOptionPane.showInputDialog("Please enter your class name ");
        int amountOfSnacks = Integer.parseInt(JOptionPane.showInputDialog("Please enter how many snacks you would like (2 euro each) "));

        JOptionPane.showMessageDialog(null,"Your name is: " + customerName + "\nYour class name is: "
                + className + "\nNumber of snacks you've bought: " + amountOfSnacks + "\nTotal price for snacks: " + amountOfSnacks * snacksCost);

    }
}

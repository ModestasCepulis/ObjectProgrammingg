import javax.swing.*;

public class SecondJavaQs {

    public static void main(String[] args) {

        String CyclistName, CyclistInitial, CyclistSurname;
        int AmountCycled, reminder, firstTen = 10, totalPrice, priceAfterReminder;

        CyclistName = JOptionPane.showInputDialog("Please enter your name: ");
        CyclistInitial = JOptionPane.showInputDialog("Please enter your Initial letter: ");
        CyclistSurname = JOptionPane.showInputDialog("Please enter your surname: ");
        AmountCycled = Integer.parseInt(JOptionPane.showInputDialog("Please enter the amount you cycled: "));


        if(AmountCycled <= 10)
        {
            totalPrice = AmountCycled * 7;
            JOptionPane.showMessageDialog(null,"Your full name is: " + CyclistName + " " + CyclistInitial + " " + CyclistSurname
                    + "\nTotal amount sponsered for: " + totalPrice);
        }
        else if (AmountCycled > 10)
        {
            reminder = AmountCycled - firstTen;
            priceAfterReminder = reminder * 10;
            totalPrice = priceAfterReminder + 70;
            JOptionPane.showMessageDialog(null,"Your full name is: " + CyclistName + " " + CyclistInitial + " " + CyclistSurname
                    + "\nTotal amount sponsered for: " + totalPrice);


        }

    }
}

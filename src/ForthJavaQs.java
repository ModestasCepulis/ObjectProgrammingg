import javax.swing.*;

public class ForthJavaQs {

    public static void main(String[] args) {

        String mainEnteringNumbers;
        int totalAmountOFNumbersEntered = 0, theTotalSum = 0;
        boolean numberTest = false;

        while(!numberTest)
        {

            mainEnteringNumbers = JOptionPane.showInputDialog("Please enter a number");

            if(mainEnteringNumbers.equals("q"))
            {
                numberTest = true;
                totalAmountOFNumbersEntered = totalAmountOFNumbersEntered - 1;
            }

            totalAmountOFNumbersEntered++;
            theTotalSum = mainEnteringNumbers + mainEnteringNumbers;



        }

        JOptionPane.showMessageDialog(null,"Total of numbers entered: " + totalAmountOFNumbersEntered
                + "Total sum of numbers entered " + theTotalSum);
    }
}

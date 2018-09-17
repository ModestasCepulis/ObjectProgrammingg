import javax.swing.*;

public class ForthJavaQs {

    public static void main(String[] args) {

        String mainEnteringNumbersAsString;
        int totalAmountOFNumbersEntered = 0, totalSum = 0;
        boolean numberTest = false;

        while(!numberTest)
        {

            mainEnteringNumbersAsString = (JOptionPane.showInputDialog("Please enter a number"));
            totalAmountOFNumbersEntered++;

            if(mainEnteringNumbersAsString.equals("q"))
            {
                numberTest = true;
                totalAmountOFNumbersEntered = totalAmountOFNumbersEntered - 1;
            }


            if(!mainEnteringNumbersAsString.equals("q"))
            {
                int mainEnteringNumbers = Integer.parseInt(mainEnteringNumbersAsString);
                totalSum += mainEnteringNumbers;
            }



        }

        JOptionPane.showMessageDialog(null,"Total of numbers entered: " + totalAmountOFNumbersEntered
                + "\nTotal sum of numbers entered " + totalSum);
    }
}

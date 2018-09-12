import javax.swing.*;

public class ThirdJavaQs {
    public static void main(String[] args) {
        String personName;
        int taxableIncome;
        double TaxOnIncome, incomeAfterTax;

        personName = JOptionPane.showInputDialog("Please enter your name: ");
        taxableIncome = Integer.parseInt(JOptionPane.showInputDialog("Please enter the amount you earn anually"));

        if(taxableIncome >=0.00 && taxableIncome <= 20000.00)
        {
            TaxOnIncome = (taxableIncome * 0.00);
            incomeAfterTax = taxableIncome - TaxOnIncome;

            JOptionPane.showMessageDialog(null,"Your name is: " + personName + "\nYour gross income: " + taxableIncome
            + "\nThe Tax rate: 0%" + "\nTotal tax: " + TaxOnIncome + "\nTotal income after tax: " +incomeAfterTax);

        }

        else if(taxableIncome >=20000.01 && taxableIncome <= 36000.00)
        {
            TaxOnIncome = (taxableIncome * 0.20);
            incomeAfterTax = taxableIncome - TaxOnIncome;

            JOptionPane.showMessageDialog(null,"Your name is: " + personName + "\nYour gross income: " + taxableIncome
                    + "\nThe Tax rate: 20%" + "\nTotal tax: " + TaxOnIncome + "\nTotal income after tax: " +incomeAfterTax);

        }

        else
        {
            TaxOnIncome = (taxableIncome * 0.41);
            incomeAfterTax = taxableIncome - TaxOnIncome;

            JOptionPane.showMessageDialog(null,"Your name is: " + personName + "\nYour gross income: " + taxableIncome
                    + "\nThe Tax rate: 41%" + "\nTotal tax: " + TaxOnIncome + "\nTotal income after tax: " +incomeAfterTax);

        }
    }
}

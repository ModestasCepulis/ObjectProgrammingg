import javax.swing.*;

public class PS3_Q2_RUN {
    static SavingsAccount Svgacc;

    public static void main(String[] args) {

        Svgacc = new SavingsAccount();

        finalOutput();

    }

    public static void finalOutput()
    {

        SavingsAccount[] catalog = new SavingsAccount[numberOfSavingAccounts()];

        for(int i = 0;i < catalog.length;i++)
        {
            catalog[i] = new SavingsAccount();
            catalog[i].setName(JOptionPane.showInputDialog("Please enter the name of the account owner: "));
            catalog[i].setAccnum(Integer.parseInt(JOptionPane.showInputDialog("Please enter the account number: ")));
            catalog[i].setBalance(Double.parseDouble(JOptionPane.showInputDialog("Please enter the balance of the account: ")));

            SavingsAccount hellaToast = new SavingsAccount()


            /*SavingsAccount svgAcc = new SavingsAccount();
            String newBalance = JOptionPane.showInputDialog("Please enter the amount that you wish to lodge to the account: ");*/

            Svgacc.bankAccountsCounter();
        }

        displayBankAccounts(catalog);



    }

    public static int numberOfSavingAccounts()
    {
        String noSavingAccountsString = JOptionPane.showInputDialog("Please enter the amount of Saving Accounts that you wish to open");
        int noSavingAccountsInt = Integer.parseInt(noSavingAccountsString);
        return noSavingAccountsInt;
    }

    public static void displayBankAccounts(SavingsAccount[] array)
    {
        JTextArea text = new JTextArea();

        text.setText("Number of bank Accounts: " + bnkacc.getNumberOfBankAccounts());

        for(int i = 0;i < array.length; i++)
        {
            text.append(array[i].toString500());
        }

        JOptionPane.showMessageDialog(null,text,"Information",JOptionPane.INFORMATION_MESSAGE);
    }
}

import javax.swing.*;

public class PS3_Q2_RUN {
    static BankAccount2 bnkacc;

    public static void main(String[] args) {

        bnkacc = new BankAccount2();

        finalOutput();

    }

    public static void finalOutput()
    {

        BankAccount2[] catalog = new BankAccount2[numberOfSavingAccounts()];

        for(int i = 0;i < catalog.length;i++)
        {
            catalog[i] = new BankAccount2();
            catalog[i].setName(JOptionPane.showInputDialog("Please enter the name of the account owner: "));
            catalog[i].setAccnum(Integer.parseInt(JOptionPane.showInputDialog("Pleas eenter the account number: ")));
            //catalog[i].setOwner(new BankAccount2());
            //catalog[i].setBalance(Double.parseDouble(JOptionPane.showInputDialog("Please enter the accounts balance")));

            bnkacc.bankAccountsCounter();
        }

        displayBankAccounts(catalog);



    }

    public static int numberOfSavingAccounts()
    {
        String noSavingAccountsString = JOptionPane.showInputDialog("Please enter the amount of Saving Accounts that you wish to open");
        int noSavingAccountsInt = Integer.parseInt(noSavingAccountsString);
        return noSavingAccountsInt;
    }

    public static void displayBankAccounts(BankAccount2[] array)
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

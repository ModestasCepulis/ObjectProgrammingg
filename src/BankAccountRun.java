import javax.swing.*;

public class BankAccountRun {

    static Person customer;
    static BankAccount bnkAcc;

    public static void main(String[] args) {
        customer = new Person();
        bnkAcc = new BankAccount();

        String AccountsString;
        AccountsString = JOptionPane.showInputDialog("Please enter the amount of bank accounts that you wish to create (000 to close)");
        int AccountsInt = Integer.parseInt(AccountsString);


        if(AccountsInt == 000)
        {
            errorMessage();
        }

        BankAccount [] customers = new BankAccount[AccountsInt];

        for(int i = 0; i < customers.length; i++)
        {
            customers[i] = new BankAccount();
            customers[i].setAccnum(inputAccountNumber());
            customers[i].setBalance(inputBalance());

            customer.setName(inputName());

            JOptionPane.showMessageDialog(null,"Account Number: " + customers[i].getAccnum() +
                    "\n Balance: " + customers[i].getBalance() + "\nAccount Holder: " + customer.getName());

        }


    }

    public static String inputAccountNumber()
    {
        String accountNoString;
        accountNoString = JOptionPane.showInputDialog("Please enter the account number: (EXIT to close)").toUpperCase();
        if(accountNoString.equals("EXIT"))
        {
            errorMessage();
        }

        return accountNoString;

    }

    public static double inputBalance()
    {
        String balanceString;
        balanceString = JOptionPane.showInputDialog("Please enter the account balance: (000 to close)").toUpperCase();
        double balanceDouble = Double.parseDouble(balanceString);

        if(balanceDouble == 000)
        {
            errorMessage();
        }

        return balanceDouble;
    }

    public static String inputName()
    {
        String nameString;
        nameString = JOptionPane.showInputDialog("Please enter the name: (EXIT to close)").toUpperCase();
        if(nameString.equals("EXIT"))
        {
            errorMessage();
        }

        customer.setName(nameString);
        return nameString;
    }

    public static void errorMessage()
    {
        JOptionPane.showMessageDialog(null,"Thank you for using the system, now quitting...");
        System.exit(0);
    }



}

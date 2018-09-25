import javax.swing.*;

public class OtherLibrary {

    static Book bk1;

    public static void main(String[] args) {

        bk1 = new Book();

        String title = inputTitle();
        double price = inputPrice();
        String ISBN = inputISBN();
        int pages = inputNoOfPages();

        finalOutput(title,ISBN,pages,price);

    }

    public static String inputTitle()
    {
        String titleTest;

        bk1.setTitle(titleTest = JOptionPane.showInputDialog("Please enter the title:"));

        while(titleTest.equals(""))
        {
            JOptionPane.showMessageDialog(null,"You did not enter a title! Please enter a title");

            bk1.setTitle(titleTest = JOptionPane.showInputDialog("Please enter the title:"));
        }

        return titleTest;

    }

    public static String inputISBN()
    {
        String isbnTest;



        bk1.setISBN(isbnTest = JOptionPane.showInputDialog("Please enter the ISBN number:"));

        while(isbnTest.equals(""))
        {
            JOptionPane.showMessageDialog(null,"You did not enter a valid ISBN! Please enter a valid ISBN");

            bk1.setISBN(isbnTest = JOptionPane.showInputDialog("Please enter the ISBN number:"));

        }

        return isbnTest;
    }

    public static double inputPrice()
    {
        double priceTest=0;

        String PriceAsString = JOptionPane.showInputDialog("Please enter the price:");

        while(PriceAsString.equals(""))
        {
            JOptionPane.showMessageDialog(null,"You did not enter a price! Please enter a valid price");

            PriceAsString = JOptionPane.showInputDialog("Please enter the price:");
            bk1.setPrice(Double.parseDouble(PriceAsString));
        }

        priceTest = Double.parseDouble((PriceAsString));
        bk1.setPrice(priceTest);

        return priceTest;

    }

    public static int inputNoOfPages()
    {
        int noofpagesTest=0;

        String noOfPagesAsString = JOptionPane.showInputDialog("Please enter the number of pages:");

        while(noOfPagesAsString.equals(""))
        {
            JOptionPane.showMessageDialog(null,"You did not enter any page numbers! Please enter pages numbers.");

            noOfPagesAsString = JOptionPane.showInputDialog("Please enter the number of pages:");
            bk1.setnoOfPages(Integer.parseInt(noOfPagesAsString));
        }


        bk1.setnoOfPages(Integer.parseInt(noOfPagesAsString));
        return noofpagesTest;


    }

    public static void finalOutput(String titleTest, String isbnTest, int noofpagesTest, double priceTest)
    {

        bk1.setTitle(titleTest);
        bk1.setISBN(isbnTest);
        bk1.setnoOfPages(noofpagesTest);
        bk1.setPrice(priceTest);

        JOptionPane.showMessageDialog(null,"The title is: " + bk1.getTitle() + "\nThe ISBN number is : " + bk1.getISBN()
                +"\nThe Price is: " + bk1.getPrice() + "\nThe number of pages: " + bk1.getnoOfPages());
    }
}

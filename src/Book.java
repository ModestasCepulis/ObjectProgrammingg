import javax.print.attribute.standard.MediaSize;
import javax.swing.*;

public class Book {

    public void main(String[] args) {

        OtherLibrary lb1 = new OtherLibrary();

    }

    private String title;
    private double price;
    private String ISBN;
    private int noOfPages;

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }

    public void setPrice (double price)
    {
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }

    public void setISBN (String ISBN)
    {
        this.ISBN = ISBN;
    }

    public String getISBN()
    {
        return ISBN;
    }

    public void setnoOfPages (int noOfPages)
    {
        this.noOfPages = noOfPages;
    }

    public int getnoOfPages()
    {
        return noOfPages;
    }

    public Book()
    {
        this.title = "No Title";
        this.price = 0.00;
        this.ISBN = "No ISBN";
        this.noOfPages = 0;
    }

    public Book(String title, double price, String ISBN, int noOfPages)
    {

        setTitle(title);
        setPrice(price);
        setISBN(ISBN);
        setnoOfPages(noOfPages);
    }


























    /*
    public void toString()
    {
        Book bk1 = new Book();
       String theLastOutput = JOptionPane.showMessageDialog(null,"\nThe title is \n" + bk1.getTitle() + "\n\nThe ISBN number is: \n" + bk1.getISBN()
                + "\n\nThe price is : \n" + bk1.getPrice() + "\n\nThe total number of pages: \n" + bk1.getnoOfPages());

    }
    */


    /*
    public void userInput(String title, double price, String ISBN, int noOfPages)
    {
        title = JOptionPane.showInputDialog("Please enter the title");
        this.title = title;

        String PriceAsString = JOptionPane.showInputDialog("Please enter the price");
        price = Double.parseDouble(PriceAsString);
        this.price = price;

        String userISBN = JOptionPane.showInputDialog("Please enter the ISBN number");
        this.ISBN = ISBN;

        String usernoOfPagesAsAString = JOptionPane.showInputDialog("Please enter the price");
        noOfPages = Integer.parseInt(usernoOfPagesAsAString);
        this.noOfPages = noOfPages;

    }
    */










}


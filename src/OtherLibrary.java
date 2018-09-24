import javax.swing.*;

public class OtherLibrary {

    public static void main(String[] args) {
        Book bk1 = new Book();


        bk1.setTitle(JOptionPane.showInputDialog("Please enter the title:"));

        bk1.setISBN(JOptionPane.showInputDialog("Please enter the ISBN number:"));

        String PriceAsString = JOptionPane.showInputDialog("Please enter the price:");
        bk1.setPrice(Double.parseDouble(PriceAsString));

        String noOfPagesAsString = JOptionPane.showInputDialog("Please enter the number of pages:");
        bk1.setnoOfPages(Integer.parseInt(noOfPagesAsString));


        JOptionPane.showMessageDialog(null,"The title is: " + bk1.getTitle() + "\nThe ISBN number is :" + bk1.getISBN()
                                      +"\nThe Price is: " + bk1.getPrice() + "\nThe number of pages: " + bk1.getnoOfPages());
    }
    
}

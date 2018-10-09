import javax.swing.*;
import java.awt.*;

public class MyFlicks {

    static Film flm;
    static boolean check = true;

    public static void main(String[] args) {
        flm = new Film();
        whileCheck();
    }

    public static String inputFilm()
    {
        String filmString;
        filmString = JOptionPane.showInputDialog("Please enter the name of the film (EXIT to exit) " + check).toUpperCase();
        if(filmString.equals("EXIT"))
        {
            check = false;
            checkFalse();
        }
        return filmString;
    }

    public static String inputDirector()
    {
        String directorString;
        directorString = JOptionPane.showInputDialog("Please enter the director (EXIT to exit)" + check).toUpperCase();
        if(directorString.equals("EXIT"))
        {
            check = false;
            checkFalse();
        }
        return directorString;
    }

    public static int inputDuration()
    {
        String durationString;
        durationString = JOptionPane.showInputDialog("Please enter the duration of the movie (000 to exit)" +check);
        int durationInt = Integer.parseInt(durationString);
        if(durationInt == 000)
        {
            check = false;
            checkFalse();
        }

        flm.theNumberCounter();

        return durationInt;
    }

    public static void checkFalse()
    {

        JTextArea text = new JTextArea();

        Font font = new Font("monospaced", Font.PLAIN, 12);
        text.setFont(font);

        String displayText = "The number of films: " + flm.getNumberOfFilms();

        int numberForArray = flm.getNumberOfFilms();

        Film [] array = new Film[numberForArray];

        for(int i = 0; i < array.length; i++ )
        {
            displayText+="\n\nFilm: " + flm.getTitle();
        }

        text.setText(displayText);

        JOptionPane.showMessageDialog(null,text,"Catalog",JOptionPane.PLAIN_MESSAGE);

        //JOptionPane.showMessageDialog(null, "The number of films: " + flm.getNumberOfFilms() +
          //      flm.toString());
        System.exit(0);
    }

    public static void whileCheck()
    {
        while(check == true)
        {
            Film movies [] = new Film[999];
            for(int i = 0; i < movies.length; i++)
            {
                movies[i] = new Film();
                movies[i].setTitle(inputFilm());
                movies[i].setDuration(inputDuration());
                movies[i].setDirector(inputDirector());

            }

        }
    }
}

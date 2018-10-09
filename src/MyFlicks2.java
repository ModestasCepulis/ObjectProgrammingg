import javax.swing.*;
import java.awt.*;

public class MyFlicks2 {

    static Film flm;

    public static void main(String[] args) {
        flm = new Film();

        finalOutput();

    }

    public static int amountMovies()
    {
        String amountMoviesString = JOptionPane.showInputDialog("Please enter the amount of movies that you would like to add");
        int amountMoviesInt = Integer.parseInt(amountMoviesString);
        return amountMoviesInt;
    }

    public static String inputFilm()
    {
        String filmString;
        filmString = JOptionPane.showInputDialog("Please enter the name of the film");
        return filmString;
    }

    public static String inputDirector()
    {
        String directorString;
        directorString = JOptionPane.showInputDialog("Please enter the director");
        return directorString;

    }

    public static int inputDuration() {
        String durationString;
        durationString = JOptionPane.showInputDialog("Please enter the duration of the movie");
        int durationInt = Integer.parseInt(durationString);
        return durationInt;
    }

    public static void finalOutput()
    {


        Film[] array = new Film[amountMovies()];

        for(int i = 0; i<array.length; i++)
        {
            array[i] = new Film();

            array[i].setTitle(inputFilm());
            array[i].setDuration(inputDuration());
            array[i].setDirector(inputDirector());

            flm.displayFilms(array);
        }

    }




}

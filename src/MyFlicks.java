import javax.swing.*;

public class MyFlicks {

    static Film flm;
    static boolean check;

    public static void main(String[] args) {
        flm = new Film();


        check = true;

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

        if(check == false)
        {
            JOptionPane.showMessageDialog(null, "The number of films: " + flm.getNumberOfFilms());
        }
    }

    public static String inputFilm()
    {
        String filmString;
        filmString = JOptionPane.showInputDialog("Please enter the name of the film (EXIT to exit)").toUpperCase();
        if(filmString.equals("EXIT"))
        {
            check = true;
        }
        return filmString;
    }

    public static String inputDirector()
    {
        String directorString;
        directorString = JOptionPane.showInputDialog("Please enter the director (EXIT to exit)").toUpperCase();
        if(directorString.equals("EXIT"))
        {
            check = true;
        }
        return directorString;
    }

    public static int inputDuration()
    {
        String durationString;
        durationString = JOptionPane.showInputDialog("Please enter the duration of the movie (000 to exit)");
        int durationInt = Integer.parseInt(durationString);
        if(durationInt == 000)
        {
            check = true;
        }

        flm.theNumberCounter();

        return durationInt;
    }
}

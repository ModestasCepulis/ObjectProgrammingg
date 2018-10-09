import javax.swing.*;
import java.awt.*;

public class Film {

    private String title;
    private String director;
    private int duration;
    private int numberOfFilms = 0;

    public void setTitle(String title){this.title = title;};
    public String getTitle(){return title;};

    public void setDirector(String director){this.director = director;};
    public String getDirector(){return director;};

    public void setDuration(int duration){this.duration = duration;};
    public int getDuration(){return duration;};

    public int getNumberOfFilms(){return numberOfFilms;};
    public void theNumberCounter(){numberOfFilms++;}

    public void displayFilms(Film[] array){
        JTextArea text = new JTextArea(2,2);
        Font font = new Font("monoscape", Font.PLAIN, 12);
        text.setFont(font);

        String displayText = "Number of Films: " + getNumberOfFilms();

        for(int i=0;i<array.length;i++)
        {
            displayText+="\n\nFilm: " + array[i].getTitle() + "\nDirector " + array[i].getDirector() +
                    "\nDuration: " + array[i].getDuration() + "minutes\n";

        }

        text.setText(displayText);

        JOptionPane.showMessageDialog(null,text,"Catalog",JOptionPane.PLAIN_MESSAGE);
    }


    public Film()
    {
        this.title = "No title";
        this.director = "No Director";
        this.duration = 0;
    }

    public Film(String title, String director, int duration)
    {
        setTitle(title);
        setDirector(director);
        setDuration(duration);

    }

    public String toString()
    {
        return "\n\nFilm: " + getTitle() + "\nDirection: " + getDirector() + "\nDuration: " + getDuration();
    }


}

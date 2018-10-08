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
        return "Number of Films: " + "\n\nFilm: " + "\nDirection: " + "\nDuration: ";
    }


}

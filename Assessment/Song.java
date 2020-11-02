package Assessment;

public class Song {
    private int trackN , ReleaseYear , duration;
    private static int trackID;
    private String title , artist , genre;

    public  Song(String title,String artist,String genre,int trackN,int ReleaseYear,int duration)
    {
        setTitle(title);
        setArtist(artist);
        setGenre(genre);
        setTrackN(trackN);
        setReleaseYear(ReleaseYear);
        setDuration(duration);
    }

    public Song() {

    }

    private void setTrackN(int trackN)
    {
        return;
    }

    public static int getTrackN()
    {
        this.trackN;
    }

    public String setTitle(String title)
    {
        this.title;
    }

    public void getTitle()
    {
        return;
    }

    public void setArtist(String artist)
    {
        return;
    }

    public void setGenre(String genre)
    {
        return;
    }

    public String getGenre()
    {
        this.genre;
    }

    public void setDuration(int duration)
    {
        return;
    }

    public int getDuration()
    {
        this.duration;
    }

    public void setReleaseYear(int ReleaseYear)
    {
        return;
    }

    public int getReleaseYear()
    {
        this.duration;
    }
}

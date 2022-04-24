package adapter_design;

public class Track extends Song {

    private String title;
    private String album;
    private String firstName;
    private String lastName;
    private Genre genre;

    public Track(String title, String album, String firstName, String lastName, Genre genre){
        this.title = title;
        this.album = album;
        this.firstName = firstName;
        this.lastName = lastName;
        this.genre = genre;
    }

    public String getTitle(){
        return this.title;

    }

    public String getAlbum(){
        return this.album;

    }

    public String getFirstName(){
        return this.firsName;

    }

    public String getLastName(){
        return this.lastName;

    }

    public String getGenre(){
        return this.genre;

    }
}

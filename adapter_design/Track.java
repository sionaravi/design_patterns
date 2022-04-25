package adapter_design;
/**
 * The record of the song for the JukeBox
 * @author Siona Ravi
 */

public class Track extends Song {
	
    private String title;
    private String album;
    private String firstName;
    private String lastName;
    private Genre genre;

    /**
     * Creates a new Song
     * @param title of the song
     * @param album of the song
     * @param firstName of artist
     * @param lastName of artist
     * @param genre of the song
     */
    public Track(String title, String album, String firstName, String lastName, Genre genre) {
        this.title = title;
        this.album = album;
        this.firstName = firstName;
        this.lastName = lastName;
        this.genre = genre;
    }

    /**
     * Gets the title of the song
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the album where the song is from
     * @return album of the sing
     */
    public String getAlbum() {
        return album;
    }

    /**
     * Gets the artists first name
     * @return first name of the artist
     */
    public String getArtistFirstName() {
        return firstName;
    }

    /**
     * Gets the artists last name
     * @return last name of the artist
     */
    public String getArtistLastName() {
        return lastName;
    }

    /**
     * Returns the song's genre
     * @return  the string represtation of the genre
     */
	public Genre getGenre() {
       return genre;
    }

}

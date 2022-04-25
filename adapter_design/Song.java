package adapter_design;

/**
 * This is the abstract class of the Song
 * @author Siona Ravi
 */
public abstract class Song{
    
    /**
     * Gets the name of the song
     * @return title
     */
    public abstract String getTitle();
    
    /**
     * Gets the name of the album
     * @return album
     */
    public abstract String getAlbum();

    /**
     * Gets the first name of the artist
     * @return firstname
     */
    public abstract String getArtistFirstName();

    /**
     * Gets the last name of the artist
     * @return lastname
     */
    public abstract String getArtistLastName();

    /**
     * 
     * @return
     */
    public abstract Genre getGenre();

    /**
     * Prints the title, album, artist name and genre
     */
    public String toString() {
    	return "\n"+getTitle() + "\nAlbum: "+ getAlbum() + "\nBy: " + getArtistFirstName() + " " + getArtistLastName() + "\nGenre: " + convertString(getGenre(). toString());
    }
    
    /**
     * Converts the enum to a string
     * @param something 
     * @return
     */
    private String convertString(String something) {
        return something.substring(0, 1).toUpperCase() + something.substring(1).toLowerCase();
	}
    
}
     
    


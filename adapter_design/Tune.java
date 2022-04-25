package adapter_design;

/**
 * Holds the information for the Song
 * @author Siona Ravi
 */
public interface Tune {

    /**
     * Gets the full name of the Artist
     * @return the first and last name of the artist, separated by a space
     */
    public String getArtistName();
    
    /**
     * Gets the song's name and the album
     * @return 
     */
    public String getDisplayTitle();
    
    /**
     * Gets the genre of the song 
     * @returnthe string represtation of the genre 
     */
    public String getCategory();
    
    }

    


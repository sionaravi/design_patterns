package adapter_design;

/**
 * Oldie class that has old song's information
 * @author Siona Ravi
 */
public class Oldie implements Tune{
    private String artistName;
    private String songTitle;
    private String recordTitle;
    private String category;

    /**
     * Has the song's information 
     * @param artistName 
     * @param songTitle
     * @param recordTitle
     * @param category
     */
    public Oldie(String artistName, String songTitle, String recordTitle, String category){
        this.artistName = artistName;
        this.songTitle = songTitle;
        this.recordTitle = recordTitle;
        this.category = category;
    }

    /**
     * Gets the name of the artist
     */
    public String getArtistName(){
        return this.artistName ;

    }
    
    /**
     * Gets the title seperated with semi colon and the title
     */
    public String getDisplayTitle(){
        return this.songTitle + ": " + this.recordTitle;

    }

    /**
     * Gets the category of the song
     */
    public String getCategory(){
    	return this.category;

    }

	

	
}

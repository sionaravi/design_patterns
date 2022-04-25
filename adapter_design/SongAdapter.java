package adapter_design;

/**
 * This the Adapter class 
 * @author Siona Ravi
 */
public class SongAdapter extends Song {
    private Tune tune;

    /**
     * JukeBox Adapter constructor assigns the song
     * @param tune
     */
    public SongAdapter(Tune tune) {
        this.tune = tune;
    }
    /**
     * getTitle method gets the title of the song
     * @return Title
     */
    public String getTitle() {
        return tune.getDisplayTitle().split(":")[0];
    }

    /**
     * getAlbum method gets the album of the song
     * @return Album
     */
    public String getAlbum() {
        return tune.getDisplayTitle().split(":")[1];
    }

    /**
     * getArtistFirstName method gets the first name of the artisy.
     * @return firstname
     */
    public String getArtistFirstName() {
        return tune.getArtistName().split(" ")[0];
    }

    /**
     * getLastArtistName method gets the last name of the artist.
     * @return lastname
     */
    public String getArtistLastName() {
        return tune.getArtistName().split(" ")[1];
    }

    /**
     * getGenre method gets the genre of the song.
     * @return genre
     */
    public Genre getGenre(){
    	
       String sortingCategory = tune.getCategory().toLowerCase();
       if(sortingCategory.equals("country and western")) return Genre.COUNTRY;
       if(sortingCategory.equals("r&b and soul")) return Genre.HIPHOP;
       if(sortingCategory.equals("easy listening")) return Genre.POP;
       if(sortingCategory.equals("rock")) return Genre.ROCK;
       if(sortingCategory.equals("classic rock")) return Genre.ROCK;
       if(sortingCategory.equals("country and western")) return Genre.COUNTRY;
       
       
       return Genre.OTHER;

      
    }
        
    
    }
    



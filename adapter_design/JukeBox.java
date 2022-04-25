package adapter_design;
/**
 * @author Siona Ravi
 * This JukeBox Class that contains the song titles and 
 */

import java.util.HashMap;

public class JukeBox {
    private HashMap<String, Song> songs = new HashMap<String, Song>();
    private int currentSong;

    /**
     * This is a HashMap
     */
    public void JukeBoke(){
    	songs = new HashMap<>();
    }

    /**
     * Adds the song to the HashMap
     * @param song
     */
    public void addSong(Song song){
        songs.put(song.getTitle().toLowerCase(),song);
   
    }

    /**
     * Given the song name, as long as it is in the hashmap, it displays the strings toString.  
     * Otherwise it gives a sorry message
     * @param songName
     */
    public void play(String songName) {
            String lower = songName.toLowerCase();
            if(songs.containsKey(lower)){
                Song song = songs.get(lower);
                System.out.println(song.toString());
            	} else {
            	System.out.println("Sorry " + songName + " this song isn't available.");
            	}
    }
}

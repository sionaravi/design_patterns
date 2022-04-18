package state_design;

/**
 * Creates the English State for Music Box 
 * @author Siona Ravi
 */

import java.util.ArrayList;

public class EnglishState implements State {
	
	private MusicBox box;
	
	/**
	 * Creates EnglishState
	 * @param box box being used
	 */
	public EnglishState(MusicBox box) {
		this.box = box;
		
	}
	
	/**
	 * Calls for lyrics for Star Button pressed
	 */
	public void pressStarButton() {
		ArrayList<String> engStarLyrics = new ArrayList<String>();
		engStarLyrics.add("\nCurrently playing: ");
		engStarLyrics.add("\nTwinkle twinkle little star");
		engStarLyrics.add("\nHow I wonder what you are");
		engStarLyrics.add("\nUp above thw world so high");
		engStarLyrics.add("\nLike a diamond in the sky");
		engStarLyrics.add("\nTwinkle twinkle little star");
		engStarLyrics.add("\nHow I wonder what you are");
		box.playSong("Twinkle Twinkle Little Star", engStarLyrics);
		
	}
	
	/**
	 * Calls for lyrics for Happy Button pressed
	 */
	public void pressHappyButton() {
		ArrayList<String> engHappyLyrics = new ArrayList<String>();
		engHappyLyrics.add("\nCurrently playing: ");
		engHappyLyrics.add("Imagine me and you, I do");
		engHappyLyrics.add("\nI think about you day and night, it's only right");
		engHappyLyrics.add("\nTo think about the girl you love, and hold her tight");
		engHappyLyrics.add("\nSo happy together");
		engHappyLyrics.add("\nIf I should call you up, invest a dime");
		engHappyLyrics.add("\nAnd you say you belong to me, and ease my mind");
		engHappyLyrics.add("\nImagine how the world could be, so very fine");
		engHappyLyrics.add("\nSo happy together");
		box.playSong("So Happy Together", engHappyLyrics);
		
	}
	
	/**
	 * Calls for lyrics for English Button pressed
	 */
	public void pressEnglishButton() {
		System.out.println("I think you're in English mode");
		
	}
	
	/**
	 * Calls for lyrics for French Button pressed
	 */
	public void pressFrenchButton() {
		System.out.println("Oui! let's switch to French");
		box.setState(box.getFrenchState());
		
	}
	
	/**
	 * Calls for lyrics for Spanish Button pressed
	 */
	public void pressSpanishButton() {
		System.out.println("Sí! let's switch to Spanish");
		box.setState(box.getSpanishState());
		
	}
	
}

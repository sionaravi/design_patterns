package state_design;

/**
 * Creates the FrenchState for Music Box
 * @author Siona Ravi
 */

import java.util.ArrayList;

public class FrenchState implements State {
	
private MusicBox box;
	
	/**
	 * Creates FrenchState
	 * @param box
	 */
	public FrenchState(MusicBox box) {
		this.box = box;
		
	}
	
	/**
	 * Calls for lyrics for Star Button pressed
	 */
	public void pressStarButton() {
		ArrayList<String> freStarLyrics = new ArrayList<String>();
		freStarLyrics.add("\nBrille, brille, petite étoile");
		freStarLyrics.add("\nJe me demande vraiment ce que tu es");
		freStarLyrics.add("\nAu-dessus du monde si haut");
		freStarLyrics.add("\nComme un diamant dans le ciel");
		freStarLyrics.add("\nBrille, brille, petite étoile");
		freStarLyrics.add("\nJe me demande vraiment ce que tu es");
		box.playSong("Brille, brille, petite étoile", freStarLyrics);
		
	}
	
	/**
	 * Calls for lyrics for Happy Button pressed
	 */
	public void pressHappyButton() {
		ArrayList<String> freHappyLyrics = new ArrayList<String>();
		freHappyLyrics.add("\nJoue actuellement: ");
		freHappyLyrics.add("\nImagine moi et toi, je fais");
		freHappyLyrics.add("\nJe pense à toi jour et nuit, c'est juste");
		freHappyLyrics.add("\nPenser à la fille que tu aimes et la serrer fort");
		freHappyLyrics.add("\nSi heureux ensemble");
		freHappyLyrics.add("\nSi je dois t'appeler, investis un centime");
		freHappyLyrics.add("\nEt tu dis que tu m'appartiens, et soulage mon esprit");
		freHappyLyrics.add("\nImagine comment le monde pourrait être, si bien");
		freHappyLyrics.add("\nSi heureux ensemble");
		box.playSong("Si heureux ensemble", freHappyLyrics);
		
	}
	
	/**
	 * Calls for lyrics for English Button pressed
	 */
	public void pressEnglishButton() {
		System.out.println("Okay! let's switch to English");
		box.setState(box.getEnglishState());
		
	}
	
	/**
	 * Calls for lyrics for French Button pressed
	 */
	public void pressFrenchButton() {
		System.out.println("Oui! let's switch to French");
		
	}
	
	/**
	 * Calls for lyrics for Spanish Button pressed
	 */
	public void pressSpanishButton() {
		System.out.println("Sí! let's switch to Spanish");
		box.setState(box.getSpanishState());

		
	}

	
	
}

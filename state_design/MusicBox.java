package state_design;

/**
 * @author Siona Ravi
 * Creates Music Box object
 */

import java.util.*;

public class MusicBox {
	
	private State englishState;
	private State frenchState;
	private State spanishState;
	private State state;
	
	/**
	 * Constructor for Music Box
	 */
	
	public MusicBox() {
		
		englishState = new EnglishState(this);
		frenchState = new FrenchState(this);
		spanishState = new SpanishState(this);
		
		state = englishState;
		
	}
	
	/**
	 * Calls for Star Button Pressed on this state
	 */
	
	public void pressStarButton() {
		
		state.pressStarButton();
		
	}
	
	/**
	 * Calls for Happy Button Pressed on this state
	 */
	
	public void pressHappyButton() {
		
		state.pressHappyButton();
		setState(englishState);
		pickLanguage();
	}
	
	/**
	 * Calls for English Button Pressed on this state 
	 */
	public void pressEnglishButton() {
		
		state.pressEnglishButton();
		setState(englishState);
		
	}
	
	/**
	 * Calls for French Button Pressed on this state
	 */
	public void pressFrenchButton() {
		
		state.pressFrenchButton();
		setState(frenchState);
		pickLanguage();
		
	}
	
	/**
	 * Calls for Spanish Button Pressed on this state
	 */
	public void pressSpanishButton() {
		state.pressSpanishButton();
		setState(spanishState);
		pickLanguage();
		
	}
	
	/**
	 * Sets new state of Music Box
	 * @param state new state for Music Box
	 */
	public void setState(State state) {
		this.state = state;
		
	}
	
	/**
	 * Returns the English state
	 * @return english state
	 */
	public State getEnglishState() {
		return englishState;
	
	}
	
	/**
	 * Returns the French state
	 * @return french state
	 */
	public State getFrenchState() {
		return frenchState;
		
	}
	
	/**
	 * Returns the Spanish state
	 * @return spanish state
	 */
	public State getSpanishState() {
		return spanishState;
		
	}
	
	/**
	 * Returns the song
	 * @param songName
	 * @param lyrics 
	 */
	public void playSong(String songName, ArrayList<String> lyrics) {
		
		for (int i = 0; i < lyrics.size(); i++) {
			System.out.print(lyrics.get(i));
		}
		
		pickLanguage();
		
	}

	public void pickLanguage() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\n\n(E)nglish, (F)rench, (S)panish, (T)winkle, (H)appy, Or (Q)uit: ");
		String usersPick = scan.next();
		
		if (usersPick.equals("e")) {
			pressEnglishButton();
			
		} else if (usersPick.equals("f")) {
			pressFrenchButton();
		
		} else if (usersPick.equals("s")) {
			pressSpanishButton();
			
		} else if (usersPick.equals("t")) {
			pressStarButton();
			
		} else if (usersPick.equals("h")) {
			pressHappyButton();
			
		} else if (usersPick.equals("q")) {
			System.out.print("Bye bye!");
			
		}
		
	}

		
}
	
	
	
	
	



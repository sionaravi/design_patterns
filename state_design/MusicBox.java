package state_design;

import java.util.*;

public class MusicBox {
	
	private State englishState;
	private State frenchState;
	private State spanishState;
	private State state;
	
	public MusicBox() {
		
		englishState = new EnglishState(this);
		frenchState = new FrenchState(this);
		spanishState = new SpanishState(this);
		
		state = englishState;
		
	}
	
	public void pressStarButton() {
		
		state.pressStarButton();
		
	}
	
	public void pressHappyButton() {
		
		state.pressHappyButton();
		setState(englishState);
		pickLanguage();
	}
	

	public void pressEnglishButton() {
		
		state.pressEnglishButton();
		setState(englishState);
		
	}
	
	public void pressFrenchButton() {
		
		state.pressFrenchButton();
		setState(frenchState);
		pickLanguage();
		
	}
	
	public void pressSpanishButton() {
		state.pressSpanishButton();
		setState(spanishState);
		pickLanguage();
		
	}
	
	public void setState(State state) {
		this.state = state;
		
	}
	
	public State getEnglishState() {
		return englishState;
	
	}
	
	public State getFrenchState() {
		return frenchState;
		
	}
	
	public State getSpanishState() {
		return spanishState;
		
	}
	
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
	
	
	
	
	



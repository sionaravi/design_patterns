package state_design;

import java.util.ArrayList;

public class SpanishState implements State {
	
private MusicBox box;
	
	
	public SpanishState(MusicBox box) {
		this.box = box;

		
	}
	

	public void pressStarButton() {
		ArrayList<String> spaStarLyrics = new ArrayList<String>();
		spaStarLyrics.add("\nJugando en progreso: ");
		spaStarLyrics.add("\nEstrellita, ¿dónde estás?");
		spaStarLyrics.add("\nQuiero verte cintilar");
		spaStarLyrics.add("\nEn el cielo, sobre el mar");
		spaStarLyrics.add("\nUn diamante de verdad");
		spaStarLyrics.add("\nEstrellita, ¿dónde estás?");
		spaStarLyrics.add("\nQuiero verte cintilar");
		box.playSong("Estrellita donde estás", spaStarLyrics);
		
	}
	
	public void pressHappyButton() {
		ArrayList<String> spaHappyLyrics = new ArrayList<String>();
		spaHappyLyrics.add("Imagínate tú y yo, yo sí");
		spaHappyLyrics.add("\nPienso en ti día y noche, es justo");
		spaHappyLyrics.add("\nPensar en la chica que amas y abrazarla fuerte");
		spaHappyLyrics.add("\nTan felices juntas");
		spaHappyLyrics.add("\nSi debo llamarte, invierte un centavo");
		spaHappyLyrics.add("\nY dices que me perteneces, y tranquilizas mi mente");
		spaHappyLyrics.add("\nImagina cómo podría ser el mundo, tan bien");
		spaHappyLyrics.add("\nTan felices juntas");
		box.playSong("Tan felices juntas", spaHappyLyrics);
		
		
	}
	
	public void pressEnglishButton() {
		System.out.println("Okay! Cambiemos a ingles");
		box.setState(box.getEnglishState());
		
	}
	
	public void pressFrenchButton() {
		System.out.println("Oui! Vamos a cambiar a francés");
		box.setState(box.getFrenchState());
		
	}
	
	public void pressSpanishButton() {
		System.out.println("Creo que estas en modo español");
		
		
	}

}

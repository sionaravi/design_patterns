package singleton_design;

/**
 * This class creates a math game
 * @author Siona Ravi
 */

import java.util.*;

public class MathGame {
	
	private static MathGame mathGame;
	private int score = 0;
	private Random rand;
	private Scanner reader;
	private String[] operands = {"+", "-", "*", "/"};
	
	
	/**
	 * This is a private constructor that creates random objects 
	 * and scanner objects;
	 */
	private MathGame() {
		reader = new Scanner(System.in);
		rand = new Random();
		System.out.println("Let's Have Fun With Math!");
	}
	
	/**
	 * This will create and return a new instance of MathGame
	 * @return mathGame
	 */
	public static MathGame getInstance() {
		if (mathGame == null) {
			mathGame = new MathGame();
		}
		return mathGame;
	}
	
	/**
	 * This creates two random numbers between 1 to 100.
	 * Also takes input from user for the questions
	 * And gives messages according to their answer
	 * @return
	 */
	private boolean playRound() {
		
        int ans = 0;
        int response;
        int randNum1 = rand.nextInt(100);
        int randNum2 = rand.nextInt(100);
        int var = rand.nextInt(4);
        
        System.out.print("Round answer to 1 decimal place");
        
      
        if (operands[var].equals("+")) {
        	ans = randNum1 + randNum2;
        	System.out.println("\n" + randNum1 + " + " + randNum2 + " =");
        	
        } else if (operands[var].equals("-")) {
        	ans = randNum1 - randNum2;
        	System.out.println("\n" + randNum1 + " - " + randNum2 + " =");
        	
        } else if (operands[var].equals("*")) {
        	ans = randNum1 * randNum2;
        	System.out.println("\n" + randNum1 + " * " + randNum2 + " =");
        	
        } else if (operands[var].equals ("/")) {
        	ans = randNum1 / randNum2;
        	System.out.println("\n" + randNum1 + " / " + randNum2 + " =");
        } 
        response = reader.nextInt();
        if (response == ans) {
        	System.out.println("You got it!");
        	score++;
        	return true;
        	
        } else {
        	System.out.println("Oopsie.. You got it wrong :(");
        	return false;
        }
		
	}
	
	/**
	 * Contains a loop that will keep playing the game as long as the user wants to.
	 * First it asks "(P)lay or (Q)uit: "
	 * And gives messages according to their answer and also if they enter p it plays a round 
	 */ 
    public void play() {
        	
        boolean game = true;
        while (game) {
            System.out.print("(P)lay or (Q)uit: ");
            reader = new Scanner(System.in);
            String pq= reader.nextLine();
             switch (pq) {
               case "p":
                   playRound();
                   break;
               case "q":
                   System.out.println("Yay! You won " + score + " game/s!");
                   System.out.println("Goodbye!");
                   System.exit(0);
                   break;
               default:
                   System.out.println("Sorry, you must only enter p or q");
                   break;
                }
            
            }
            
      } 
        
  }
  

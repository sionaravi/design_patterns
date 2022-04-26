/**
 * This player will execute all the commands
 * @author JavaFine 
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class Player {

  /**
   * Initializes Player via printed statement
   */
  Player() {
    System.out.println("Our hero is born");
  }

  /**
   * Temporarily pauses program
   * @param num
   */
  private void sleep(int num) {
    try {
      TimeUnit.MILLISECONDS.sleep(num);
    } catch (Exception e) {
      System.out.println("Timer error");
    }
  }

  /**
   * Prints quit statement
   */
  public void quit() {
    System.out.println("quit!!");
  }

  /**
   * Reads and prints jump file
   */
  public void jump() {
    String fname = "jump.txt";
    //This will reference only one line of code at a time 
    String line = null;
    try {
      // FileReader reads text files in the default encoding 
      FileReader fileReader = new FileReader(fname);
      // always wrap the FileReader in BufferedReader 
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      int i = 0;
      while ((line = bufferedReader.readLine()) != null) {
        if (i % 6 == 0) {
          sleep(600);
          clear();
        }
        System.out.println(line);
        i++;
      }
      // Doing this will allow for us to close the file after we are done
      bufferedReader.close();
    } catch (IOException ex) {
      System.out.println("Error reading file named '" + fname + "'");
    }
  }

  /**
   * Reads and prints run file
   */
  public void runForward() {

    String fname = "run.txt";
    // this will reference only one line at a time
    String line = null;
    try {
      // FileReader reads text files in the default encoding
      FileReader fileReader = new FileReader(fname);
      // always wrap the FileReader in BufferedReader
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      int i = 0;
      while ((line = bufferedReader.readLine()) != null) {
        if (i % 3 == 0) {
          sleep(600);
          clear();
        }
        System.out.println(line);
        i++;
      }
      // always close the file after use
      bufferedReader.close();
    } catch (IOException ex) {
      System.out.println("Error reading file named '" + fname + "'");
    }
  }

  /**
   * Clears the console
   */
  private void clear() {
    System.out.print("\033[H\033[2J");
  }

  /**
   * Prints when player executes fire command
   */
  public void fire() {
    String fname = "fire.txt";
    // this will reference only one line at a time 
    String line = null;
    try {
      // FileReader reads text files in the default encoding 
      FileReader fileReader = new FileReader(fname);
      // always wrap the FileReader in BufferedReader 
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      int i = 0;
      while ((line = bufferedReader.readLine()) != null) {
        if (i % 3 == 0) {
          sleep(600);
          clear();
        }
        System.out.println(line);
        i++;
      }
      // always close the file after use
      bufferedReader.close();
    } catch (IOException ex) {
      System.out.println("Error reading file named '" + fname + "'");
    }
  }
}

import java.util.HashMap;

/**
 * Calls commands according to user input
 * @author JavaFine
 */
public class InputHandler {
  private HashMap<String, Command> commands = new HashMap<String, Command>();

  /**
   * Calls the Commands 
   * @param player
   */
  InputHandler(Player player) {
    Command jumpp = new JumpCommand(player);
    Command runn = new RunCommand(player);
    Command exitt = new QuitCommand(player);
    Command firee = new FireCommand(player);
    commands.put("jump", jumpp);
    commands.put("run", runn);
    commands.put("fire", firee);
    commands.put("quit", exitt);
  }

  /**
   * Executes the command called by the user
   * @param button
   */
  public void buttonPressed(String button) {
    commands.get(button).execute();
  }
}

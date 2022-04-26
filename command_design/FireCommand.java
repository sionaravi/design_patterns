/**
 * Executes Fire Command
 * @author JavaFine
 */
public class FireCommand implements Command {
  private Player player;

  /**
   * Initializes the player 
   * @param player
   */
  public FireCommand(Player player) {
    this.player = player;
  }

  /**
   * Executes the fire command
   */
  @Override
  public void execute() {
    player.fire();
  }
}
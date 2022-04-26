/**
 * Executes Jump Command
 * @author JavaFine
 */
public class JumpCommand implements Command {
  private Player player;

  /**
   * Initializes player
   * @param player
   */
  public JumpCommand(Player player) {
    this.player = player;
  }

  /**
   * Executes jump command
   */
  @Override
  public void execute() {
    player.jump();
  }

}

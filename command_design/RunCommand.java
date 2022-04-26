/**
 * Executes Run Command
 * @author JavaFine
 */
public class RunCommand implements Command {
    private Player player;

    /**
     * This creates a new instance of player
     * @param player
     */
    public RunCommand(Player player) {
      this.player = player;
    }
  
    /**
     * Implements the command to execute the action
     * of running forward
     */
    @Override
    public void execute() {
      player.runForward();
    }
  }
  
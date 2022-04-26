/**
 * Executes Quit Command
 * @author JavaFine
 */
public class QuitCommand implements Command {
    private Player player;

    /**
     * Initializes player
     * @param player
     */
    public QuitCommand(Player player) {
        this.player = player;
    }

    /**
     * Executes the quit command
     */
    @Override
    public void execute() {
        player.quit();
    }
}

package command_managers;

public interface CommandInterface {
    /**
     * Executes a command.
     */
    void execute();

    void setArgument(String argument);

    String getName();

    String getDescription();
}

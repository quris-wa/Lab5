package command_managers;

public abstract class Command implements CommandInterface {
    String name;
    String description;

    /**
     * Executes a command.
     */
    public abstract void execute();

    public void setArgument(String argument) {
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

package command_managers;

public abstract class Command implements CommandInterface {
    String name;
    String description;

    public abstract void execute() throws Exception;

    public void setArgument(String argument) {
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

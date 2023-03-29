package commandManagers;

public abstract class Command implements CommandInterface {
    private String name;
    private String description;

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

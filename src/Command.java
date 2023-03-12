public abstract class Command implements CommandInterface {
    public String name;
    public abstract void execute();
}

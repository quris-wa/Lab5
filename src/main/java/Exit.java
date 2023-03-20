public class Exit extends Command {
    @Override
    public void execute() {
        UserManager.isWorking = false;
        System.out.println("Завершение программы.");
    }
}

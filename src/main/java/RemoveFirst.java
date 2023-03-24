public class RemoveFirst extends Command {
    @Override
    public void execute() {
        if (PersonHelper.getCollection().size() == 0) {
            System.out.println("Коллекция пустая");
        } else {
            PersonHelper.getCollection().remove(PersonHelper.getCollection().element());
            System.out.println("Первый человек в коллекции был удален!");
        }
    }
}

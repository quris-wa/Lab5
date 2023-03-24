package commands;
import commandManagers.*;
import personManagers.*;

public class RemoveGreater extends Command {
    @Override
    public void execute() {
        if (PersonHelper.getCollection().size() == 0) {
            System.out.println("Коллекция пустая");
        } else {
            try {
                Double currentHeight = Double.parseDouble(argument);
                PersonHelper.getCollection().removeIf(person -> (person.getHeight() > currentHeight));
                System.out.println("Все люди, чей рост больше, чем " + argument + " были удалены");
            } catch (java.util.ConcurrentModificationException e) {
                System.out.println("Удалена вся коллекция");
            }
        }
    }

}

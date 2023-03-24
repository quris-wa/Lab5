import collection.*;

import java.util.*;

public class RemoveGreater extends Command {
    @Override
    public void execute() {
        if (PersonHelper.getCollection().size() == 0) {
            System.out.println("Коллекция пустая");
        } else {
            List<Double> heights = new ArrayList<>();
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

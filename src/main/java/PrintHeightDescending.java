import collection.Person;

import java.util.*;

public class PrintHeightDescending extends Command {
    @Override
    public void execute() {
        List<Double> personsHeights = new ArrayList<>();
        for (Person person : PersonHelper.getCollection()) {
            personsHeights.add(person.getHeight());
        }
        Collections.sort(personsHeights);
        for (int i = 0; i < personsHeights.size(); i++) {
            System.out.print(personsHeights.get(personsHeights.size() - i - 1));
            if (i != personsHeights.size() - 1) System.out.print(", ");
            else System.out.print("\n");
        }
    }
}

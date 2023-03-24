import collection.Person;

import java.util.PriorityQueue;
import java.util.Queue;

public class RemoveFirst extends Command {
    @Override
    public void execute() {
        if (PersonHelper.getCollection().size() == 0) {
            System.out.println("Коллекция пустая");
        } else {
            Queue<Person> persons;
            persons = PersonHelper.getCollection();
            persons.remove(persons.element());
            PersonHelper.changeCollection(persons);
            System.out.println("Первый человек в коллекции был удален!");
        }
    }
}

package commands;

import collection.Person;
import commandManagers.*;
import personManagers.*;

public class Show extends Command {
    @Override
    public void execute() {
        for (Person person : PersonHelper.getCollection()) {
            System.out.println(person.toString());
        }
    }
}

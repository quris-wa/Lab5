import collection.*;

import java.util.*;


public class MaxByBirthday extends Command {
    Date maxBirthday;
    Person chelovek = new Person();

    @Override
    public void execute() {
        maxBirthday = PersonHelper.getCollection().element().getBirthday();
        chelovek = PersonHelper.getCollection().element();
        for (Person person : PersonHelper.getCollection()) {
            if (person.getBirthday().after(maxBirthday)) {
                maxBirthday = person.getBirthday();
                chelovek = person;
            }
        }
        System.out.println(chelovek.toString());

    }
}

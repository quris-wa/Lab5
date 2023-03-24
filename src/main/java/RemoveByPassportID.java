import collection.Person;

import java.util.Queue;

public class RemoveByPassportID extends Command {
    boolean isFound = false;
    Person person = new Person();

    @Override
    public void execute() {
        if (PersonHelper.getCollection().size() == 0) {
            System.out.println("Коллекция пустая");
        } else {
            String findId = argument;
            for (Person chelovek : PersonHelper.getCollection()) {
                String passportID = chelovek.getPassportID();
                if (findId.equals(passportID)) {
                    person = chelovek;
                    isFound = true;
                }
            }
            if (!isFound) {
                System.out.println("Такого passport ID не существует!");
            } else {
                PersonHelper.getCollection().remove(person);
                System.out.println("Человек с passport ID " + findId + " был удален");

            }
        }
    }
}

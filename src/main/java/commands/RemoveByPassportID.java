package commands;

import collection.Person;
import command_managers.*;
import person_managers.*;
import user_managers.UserManager;

/**
 * Command to remove person from the collection by passport ID.
 */
public class RemoveByPassportID extends Command {
    private boolean isFound = false;
    private Person person = new Person();

    /**
     * Removes person from the collection by passport ID and checks if it is possible.
     */
    @Override
    public void execute() {
        if (PersonHelper.getCollection().size() == 0) {
            System.out.println("Коллекция пустая");
        } else {
            String findId = UserManager.getCommandArgument();
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

    @Override
    public String getName() {
        return "remove_any_by_passport_i_d";
    }

    @Override
    public String getDescription() {
        return ": удалить из коллекции один элемент, значение поля passportID которого эквивалентно заданному";
    }
}

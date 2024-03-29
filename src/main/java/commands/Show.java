package commands;

import collection.Person;
import command_managers.*;
import person_managers.*;
import user_managers.UserManager;

/**
 * Command to print the collection.
 */
public class Show extends Command {
    /**
     * Prints the collection if command argument is not exist.
     */
    @Override
    public void execute() {
        if (UserManager.getIsCommandArgument()) {
            System.out.println("У команды не должно быть аргумента!");
        } else {
            if (PersonHelper.getCollection().size() == 0) {
                System.out.println("Коллекция пустая!");
            } else {
                for (Person person : PersonHelper.getCollection()) {
                    System.out.println(person.toString());
                }
            }
        }
    }

    @Override
    public String getName() {
        return "show";
    }

    @Override
    public String getDescription() {
        return ": вывести в стандартный поток вывода все элементы коллекции в строковом представлении";
    }
}

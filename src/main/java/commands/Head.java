package commands;

import command_managers.*;
import person_managers.*;
import user_managers.UserManager;

/**
 * Command to show first person in the collection.
 */
public class Head extends Command {
    /**
     * Prints first person in the collection if command argument is not exist.
     */
    @Override
    public void execute() {
        if (UserManager.getIsCommandArgument()) {
            System.out.println("У команды не должно быть аргумента!");
        } else {
            if (PersonHelper.getCollection().size() == 0) {
                System.out.println("Коллекция пустая");
            } else {
                System.out.println(PersonHelper.getCollection().element().toString());
            }
        }
    }

    @Override
    public String getName() {
        return "head";
    }

    @Override
    public String getDescription() {
        return ": вывести первый элемент из коллекции";
    }
}

package commands;

import command_managers.*;
import person_managers.*;
import user_managers.UserManager;

/**
 * Command to clear the collection.
 */
public class Clear extends Command {
    /**
     * Clears the collection if command argument is not exist.
     */
    @Override
    public void execute() {
        if (UserManager.getIsCommandArgument()) {
            System.out.println("У команды не должно быть аргумента!");
        } else {
            if (PersonHelper.getCollection().size() == 0) {
                System.out.println("Коллекция пустая");
            } else {
                PersonHelper.getCollection().clear();
                System.out.println("Коллекция была очищена.");
            }
        }
    }

    @Override
    public String getName() {
        return "clear";
    }

    @Override
    public String getDescription() {
        return ": очистить коллекцию";
    }
}

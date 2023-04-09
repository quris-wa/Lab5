package commands;

import command_managers.*;
import person_managers.*;
import user_managers.UserManager;
/**
 * Command to show information about the collection.
 */
public class Info extends Command {
    /**
     * Prints information about the collection if command argument is not exist.
     */
    @Override
    public void execute() {
        if (UserManager.getIsCommandArgument()) {
            System.out.println("У команды не должно быть аргумента!");
        } else {
            System.out.println("Тип коллекции: " + PersonHelper.getCollection().getClass().toString());
            System.out.println("Дата инициализации: " + PersonHelper.getCollection().element().getCreationDate());
            System.out.println("Количество элементов: " + PersonHelper.getCollection().size());
        }
    }

    @Override
    public String getName() {
        return "info";
    }

    @Override
    public String getDescription() {
        return ": вывести в стандартный поток вывода информации о коллекции(тип, дата инициализации, количество элементов и т.д.)";
    }
}

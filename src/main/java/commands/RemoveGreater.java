package commands;

import command_managers.*;
import person_managers.*;
import user_managers.UserManager;

import java.util.*;

/**
 * Command to remove all persons from the collection that exceed the specified height.
 */
public class RemoveGreater extends Command {
    /**
     * Removes persons with height greater than argument from the collection and checks if it is possible.
     */
    @Override
    public void execute() {
        if (PersonHelper.getCollection().size() == 0) {
            System.out.println("Коллекция пустая");
        } else {
            try {
                Double currentHeight = Double.parseDouble(UserManager.getCommandArgument());
                PersonHelper.getCollection().removeIf(person -> (person.getHeight() > currentHeight));
                System.out.println("Все люди, чей рост больше, чем " + UserManager.getCommandArgument() + " были удалены");
            } catch (ConcurrentModificationException e) {
                System.out.println("Удалена вся коллекция");
            } catch (NumberFormatException e) {
                System.out.println("Рост должен быть в формате Double!");
            }

        }
    }

    @Override
    public String getName() {
        return "remove_greater";
    }

    @Override
    public String getDescription() {
        return ": удалить все элементы из коллекции, превышающие заданный";
    }
}

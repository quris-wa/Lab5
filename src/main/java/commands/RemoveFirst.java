package commands;

import command_managers.*;
import person_managers.*;
import user_managers.UserManager;

public class RemoveFirst extends Command {
    @Override
    public void execute() {
        if (UserManager.getIsCommandArgument()) {
            System.out.println("У команды не должно быть аргумента!");
        } else {
            if (PersonHelper.getCollection().size() == 0) {
                System.out.println("Коллекция пустая");
            } else {
                PersonHelper.getCollection().remove(PersonHelper.getCollection().element());
                System.out.println("Первый человек в коллекции был удален!");
            }
        }
    }

    @Override
    public String getName() {
        return "remove_first";
    }

    @Override
    public String getDescription() {
        return ": удалить первый элемент из коллекции";
    }
}

package commands;

import collection.Person;
import commandManagers.*;
import personManagers.*;
import userManagers.UserManager;

public class RemoveByID extends Command {
    private boolean isFound = false;
    private Person person = new Person();

    @Override
    public void execute() {
        if (PersonHelper.getCollection().size() == 0) {
            System.out.println("Коллекция пустая");
        } else {
            int findId = Integer.parseInt(UserManager.getCommandArgument());
            for (Person chelovek : PersonHelper.getCollection()) {
                int id = chelovek.getId();
                if (findId == id) {
                    person = chelovek;
                    isFound = true;
                }
            }
            if (!isFound) {
                System.out.println("Такого ID не существует!");
            } else {
                PersonHelper.getCollection().remove(person);
                System.out.println("Человек с ID " + findId + " был удален");
            }
        }
    }

    @Override
    public String getName() {
        return "remove_by_id";
    }

    @Override
    public String getDescription() {
        return ": удалить элемент из коллекции по его id";
    }
}

package commands;

import commandManagers.*;
import personManagers.*;
import userManagers.UserManager;

public class RemoveGreater extends Command {
    @Override
    public void execute() {
        if (PersonHelper.getCollection().size() == 0) {
            System.out.println("Коллекция пустая");
        } else {
            try {
                Double currentHeight = Double.parseDouble(UserManager.getCommandArgument());
                PersonHelper.getCollection().removeIf(person -> (person.getHeight() > currentHeight));
                System.out.println("Все люди, чей рост больше, чем " + UserManager.getCommandArgument() + " были удалены");
            } catch (java.util.ConcurrentModificationException e) {
                System.out.println("Удалена вся коллекция");
            } catch (java.lang.NumberFormatException e) {
                System.out.println("Рост должен быть в формате Double!");
            }

        }
    }
    @Override
    public String getName(){
        return "remove_greater";
    }
}

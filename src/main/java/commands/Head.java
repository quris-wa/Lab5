package commands;

import commandManagers.*;
import personManagers.*;
import userManagers.UserManager;

public class Head extends Command {
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
    public String getName(){
        return "head";
    }
    @Override
    public String getDescription(){
        return ": вывести первый элемент из коллекции";
    }
}

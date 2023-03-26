package commands;

import commandManagers.*;
import personManagers.*;
import userManagers.UserManager;

public class Info extends Command {
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
    public String getName(){
        return "info";
    }
}

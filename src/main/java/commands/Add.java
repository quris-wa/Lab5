package commands;

import collection.*;
import commandManagers.*;
import personManagers.*;
import userManagers.UserManager;


public class Add extends Command {

    @Override
    public void execute() {
        if (UserManager.getIsCommandArgument()) {
            System.out.println("У команды не должно быть аргумента!");
        } else {
            Person person = new Person();
            NameManager.addName(person);
            CoorXManager.addCoorX(person);
            CoorYManager.addCoorY(person);
            HeightManager.addHeight(person);
            BirthdayManager.addBirthday(person);
            PassportIDManager.addPassportID(person);
            EyeColorManager.addEyeColor(person);
            LocXManager.addLocX(person);
            if (LocXManager.getIsXAdded()) {
                LocYManager.addLocY(person);
                LocZManager.addLocZ(person);
            }
            LocNameManager.addLocName(person);
            PersonHelper.getCollection().add(person);
            System.out.println("Человек добавлен в коллекцию!");
        }
    }

    @Override
    public String getName() {
        return "add";
    }

    @Override
    public String getDescription() {
        return ": добавить новый элемент в коллекцию";
    }
}

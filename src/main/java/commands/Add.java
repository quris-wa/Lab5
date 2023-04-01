package commands;

import collection.*;
import commandManagers.*;
import personManagers.*;
import userManagers.UserManager;

import java.util.Scanner;

public class Add extends Command {
    String[] personParametrs = new String[12];

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
            LocYManager.addLocY(person);
            if (!(person.getLocation().getX() == null)) {
                LocYManager.addLocY(person);
                LocZManager.addLocZ(person);
                LocNameManager.addLocName(person);
            }
            PersonHelper.getCollection().add(person);
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

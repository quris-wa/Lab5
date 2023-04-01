package commands;

import collection.*;
import command_managers.*;
import person_managers.*;
import user_managers.UserManager;


public class Add extends Command {
    String[] personParameters = new String[12];
    @Override
    public void execute() {
        if (UserManager.getIsCommandArgument()) {
            System.out.println("У команды не должно быть аргумента!");
        } else {
            personParameters[0] = NameManager.readName();
            personParameters[1] = CoorXManager.readCoorX();
            personParameters[2] = CoorYManager.readCoorY();
            personParameters[3] = HeightManager.readHeight();
            personParameters[4] = BirthdayManager.readBirthday();
            personParameters[5] = PassportIDManager.readPassportID();
            personParameters[6] = EyeColorManager.readEyeColor();
            personParameters[7] = LocXManager.readLocX();
            if (LocXManager.getIsXAdded()) {
                personParameters[8] = LocYManager.readLocY();
                personParameters[9] = LocZManager.readLocZ();
                personParameters[10] = LocNameReader.readLocName();
            } else {
                for (int i = 8; i <= 10; i++) personParameters[i] = "";
            }
            Person chelovek = new Person(personParameters);
            PersonHelper.getCollection().add(chelovek);
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

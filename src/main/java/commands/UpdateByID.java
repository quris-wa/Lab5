package commands;

import collection.Person;
import command_managers.*;
import person_managers.*;
import user_managers.UserManager;

public class UpdateByID extends Command {

    @Override
    public void execute() {
        try {
            Person person = new Person();
            boolean isFound = false;
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
                String namePerson = NameManager.readNameForUpdate();
                if (namePerson != null) person.setName(namePerson);

                String xStr = CoorXManager.readCoorXForUpdate();
                if (!xStr.equals("")) person.setX(xStr);

                String yStr = CoorYManager.readCoorYForUpdate();
                if (!yStr.equals("")) person.setY(yStr);

                String heightStr = HeightManager.readHeightForUpdate();
                if (!heightStr.equals("")) person.setHeight(heightStr);

                String birthday = BirthdayManager.readBirthdayForUpdate();
                if (!birthday.equals("")) person.setBirthday(birthday);

                String passportID = PassportIDManager.readPassportIDForUpdate();
                if (!passportID.equals("")) person.setPassportID(passportID);

                String eyeColor = EyeColorManager.readEyeColorForUpdate();
                if (!eyeColor.equals("")) person.setEyeColor(eyeColor);

                String xLocStr = LocXManager.readLocXForUpdate();
                if (!xLocStr.equals("")) person.setLocX(xLocStr);

                String yLocStr = LocYManager.readLocYForUpdate();
                if (!yLocStr.equals("")) person.setLocY(yLocStr);

                String zLocStr = LocZManager.readLocZForUpdate();
                if (!zLocStr.equals("")) person.setLocZ(zLocStr);

                String nameLoc = LocNameReader.readLocName();
                if (!nameLoc.equals("")) person.setLocName(nameLoc);

                System.out.println("Значения данных человека с ID " + findId + " были обновлены");
            }
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат ID!");
        }
    }


    @Override
    public String getName() {
        return "update";
    }

    @Override
    public String getDescription() {
        return ": обновить значение элемента коллекции, id которого равен заданному";
    }
}

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
                NameManager.updateName(person);
                CoorXManager.updateCoorX(person);
                CoorYManager.updateCoorY(person);
                HeightManager.updateHeight(person);
                BirthdayManager.updateBirthday(person);
                PassportIDManager.updatePassportID(person);
                EyeColorManager.updateEyeColor(person);
                LocXManager.updateLocX(person);
                LocYManager.updateLocY(person);
                LocZManager.updateLocZ(person);
                LocNameManager.updateLocName(person);
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

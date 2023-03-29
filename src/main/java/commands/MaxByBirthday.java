package commands;

import collection.*;
import commandManagers.*;
import personManagers.*;
import userManagers.UserManager;

import java.util.*;


public class MaxByBirthday extends Command {

    @Override
    public void execute() {
        if (UserManager.getIsCommandArgument()) {
            System.out.println("У команды не должно быть аргумента!");
        } else {
            Date maxBirthday = PersonHelper.getCollection().element().getBirthday();
            Person chelovek = PersonHelper.getCollection().element();
            for (Person person : PersonHelper.getCollection()) {
                if (person.getBirthday().after(maxBirthday)) {
                    maxBirthday = person.getBirthday();
                    chelovek = person;
                }
            }
            System.out.println(chelovek.toString());
        }

    }

    @Override
    public String getName() {
        return "max_by_birthday";
    }

    @Override
    public String getDescription() {
        return ": вывести любой объект из коллекции,значение поля birthday которого является максимальным";
    }
}

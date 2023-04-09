package commands;

import collection.*;
import command_managers.*;
import person_managers.*;
import user_managers.UserManager;

import java.time.LocalDateTime;
import java.util.*;

/**
 * Command to show person with max birthday from collection .
 */
public class MaxByBirthday extends Command {
    /**
     * Prints person with max birthday if command argument is not exist.
     */
    @Override
    public void execute() {
        if (UserManager.getIsCommandArgument()) {
            System.out.println("У команды не должно быть аргумента!");
        } else {
            LocalDateTime maxBirthday = PersonHelper.getCollection().element().getBirthday();
            Person chelovek = PersonHelper.getCollection().element();
            for (Person person : PersonHelper.getCollection()) {
                if (person.getBirthday().isAfter(maxBirthday)) {
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

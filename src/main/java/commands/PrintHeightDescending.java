package commands;

import collection.Person;
import command_managers.*;
import person_managers.*;
import user_managers.UserManager;

import java.util.*;

/**
 * Command to print the collection in descending order of height.
 */
public class PrintHeightDescending extends Command {
    /**
     * Prints the collection in descending order of height if command argument is not exist.
     */
    @Override
    public void execute() {
        if (UserManager.getIsCommandArgument()) {
            System.out.println("У команды не должно быть аргумента!");
        } else {
            List<Double> personsHeights = new ArrayList<>();
            for (Person person : PersonHelper.getCollection()) {
                personsHeights.add(person.getHeight());
            }
            Collections.sort(personsHeights);
            for (int i = 0; i < personsHeights.size(); i++) {
                System.out.print(personsHeights.get(personsHeights.size() - i - 1));
                if (i != personsHeights.size() - 1) System.out.print(", ");
                else System.out.print("\n");
            }
        }
    }

    @Override
    public String getName() {
        return "print_field_descending_height";
    }

    @Override
    public String getDescription() {
        return ": вывести значения поля height всех элементов в порядке убывания";
    }
}

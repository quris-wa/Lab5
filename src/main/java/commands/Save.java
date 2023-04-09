package commands;

import collection.Person;
import command_managers.*;
import person_managers.*;
import user_managers.UserManager;

import java.io.*;

/**
 * Command to save collection to the file.
 */
public class Save extends Command {
    /**
     * Saves the collection to file if command argument is not exist.
     */
    @Override
    public void execute() {
        if (UserManager.getIsCommandArgument()) {
            System.out.println("У команды не должно быть аргумента!");
        } else {
            try (FileOutputStream out = new FileOutputStream("Saved_data.txt")) {
                BufferedOutputStream bos = new BufferedOutputStream(out);
                for (Person person : PersonHelper.getCollection()) {
                    String personStr = person.toString();
                    byte[] buffer = personStr.getBytes();
                    bos.write(buffer, 0, buffer.length);
                    bos.write('\n');
                    bos.flush();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Коллекция сохранена в файл Saved_data.txt");
        }
    }

    @Override
    public String getName() {
        return "save";
    }

    @Override
    public String getDescription() {
        return ": сохранить коллекцию в файл";
    }
}

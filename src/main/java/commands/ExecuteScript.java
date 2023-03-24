package commands;

import java.util.*;
import java.io.*;
import collection.*;
import commandManagers.*;
import userManagers.*;

public class ExecuteScript extends Command {
    HashMap<String, Command> commandList = CommandHelper.getCommandMap();

    @Override
    public void execute() throws Exception {
        try {
            String argument = UserManager.argument;
            FileReader reader = new FileReader(argument);
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {
                String commandLine = scanner.nextLine().trim();
                String[] input = commandLine.split(" ");
                while (input.length == 0 || input.length > 2) {
                    commandLine = scanner.nextLine().trim();
                    input = commandLine.split(" ");
                }
                String command = input[0];
                if (input.length == 2) {
                    argument = input[1];
                    commandList.get(command).setArgument(argument);
                }
                commandList.get(command).execute();
            }
        }
        catch (java.io.FileNotFoundException e){
            System.out.println("Файл с названием " + argument + " не найден");
        }
    }
}

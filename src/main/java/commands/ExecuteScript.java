package commands;

import java.util.*;
import java.io.*;
import commandManagers.*;
import userManagers.*;

public class ExecuteScript extends Command {
    String commandArgument;
    @Override
    public void execute() throws Exception {
        try {
            if (CommandHelper.getSkriptsPath().contains(UserManager.getCommandArgument()) && getName().equals("execute_script")) {
                System.out.println("Обнаружена рекурсия!");
                CommandHelper.getSkriptsPath().clear();
            } else {
                CommandHelper.getSkriptsPath().add(UserManager.getCommandArgument());
                FileReader reader = new FileReader(UserManager.getCommandArgument());
                Scanner scanner = new Scanner(reader);
                while (scanner.hasNextLine()) {
                    String commandLine = scanner.nextLine().trim();
                    String[] input = commandLine.split(" ");
                    while (input.length == 0 || input.length > 2) {
                        commandLine = scanner.nextLine().trim();
                        input = commandLine.split(" ");
                    }
                    String command = input[0];
                    UserManager.setIsCommandArgument(false);
                    if (input.length == 2) {
                        commandArgument = input[1];
                        UserManager.setIsCommandArgument(true);
                        UserManager.setCommandArgument(commandArgument);
                        CommandHelper.getCommands().get(command).setArgument(commandArgument);
                    }
                    CommandHelper.getCommands().get(command).execute();
                }
                System.out.println("Скрипт " + UserManager.getCommandArgument() + " выполнен");
            }
        }
        catch (java.io.FileNotFoundException e){
            System.out.println("Файл с названием " + UserManager.getCommandArgument() + " не найден");
        }
    }
    @Override
    public String getName(){
        return "execute_script";
    }
}

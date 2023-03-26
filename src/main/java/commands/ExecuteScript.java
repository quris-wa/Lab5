package commands;

import java.util.*;
import java.io.*;
import commandManagers.*;
import userManagers.*;

public class ExecuteScript extends Command {
    @Override
    public void execute() throws Exception {
        try {
            if (CommandHelper.getSkriptsPath().contains(UserManager.getCommandArgument()) && getName().equals("execute_script")) {
                System.out.println("Обнаружена рекурсия! Выполнение остановлено");
                CommandHelper.getSkriptsPath().clear();
            } else {
                CommandHelper.getSkriptsPath().add(UserManager.getCommandArgument());

                String argument = UserManager.getCommandArgument();
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
                    UserManager.setIsCommandArgument(false);
                    if (input.length == 2) {
                        argument = input[1];
                        UserManager.setIsCommandArgument(true);
                        CommandHelper.getCommands().get(command).setArgument(argument);
                    }
                    CommandHelper.getCommands().get(command).execute();
                }
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

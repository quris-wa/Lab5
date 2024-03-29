package commands;

import java.util.*;
import java.io.*;

import command_managers.*;
import user_managers.*;

/**
 * Command to execute script from file.
 */
public class ExecuteScript extends Command {
    String commandArgument;

    /**
     * Runs the script and stops the recursion if it finds it.
     */
    @Override
    public void execute() {
        try {
            Deque<String> scriptsPathCopy;
            if (CommandHelper.getScriptsPath().contains(UserManager.getCommandArgument()) && getName().equals("execute_script")) {
                System.out.println("Обнаружена рекурсия!");
                scriptsPathCopy = new ArrayDeque<>(CommandHelper.getScriptsPath());
                CommandHelper.getScriptsPath().clear();
            } else {
                FileReader reader = new FileReader(UserManager.getCommandArgument());
                Scanner scanner = new Scanner(reader);
                CommandHelper.getScriptsPath().addLast(UserManager.getCommandArgument());
                scriptsPathCopy = new ArrayDeque<>(CommandHelper.getScriptsPath());
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
                System.out.println("Скрипт " + scriptsPathCopy.pollLast() + " выполнен");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл с названием " + UserManager.getCommandArgument() + " не найден");
        }
    }

    @Override
    public String getName() {
        return "execute_script";
    }

    @Override
    public String getDescription() {
        return ": cчитать и исполнить скрипт из указанного файла. " +
                "В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме";
    }
}

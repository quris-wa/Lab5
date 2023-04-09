package user_managers;

import command_managers.Command;
import command_managers.CommandHelper;

import java.util.HashMap;
import java.util.*;

/**
 * UserManager is a class that is used to enter commands.
 */
public class UserManager {
    private static String commandArgument;
    private static boolean isWorking = true;
    static boolean isCommandArgument = false;

    /**
     * Scans command and execute it if it is possible.
     */
    public static void scanCommand() {
        HashMap<String, Command> commandList;
        commandList = CommandHelper.getCommands();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите команду: ");
        String commandLine = scanner.nextLine().trim();
        String[] input = commandLine.split(" ");
        while (input.length == 0 || input.length > 2) {
            System.out.println("Неверный формат ввода команды!");
            System.out.println("Введите команду: ");
            commandLine = scanner.nextLine().trim();
            input = commandLine.split(" ");
        }
        String command = input[0];
        isCommandArgument = false;
        if (input.length == 2) {
            commandArgument = input[1].trim();
            isCommandArgument = true;
            commandList.get(command).setArgument(commandArgument);
        }
        try {
            commandList.get(command).execute();
        } catch (NullPointerException e) {
            System.out.println("Такой команды нет!");
        }
    }

    public static String getCommandArgument() {
        return commandArgument;
    }

    public static boolean getIsCommandArgument() {
        return isCommandArgument;
    }

    public static void setCommandArgument(String newCommandArgument) {
        commandArgument = newCommandArgument;
    }

    public static boolean getIsWorking() {
        return isWorking;
    }

    public static void setIsWorking(boolean status) {
        isWorking = status;
    }

    public static void setIsCommandArgument(boolean status) {
        isCommandArgument = status;
    }
}

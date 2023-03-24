package userManagers;

import commandManagers.Command;
import commandManagers.CommandHelper;

import java.util.HashMap;
import java.util.*;

public class UserManager {
    public static String argument;
    public static boolean isWorking = true;

    public static void scanCommand() throws Exception {
        HashMap<String, Command> commandList;
        commandList = CommandHelper.getCommandMap();
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
        if (input.length == 2) {
            argument = input[1];
            commandList.get(command).setArgument(argument);
        }
        try {
            commandList.get(command).execute();
        } catch (NullPointerException e) {
            System.out.println("Такой команды нет!");
        }
    }


}

import collection.Person;

import java.io.*;
import java.util.HashMap;
import java.util.*;

public class UserManager{
    static String argument;

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
        commandList.get(command).execute();

    }


}

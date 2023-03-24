import java.util.*;
import java.io.*;

public class ExecuteScript extends Command {
    HashMap<String, Command> commandList = CommandHelper.getCommandMap();

    @Override
    public void execute() throws Exception {
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
}

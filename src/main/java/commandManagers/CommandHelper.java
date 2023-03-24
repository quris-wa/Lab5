package commandManagers;

import commandManagers.Command;
import commands.*;

import java.util.HashMap;

public class CommandHelper {
    static private final HashMap<String, Command> commands = new HashMap<>();

    static {
        commands.put("help", new Help());
        commands.put("info", new Info());
        commands.put("show", new Show());
        commands.put("add", new Add());
        commands.put("update", new UpdateByID());
        commands.put("remove", new RemoveByID());
        commands.put("clear", new Clear());
        commands.put("save", new Save());
        commands.put("execute_script", new ExecuteScript());
        commands.put("exit", new Exit());
        commands.put("remove_first", new RemoveFirst());
        commands.put("head", new Head());
        commands.put("remove_greater", new RemoveGreater());
        commands.put("remove_any_by_passport_i_d", new RemoveByPassportID());
        commands.put("max_by_birthday", new MaxByBirthday());
        commands.put("print_field_descending_height", new PrintHeightDescending());
    }

    public static HashMap<String, Command> getCommandMap() {
        return commands;
    }
}

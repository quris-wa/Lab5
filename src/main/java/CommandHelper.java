
import java.util.HashMap;

public class CommandHelper {
    static private HashMap<String, Command> commandList = new HashMap<>();
    static {
        commandList.put("help", new Help());
        commandList.put("info", new Info());
        commandList.put("show", new Show());
        commandList.put("add", new Add());
        commandList.put("update_id", new UpdateID());
        commandList.put("remove_by_id", new RemoveByID());
        commandList.put("clear", new Clear());
        commandList.put("save", new Save());
        commandList.put("execute_script", new ExecuteScript());
        commandList.put("exit", new Exit());
        commandList.put("remove_first", new RemoveFirst());
        commandList.put("head", new Head());
        commandList.put("remove_greater", new RemoveGreater());
        commandList.put("remove_any_by_passport_i_d", new RemoveByPassportID());
        commandList.put("max_by_birthday", new MaxByBirthday());
        commandList.put("print_field_descending_height", new PrintHeightDescending());
    }
    public static HashMap<String, Command> getCommandMap() {
        return commandList;
    }
}

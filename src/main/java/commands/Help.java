package commands;

import command_managers.*;
import user_managers.UserManager;

import java.util.HashMap;
import java.util.Map;

public class Help extends Command {
    @Override
    public void execute() {
        HashMap<String, Command> commandList = CommandHelper.getCommands();
        if (UserManager.getIsCommandArgument()) {
            System.out.println("У команды не должно быть аргумента!");
        } else {
            for (Map.Entry<String, Command> set : commandList.entrySet()) {
                System.out.println(set.getKey() + " " + set.getValue().getDescription());
            }
        }
    }

    @Override
    public String getName() {
        return "help";
    }

    @Override
    public String getDescription() {
        return ": вывести справку по доступным командам";
    }
}

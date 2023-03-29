package commands;

import commandManagers.*;
import userManagers.*;

public class Exit extends Command {
    @Override
    public void execute() {
        if (UserManager.getIsCommandArgument()) {
            System.out.println("У команды не должно быть аргумента!");
        } else {
            UserManager.setIsWorking(false);
            System.out.println("Завершение программы.");
        }
    }

    @Override
    public String getName() {
        return "exit";
    }

    @Override
    public String getDescription() {
        return ": завершить программу (без сохранения в файл)";
    }
}

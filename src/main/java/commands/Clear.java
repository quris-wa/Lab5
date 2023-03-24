package commands;

import collection.*;
import commandManagers.*;
import personManagers.*;

public class Clear extends Command {
    @Override
    public void execute() {
        if (PersonHelper.getCollection().size() == 0) {
            System.out.println("Коллекция пустая");
        } else {
            PersonHelper.getCollection().clear();
            System.out.println("Коллекция была очищена.");
        }
    }
}

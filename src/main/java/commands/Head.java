package commands;

import commandManagers.*;
import personManagers.*;

public class Head extends Command {
    @Override
    public void execute() {
        if (PersonHelper.getCollection().size() == 0) {
            System.out.println("Коллекция пустая");
        } else {
            System.out.println(PersonHelper.getCollection().element().toString());
        }
    }
}

import collection.Person;
import personManagers.PersonHelper;
import userManagers.UserManager;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("Data.csv");
        Scanner scan = new Scanner(reader);
        String[] str;
        String S;

        while (scan.hasNextLine()) {
            S = scan.nextLine();
            str = S.split(",");
            Person chelovek = new Person(str);
            PersonHelper.getCollection().add(chelovek);
        }
        while (UserManager.getIsWorking()) {
            UserManager.scanCommand();
        }
    }

}
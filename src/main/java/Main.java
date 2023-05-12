import collection.Person;
import person_managers.PersonHelper;
import user_managers.UserManager;

import java.io.*;
import java.util.*;

/**
 * Main is class for reading collection from file.
 */
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
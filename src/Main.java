import collection.Person;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("/Users/aebuir/IdeaProjects/Lab5/src/Data.csv");
        Scanner scan = new Scanner(reader);
        String[] str = new String[1001];
        String S;
        Queue<Person> persons = new java.util.PriorityQueue<Person>();

        while (scan.hasNextLine()) {
            S = scan.nextLine();
            str = S.split(",");
            Person chelovek = new Person(str);
            persons.add(chelovek);

        }
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        scanner.close();
    }
}
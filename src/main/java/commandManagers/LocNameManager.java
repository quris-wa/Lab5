package commandManagers;

import collection.Person;

import java.util.Scanner;

public class LocNameManager {
    public static void addLocName(Person person) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя локации: ");
        String nameLoc = scanner.nextLine();
        person.setLocName(nameLoc);
    }

    public static void updateLocName(Person person) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя локации: ");
        String nameLoc = scanner.nextLine();
        if (!nameLoc.equals("")) person.setLocName(nameLoc);
    }
}

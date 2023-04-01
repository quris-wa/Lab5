package commandManagers;

import collection.Person;

import java.util.Scanner;

public class NameManager {
    public static void addName(Person person) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String namePerson = scanner.nextLine();
        while (!CheckCommand.checkName(namePerson)) {
            System.out.println("Введите имя: ");
            namePerson = scanner.nextLine();
        }
        person.setName(namePerson);
    }

    public static void updateName(Person person) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String namePerson = scanner.nextLine();
        if (namePerson != null) person.setName(namePerson);
    }
}

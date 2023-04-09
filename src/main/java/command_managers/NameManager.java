package command_managers;

import java.util.Scanner;

/**
 * NameManager is a class for reading names.
 */
public class NameManager {
    public static String readName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String namePerson = scanner.nextLine();
        while (!CheckCommand.checkName(namePerson)) {
            System.out.println("Введите имя: ");
            namePerson = scanner.nextLine();
        }
        return namePerson;
    }

    public static String readNameForUpdate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        return scanner.nextLine();
    }
}

package command_managers;

import java.util.Scanner;

/**
 * LocNameManager is a class for reading name of location.
 */
public class LocNameManager {
    public static String readLocName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя локации: ");
        return scanner.nextLine();
    }
}

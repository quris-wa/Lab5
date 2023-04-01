package commandManagers;

import collection.Person;

import java.util.Scanner;

public class LocYManager {
    public static void addLocY(Person person) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату Y локации:");
        String yLocStr = scanner.nextLine();
        while (!CheckCommand.checkValueLocY(yLocStr)) {
            System.out.println("Введите координату Y локации:");
            yLocStr = scanner.nextLine();
        }
        person.setLocY(yLocStr);
    }

    public static void updateLocY(Person person) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату Y локации:");
        String yLocStr = scanner.nextLine();
        while (!yLocStr.equals("") && !CheckCommand.checkValueLocY(yLocStr)) {
            System.out.println("Введите координату Y локации:");
            yLocStr = scanner.nextLine();
        }
        if (!yLocStr.equals("")) person.setLocY(yLocStr);
    }
}

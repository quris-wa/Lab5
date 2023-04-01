package commandManagers;

import collection.Person;

import java.util.Scanner;

public class LocZManager {
    public static void addLocZ(Person person) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату Z локации:");
        String zLocStr = scanner.nextLine();
        while (!CheckCommand.checkValueLocZ(zLocStr)) {
            System.out.println("Введите координату Z локации:");
            zLocStr = scanner.nextLine();
        }
        person.setLocZ(zLocStr);
    }

    public static void updateLocZ(Person person) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату Z локации:");
        String zLocStr = scanner.nextLine();
        while (!zLocStr.equals("") && !CheckCommand.checkValueLocZ(zLocStr)) {
            System.out.println("Введите координату Z локации:");
            zLocStr = scanner.nextLine();
        }
        if (!zLocStr.equals("")) person.setLocZ(zLocStr);
    }
}

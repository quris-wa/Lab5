package command_managers;

import collection.Person;

import java.util.Scanner;

public class LocZManager {
    public static String readLocZ() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату Z локации:");
        String zLocStr = scanner.nextLine();
        while (CheckCommand.checkValueLocZ(zLocStr)) {
            System.out.println("Введите координату Z локации:");
            zLocStr = scanner.nextLine();
        }
        return zLocStr;
    }

    public static String readLocZForUpdate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату Z локации:");
        String zLocStr = scanner.nextLine();
        while (!zLocStr.equals("") && CheckCommand.checkValueLocZ(zLocStr)) {
            System.out.println("Введите координату Z локации:");
            zLocStr = scanner.nextLine();
        }
        return zLocStr;
    }
}

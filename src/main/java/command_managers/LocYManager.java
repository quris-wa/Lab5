package command_managers;

import collection.Person;

import java.util.Scanner;

public class LocYManager {
    public static String readLocY() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату Y локации:");
        String yLocStr = scanner.nextLine();
        while (CheckCommand.checkValueLocY(yLocStr)) {
            System.out.println("Введите координату Y локации:");
            yLocStr = scanner.nextLine();
        }
        return yLocStr;
    }

    public static String readLocYForUpdate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату Y локации:");
        String yLocStr = scanner.nextLine();
        while (!yLocStr.equals("") && CheckCommand.checkValueLocY(yLocStr)) {
            System.out.println("Введите координату Y локации:");
            yLocStr = scanner.nextLine();
        }
        return yLocStr;
    }
}

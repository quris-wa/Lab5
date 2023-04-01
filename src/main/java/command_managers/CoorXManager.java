package command_managers;

import collection.Person;

import java.util.Scanner;

public class CoorXManager {
    public static String readCoorX() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату X в типе данных Double(больше -866): ");
        String xStr = scanner.nextLine();
        while (CheckCommand.checkValueX(xStr)) {
            System.out.println("Введите координату X в типе данных Double(больше -866): ");
            xStr = scanner.nextLine();
        }
        return xStr;
    }

    public static String readCoorXForUpdate() {
        System.out.println("Введите координату X в типе данных Double(больше -866): ");
        Scanner scanner = new Scanner(System.in);
        String xStr = scanner.nextLine();
        while (!xStr.equals("") && CheckCommand.checkValueX(xStr)) {
            System.out.println("Введите координату X в типе данных Double(больше -866): ");
            xStr = scanner.nextLine();
        }
        return xStr;
    }
}

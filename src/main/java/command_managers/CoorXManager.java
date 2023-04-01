package command_managers;

import collection.Person;

import java.util.Scanner;

public class CoorXManager {
    public static void addCoorX(Person person) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату X в типе данных Double(больше -866): ");
        String xStr = scanner.nextLine();
        while (CheckCommand.checkValueX(xStr)) {
            System.out.println("Введите координату X в типе данных Double(больше -866): ");
            xStr = scanner.nextLine();
        }
        person.setX(xStr);
    }

    public static void updateCoorX(Person person) {
        System.out.println("Введите координату X в типе данных Double(больше -866): ");
        Scanner scanner = new Scanner(System.in);
        String xStr = scanner.nextLine();
        while (!xStr.equals("") && CheckCommand.checkValueX(xStr)) {
            System.out.println("Введите координату X в типе данных Double(больше -866): ");
            xStr = scanner.nextLine();
        }
        if (!xStr.equals("")) person.setX(xStr);
    }
}

package command_managers;

import collection.Person;

import java.util.Scanner;

public class CoorYManager {
    public static void addCoorY(Person person) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату Y в типе данных Integer(больше -512): ");
        String yStr = scanner.nextLine();
        while (!CheckCommand.checkValueY(yStr)) {
            System.out.println("Введите координату Y в типе данных Integer(больше -512): ");
            yStr = scanner.nextLine();
        }
        person.setY(yStr);
    }

    public static void updateCoorY(Person person) {
        System.out.println("Введите координату Y в типе данных Integer(больше -512): ");
        Scanner scanner = new Scanner(System.in);
        String yStr = scanner.nextLine();
        while (!yStr.equals("") && !CheckCommand.checkValueY(yStr)) {
            System.out.println("Введите координату Y в типе данных Integer(больше -512): ");
            yStr = scanner.nextLine();
        }
        if (!yStr.equals("")) person.setY(yStr);
    }
}

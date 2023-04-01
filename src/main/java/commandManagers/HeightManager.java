package commandManagers;

import collection.Person;

import java.util.Scanner;

public class HeightManager {
    public static void addHeight(Person person) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите рост в см: ");
        String heightStr = scanner.nextLine();
        while (!CheckCommand.checkValueHeight(heightStr)) {
            System.out.println("Введите рост в см(больше 0): ");
            heightStr = scanner.nextLine();
        }
        person.setHeight(heightStr);
    }

    public static void updateHeight(Person person) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите рост в см(больше 0): ");
        String heightStr = scanner.nextLine();
        while (!heightStr.equals("") && !CheckCommand.checkValueHeight(heightStr)) {
            System.out.println("Введите рост в см(больше 0): ");
            heightStr = scanner.nextLine();
        }
        if (!heightStr.equals("")) person.setHeight(heightStr);
    }
}

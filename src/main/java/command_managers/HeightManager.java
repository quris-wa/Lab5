package command_managers;

import java.util.Scanner;

/**
 * HeightManager is a class for reading height.
 */
public class HeightManager {
    public static String readHeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите рост в см: ");
        String heightStr = scanner.nextLine();
        while (CheckCommand.checkValueHeight(heightStr)) {
            System.out.println("Введите рост в см(больше 0): ");
            heightStr = scanner.nextLine();
        }
        return heightStr;
    }

    public static String readHeightForUpdate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите рост в см(больше 0): ");
        String heightStr = scanner.nextLine();
        while (!heightStr.equals("") && CheckCommand.checkValueHeight(heightStr)) {
            System.out.println("Введите рост в см(больше 0): ");
            heightStr = scanner.nextLine();
        }
        return heightStr;
    }
}

package command_managers;

import java.util.Scanner;

/**
 * EyeColorManager is a class for reading eye color.
 */
public class EyeColorManager {
    public static String readEyeColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цвет глаз(BLACK, YELLOW, ORANGE): ");
        String eyeColor = scanner.nextLine();
        while (CheckCommand.checkEyeColor(eyeColor)) {
            System.out.println("Введите цвет глаз(BLACK, YELLOW, ORANGE): ");
            eyeColor = scanner.nextLine();
        }
        return eyeColor;
    }

    public static String readEyeColorForUpdate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цвет глаз(BLACK, YELLOW, ORANGE): ");
        String eyeColor = scanner.nextLine();
        while (!eyeColor.equals("") && CheckCommand.checkEyeColor(eyeColor)) {
            System.out.println("Введите цвет глаз(BLACK, YELLOW, ORANGE): ");
            eyeColor = scanner.nextLine();
        }
        return eyeColor;
    }
}

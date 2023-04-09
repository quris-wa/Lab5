package command_managers;

import java.util.Scanner;

/**
 * LocXManager is a class for reading X coordinates of location.
 */
public class LocXManager {
    static boolean isXAdded = false;

    public static String readLocX() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату X локации:");
        String xLocStr = scanner.nextLine();
        while (CheckCommand.checkValueLocX(xLocStr)) {
            System.out.println("Введите координату X локации:");
            xLocStr = scanner.nextLine();
        }
        if (!xLocStr.equals("")) {
            isXAdded = true;
        }
        return xLocStr;
    }

    public static String readLocXForUpdate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату X локации:");
        String xLocStr = scanner.nextLine();
        while (!xLocStr.equals("") && CheckCommand.checkValueLocX(xLocStr)) {
            System.out.println("Введите координату X локации:");
            xLocStr = scanner.nextLine();
        }
        return xLocStr;
    }

    public static boolean getIsXAdded() {
        return isXAdded;
    }
}

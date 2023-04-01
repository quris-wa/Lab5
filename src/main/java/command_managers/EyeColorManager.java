package command_managers;

import collection.Person;

import java.util.Scanner;

public class EyeColorManager {
    public static void addEyeColor(Person person) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цвет глаз(BLACK, YELLOW, ORANGE): ");
        String eyeColor = scanner.nextLine();
        while (!CheckCommand.checkEyeColor(eyeColor)) {
            System.out.println("Введите цвет глаз(BLACK, YELLOW, ORANGE): ");
            eyeColor = scanner.nextLine();
        }
        if(!eyeColor.equals(""))person.setEyeColor(eyeColor);
    }

    public static void updateEyeColor(Person person) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цвет глаз(BLACK, YELLOW, ORANGE): ");
        String eyeColor = scanner.nextLine();
        while (!eyeColor.equals("") && !CheckCommand.checkEyeColor(eyeColor)) {
            System.out.println("Введите цвет глаз(BLACK, YELLOW, ORANGE): ");
            eyeColor = scanner.nextLine();
        }
        if (!eyeColor.equals("")) person.setEyeColor(eyeColor);
    }
}

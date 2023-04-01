package command_managers;

import collection.Person;

import java.util.Scanner;

public class BirthdayManager {
    public static String readBirthday() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату рождения: ");
        String birthday = scanner.nextLine();
        while (CheckCommand.checkDate(birthday)) {
            System.out.println("Введите дату рождения: ");
            birthday = scanner.nextLine();
        }
        return birthday;
    }

    public static String readBirthdayForUpdate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату рождения: ");
        String birthday = scanner.nextLine();
        while (!birthday.equals("") && CheckCommand.checkDate(birthday)) {
            System.out.println("Введите дату рождения: ");
            birthday = scanner.nextLine();
        }
        return birthday;
    }
}

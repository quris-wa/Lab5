package command_managers;

import collection.Person;

import java.util.Scanner;

public class BirthdayManager {
    public static String readBirthday() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату рождения в формате 'yy-MM-ddThh:mm:ss': ");
        String birthday = scanner.nextLine();
        while (CheckCommand.checkDate(birthday)) {
            System.out.println("Введите дату рождения в формате 'yy-MM-ddThh:mm:ss': ");
            birthday = scanner.nextLine();
        }
        return birthday;
    }
}

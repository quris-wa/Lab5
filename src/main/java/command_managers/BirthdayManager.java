package command_managers;

import java.util.Scanner;

/**
 * BirthdayManager is a class for reading birthday.
 */
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

package command_managers;

import collection.Person;

import java.util.Scanner;

public class PassportIDManager {
    public static String readPassportID() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ID паспорта: ");
        String passportID = scanner.nextLine();
        while (CheckCommand.checkPassport(passportID)) {
            System.out.println("Введите ID паспорта: ");
            passportID = scanner.nextLine();
        }
        return passportID;
    }

    public static String readPassportIDForUpdate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ID паспорта: ");
        String passportID = scanner.nextLine();
        while (!passportID.equals("") && CheckCommand.checkPassport(passportID)) {
            System.out.println("Введите ID паспорта: ");
            passportID = scanner.nextLine();
        }
        return passportID;
    }
}

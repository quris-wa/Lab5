package commandManagers;

import collection.Person;

import java.util.Scanner;

public class PassportIDManager {
    public static void addPassportID(Person person) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ID паспорта: ");
        String passportID = scanner.nextLine();
        while (!CheckCommand.checkPassport(passportID)) {
            System.out.println("Введите ID паспорта: ");
            passportID = scanner.nextLine();
        }
        person.setPassportID(passportID);
    }

    public static void updatePassportID(Person person) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ID паспорта: ");
        String passportID = scanner.nextLine();
        while (!passportID.equals("") && !CheckCommand.checkPassport(passportID)) {
            System.out.println("Введите ID паспорта: ");
            passportID = scanner.nextLine();
        }
        if (!passportID.equals("")) person.setPassportID(passportID);
    }
}

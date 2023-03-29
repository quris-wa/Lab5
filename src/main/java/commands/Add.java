package commands;

import collection.*;
import commandManagers.*;
import personManagers.*;
import userManagers.UserManager;

import java.util.Scanner;

public class Add extends Command {
    String[] personParametrs = new String[12];

    @Override
    public void execute() {
        if (UserManager.getIsCommandArgument()) {
            System.out.println("У команды не должно быть аргумента!");
        } else {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите имя: ");
            String namePerson = scanner.nextLine();
            while (!CheckCommand.checkName(namePerson)) {
                System.out.println("Введите имя: ");
                namePerson = scanner.nextLine();
            }
            personParametrs[0] = namePerson;

            System.out.println("Введите координату X в типе данных Double(больше -866): ");
            String xStr = scanner.nextLine();
            while (!CheckCommand.checkValueX(xStr)) {
                System.out.println("Введите координату X в типе данных Double(больше -866): ");
                xStr = scanner.nextLine();
            }
            personParametrs[1] = xStr;

            System.out.println("Введите координату Y в типе данных Integer(больше -512): ");
            String yStr = scanner.nextLine();
            while (!CheckCommand.checkValueY(yStr)) {
                System.out.println("Введите координату Y в типе данных Integer(больше -512): ");
                yStr = scanner.nextLine();
            }
            personParametrs[2] = yStr;


            System.out.println("Введите рост в см: ");
            String heightStr = scanner.nextLine();
            while (!CheckCommand.checkValueHeight(heightStr)) {
                System.out.println("Введите рост в см(больше 0): ");
                heightStr = scanner.nextLine();
            }
            personParametrs[3] = heightStr;

            System.out.println("Введите дату рождения: ");
            String birthday = scanner.nextLine();
            while (!CheckCommand.checkDate(birthday)) {
                System.out.println("Введите дату рождения: ");
                birthday = scanner.nextLine();
            }
            personParametrs[4] = birthday;

            System.out.println("Введите ID паспорта: ");
            String passportID = scanner.nextLine();
            while (!CheckCommand.checkPassport(passportID)) {
                System.out.println("Введите ID паспорта: ");
                passportID = scanner.nextLine();
            }
            personParametrs[5] = passportID;

            System.out.println("Введите цвет глаз(BLACK, YELLOW, ORANGE): ");
            String eyeColor = scanner.nextLine();
            while (!CheckCommand.checkEyeColor(eyeColor)) {
                System.out.println("Введите цвет глаз(BLACK, YELLOW, ORANGE): ");
                eyeColor = scanner.nextLine();
            }
            personParametrs[6] = eyeColor;


            System.out.println("Введите координату X локации:");
            String xLocStr = scanner.nextLine();
            while (!CheckCommand.checkValueLocX(xLocStr)) {
                System.out.println("Введите координату X локации:");
                xLocStr = scanner.nextLine();
            }
            personParametrs[7] = xLocStr;

            if (!xLocStr.equals("")) {
                System.out.println("Введите координату Y локации:");
                String yLocStr = scanner.nextLine();
                while (!CheckCommand.checkValueLocY(yLocStr)) {
                    System.out.println("Введите координату Y локации:");
                    yLocStr = scanner.nextLine();
                }
                personParametrs[8] = yLocStr;

                System.out.println("Введите координату Z локации:");
                String zLocStr = scanner.nextLine();
                while (!CheckCommand.checkValueLocZ(zLocStr)) {
                    System.out.println("Введите координату Z локации:");
                    zLocStr = scanner.nextLine();
                }
                personParametrs[9] = zLocStr;

                System.out.println("Введите имя локации: ");
                String nameLoc = scanner.nextLine();
                personParametrs[10] = nameLoc;
            } else {
                for (int i = 8; i <= 10; i++) personParametrs[i] = "";
            }
            Person chelovek = new Person(personParametrs);
            PersonHelper.getCollection().add(chelovek);
        }
    }

    @Override
    public String getName() {
        return "add";
    }

    @Override
    public String getDescription() {
        return ": добавить новый элемент в коллекцию";
    }
}

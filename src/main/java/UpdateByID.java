import collection.Person;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class UpdateByID extends Command {

    @Override
    public void execute() {
        if (PersonHelper.getCollection().size() == 0) {
            System.out.println("Коллекция пустая");
        } else {
            Person person = new Person();
            boolean isFound = false;
            int findId = Integer.parseInt(argument);
            for (Person chelovek : PersonHelper.getCollection()) {
                int id = chelovek.getId();
                if (findId == id) {
                    person = chelovek;
                    isFound = true;
                }
            }
            if (!isFound) {
                System.out.println("Такого ID не существует!");
            } else {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите имя: ");
                String namePerson = scanner.nextLine();
                if (namePerson != null) person.changeName(namePerson);
                System.out.println("Введите координату X в типе данных Double(больше -866): ");

                String xStr = scanner.nextLine();
                while (!xStr.equals("") && !CheckCommand.checkValueX(xStr)) {
                    System.out.println("Введите координату X в типе данных Double(больше -866): ");
                    xStr = scanner.nextLine();
                }
                if (!xStr.equals("")) person.changeX(xStr);

                System.out.println("Введите координату Y в типе данных Integer(больше -512): ");
                String yStr = scanner.nextLine();
                while (!yStr.equals("") && !CheckCommand.checkValueY(yStr)) {
                    System.out.println("Введите координату Y в типе данных Integer(больше -512): ");
                    yStr = scanner.nextLine();
                }
                if (!yStr.equals("")) person.changeY(yStr);

                System.out.println("Введите рост в см(больше 0): ");
                String heightStr = scanner.nextLine();
                while (!heightStr.equals("") && !CheckCommand.checkValueHeight(heightStr)) {
                    System.out.println("Введите рост в см(больше 0): ");
                    heightStr = scanner.nextLine();
                }
                if (!heightStr.equals("")) person.changeHeight(heightStr);

                System.out.println("Введите дату рождения: ");
                String birthday = scanner.nextLine();
                while (!birthday.equals("") && !CheckCommand.checkDate(birthday)) {
                    System.out.println("Введите дату рождения: ");
                    birthday = scanner.nextLine();
                }
                if (!birthday.equals("")) person.changeBirthday(birthday);

                System.out.println("Введите ID паспорта: ");
                String passportID = scanner.nextLine();
                while (!passportID.equals("") && !CheckCommand.checkPassport(passportID)) {
                    System.out.println("Введите ID паспорта: ");
                    passportID = scanner.nextLine();
                }
                if (!passportID.equals("")) person.changePassportID(passportID);

                System.out.println("Введите цвет глаз(BLACK, YELLOW, ORANGE): ");
                String eyeColor = scanner.nextLine();
                while (!eyeColor.equals("") && !CheckCommand.checkEyeColor(eyeColor)) {
                    System.out.println("Введите цвет глаз(BLACK, YELLOW, ORANGE): ");
                    eyeColor = scanner.nextLine();
                }
                if (!eyeColor.equals("")) person.changeEyeColor(eyeColor);

                System.out.println("Введите координату X локации:");
                String xLocStr = scanner.nextLine();
                while (!xLocStr.equals("") && !CheckCommand.checkValueLocX(xLocStr)) {
                    System.out.println("Введите координату X локации:");
                    xLocStr = scanner.nextLine();
                }
                if(!xLocStr.equals(""))person.changeLocX(xLocStr);

                System.out.println("Введите координату Y локации:");
                String yLocStr = scanner.nextLine();
                while (!yLocStr.equals("") && !CheckCommand.checkValueLocY(yLocStr)) {
                    System.out.println("Введите координату Y локации:");
                    yLocStr = scanner.nextLine();
                }
                if(!yLocStr.equals(""))person.changeLocY(yLocStr);

                System.out.println("Введите координату Z локации:");
                String zLocStr = scanner.nextLine();
                while (!zLocStr.equals("") && !CheckCommand.checkValueLocZ(zLocStr)) {
                    System.out.println("Введите координату Z локации:");
                    zLocStr = scanner.nextLine();
                }
                if(!zLocStr.equals(""))person.changeLocZ(zLocStr);

                System.out.println("Введите имя локации: ");
                String nameLoc = scanner.nextLine();
                if (!nameLoc.equals("")) person.changeLocName(nameLoc);
                System.out.println("Значения данных человека с ID " + findId + " были обновлены");
            }
        }
    }
}

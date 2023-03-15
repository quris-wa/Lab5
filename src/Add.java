import collection.Person;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Add extends Command {
    String parametrs[] = new String[12];

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String namePerson = scanner.nextLine();
        parametrs[0] = namePerson;

        System.out.println("Введите координату X в типе данных Double: ");
        String xStr = scanner.nextLine();
        parametrs[1] = xStr;
        Double x = Double.parseDouble(xStr);


        System.out.println("Введите координату X в типе данных Integer: ");
        String yStr = scanner.nextLine();
        parametrs[2] = yStr;
        Integer y = Integer.parseInt(yStr);

        System.out.println("Введите рост в см: ");
        String heightStr = scanner.nextLine();
        parametrs[3] = heightStr;
        Double height = Double.parseDouble(heightStr);

        System.out.println("Введите дату рождения: ");
        String birthday = scanner.nextLine();
        parametrs[4] = birthday;

        System.out.println("Введите ID пасспорта: ");
        String passportID = scanner.nextLine();
        parametrs[5] = passportID;

        System.out.println("Введите цвет глаз(BLACK, YELLOW, ORANGE): ");
        String eyeColor = scanner.nextLine();
        parametrs[6] = eyeColor;

        System.out.println("Введите координату X локации:");
        String xLocStr = scanner.nextLine();
        parametrs[7] = xLocStr;
        Double xLoc = Double.parseDouble(xLocStr);

        System.out.println("Введите координату Y локации:");
        String yLocStr = scanner.nextLine();
        parametrs[8] = yLocStr;
        Float yLoc = Float.parseFloat(yLocStr);

        System.out.println("Введите координату Z локации:");
        String zLocStr = scanner.nextLine();
        parametrs[9] = zLocStr;
        Double zLoc = Double.parseDouble(zLocStr);

        System.out.println("Введите имя локации: ");
        String nameLoc = scanner.nextLine();
        parametrs[10]=nameLoc;

        Person chelovek = new Person(parametrs);
    }
}

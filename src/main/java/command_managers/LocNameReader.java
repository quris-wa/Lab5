package command_managers;

import java.util.Scanner;

public class LocNameReader {
    public static String readLocName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя локации: ");
        return scanner.nextLine();
    }
}

package command_managers;

import collection.Person;

import java.util.Scanner;

public class LocXManager {
    static boolean isXAdded = false;
    public static void addLocX(Person person) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату X локации:");
        String xLocStr = scanner.nextLine();
        while (!CheckCommand.checkValueLocX(xLocStr)) {
            System.out.println("Введите координату X локации:");
            xLocStr = scanner.nextLine();
        }
        if(!xLocStr.equals("")){
            person.setLocX(xLocStr);
            isXAdded = true;
        }
    }

    public static void updateLocX(Person person) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координату X локации:");
        String xLocStr = scanner.nextLine();
        while (!xLocStr.equals("") && !CheckCommand.checkValueLocX(xLocStr)) {
            System.out.println("Введите координату X локации:");
            xLocStr = scanner.nextLine();
        }
        if (!xLocStr.equals("")) person.setLocX(xLocStr);
    }
    public static boolean getIsXAdded(){
        return isXAdded;
    }
}

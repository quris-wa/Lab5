import collection.Person;

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
                String[] parametrs = new String[12];
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите имя: ");
                String namePerson = scanner.nextLine();
                if (namePerson != null) person.changeName(namePerson);
                parametrs[0] = namePerson;
            }
        }
    }
}

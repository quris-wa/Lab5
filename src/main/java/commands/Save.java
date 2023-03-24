package commands;

import collection.Person;
import commandManagers.*;
import personManagers.*;
import java.io.*;

public class Save extends Command {
    @Override
    public void execute() throws IOException {

        try (FileOutputStream out = new FileOutputStream("Saved_data.txt")) {
            BufferedOutputStream bos = new BufferedOutputStream(out);
            for (Person person : PersonHelper.getCollection()) {
                String personStr = person.toString();
                byte[] buffer = personStr.getBytes();
                bos.write(buffer, 0, buffer.length);
                bos.write('\n');
                bos.flush();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Коллекция сохранена в файл Saved_data.txt");
    }
}

import collection.Person;
import org.apache.commons.csv.*;
import java.io.*;
import java.nio.file.*;
public class Save extends Command{
    @Override
    public void execute() throws IOException {
        FileWriter writer = new FileWriter(new File("Saved_data.csv"));
        CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT);
        for (Person person: PersonHelper.getCollection()){
            csvPrinter.printRecord(person);
            csvPrinter.flush();
        }
        System.out.println("Коллекция сохранена в файл Saved_data.csv");
    }
}

import collection.Person;

public class Show extends Command {
    @Override
    public void execute() {
        for (Person person : PersonHelper.getCollection()) {
            System.out.println(person.toString());
        }
    }
}

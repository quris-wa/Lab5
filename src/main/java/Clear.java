import collection.Person;

public class Clear extends Command{
    @Override
    public void execute(){
        PersonHelper.getCollection().clear();
        System.out.println("Коллекция была очищена.");
    }
}

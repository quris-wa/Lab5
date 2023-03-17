import collection.Person;

public class Info extends Command{
    @Override
    public void execute(){

       // System.out.println("Тип коллекции: " + Person.getCityCollection().getClass().toString());
        //System.out.println("Дата инициализации: " + CityManager.getCityCollection().first().getCreationDate().toString());
        //System.out.println("Количество элементов: " + CityManager.getCityCollection().toArray().length);
    }
}

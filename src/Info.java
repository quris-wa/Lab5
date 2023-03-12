import collection.Person;

public class Info extends Command{
    @Override
    public void execute(){
        System.out.println("Тип коллекции: " );
        System.out.println("Дата инициализации: " );
        System.out.println("Количество элементов: ");
    }
}

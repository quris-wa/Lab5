public class Info extends Command {
    @Override
    public void execute() {

        System.out.println("Тип коллекции: " + PersonHelper.getCollection().getClass().toString());
        System.out.println("Дата инициализации: " + PersonHelper.getCollection().element().getCreationDate());
        System.out.println("Количество элементов: " + PersonHelper.getCollection().size());

    }
}

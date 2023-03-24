public class Help extends Command {
    @Override
    public void execute(){
        System.out.println("info: вывести в стандартный поток вывода информации о коллекции(тип, дата инициализации, количество элементов и т.д.)");
        System.out.println("show: вывести в стандартный поток вывода все элементы коллекции в строковом представлении");
        System.out.println("add {element}: добавить новый элемент в коллекцию");
        System.out.println("update id {element}: обновить значение элемента коллекции, id которого равен заданному");
        System.out.println("remove_by_id id: удалить элемент из коллекции по его id");
        System.out.println("clear: очистить коллекцию");
        System.out.println("save: сохранить коллекцию в файл");
        System.out.println("execute_script file_name: cчитать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме");
        System.out.println("exit: завершить программу (без сохранения в файл)");
        System.out.println("remove_first: удалить первый элемент из коллекции");
        System.out.println("head: вывести первый элемент из коллекции");
        System.out.println("remove_greater {element}: удалить все элементы из коллекции, превышающие заданный");
        System.out.println("remove_any_by_passport_i_d passportID: удалить из коллекции один элемент, значение поля passportID которого эквивалентно заданному");
        System.out.println("max_by_birthday: вывести любой объект из коллекции,значение поля birthday которого является максимальным");
        System.out.println("print_field_descending_height: вывести значения поля height всех элементов в порядке убывания");
    }
}

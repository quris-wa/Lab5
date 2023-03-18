import collection.Person;

import java.util.Queue;

public class PersonHelper {
    private static Queue<Person> persons = new java.util.PriorityQueue<Person>();
    public static Queue<Person> getCollection(){
        return persons;
    }
    public static java.util.Date getCreationDate(){
        return persons.stream().findFirst().get().getCreationDate();
    }
}
package personManagers;

import collection.Person;

import java.util.Queue;

public class PersonHelper {
    private static Queue<Person> persons = new java.util.PriorityQueue<>();

    public static Queue<Person> getCollection() {
        return persons;
    }
}

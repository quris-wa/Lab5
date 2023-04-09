package person_managers;

import collection.Person;

import java.util.Queue;

/**
 * PersonHelper is a class for working with the collection of Person objects.
 */
public class PersonHelper {
    private static final Queue<Person> persons = new java.util.PriorityQueue<>();

    public static Queue<Person> getCollection() {
        return persons;
    }
}

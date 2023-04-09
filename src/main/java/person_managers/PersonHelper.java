package person_managers;

import collection.Person;

import java.util.Queue;

/**
 * PersonHelper is a class for working with the collection of Person objects.
 * It provides methods for loading and writing the collection to a .csv file,
 * as well as creating a new City object based on user input.
 */
public class PersonHelper {
    private static Queue<Person> persons = new java.util.PriorityQueue<>();

    public static Queue<Person> getCollection() {
        return persons;
    }
}

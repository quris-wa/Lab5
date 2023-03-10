package collection;

import collection.Coordinates;
import collection.Location;

import java.util.ArrayList;
import java.util.List;

public class Person{
    private int id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.util.Date creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Double height; //Поле может быть null, Значение поля должно быть больше 0
    private java.time.LocalDateTime birthday; //Поле может быть null
    private String passportID; //Длина строки должна быть не меньше 9, Длина строки не должна быть больше 26, Поле может быть null
    private Color eyeColor; //Поле может быть null
    private Location location; //Поле может быть null
    public Person(String[] str1){

    }
}

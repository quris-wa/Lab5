package collection;

import collection.Coordinates;
import collection.Location;

import java.text.*;
import java.util.*;


public class Person implements Comparable {
    private int id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.util.Date creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Double height; //Поле может быть null, Значение поля должно быть больше 0
    private java.util.Date birthday; //Поле может быть null
    private String passportID; //Длина строки должна быть не меньше 9, Длина строки не должна быть больше 26, Поле может быть null
    private Color eyeColor; //Поле может быть null
    private Location location; //Поле может быть null

    public Person(String[] str1) {
        Random randomID = new Random(new Date().getTime());
        id = randomID.nextInt();
        name = str1[0];
        coordinates = new Coordinates(Double.parseDouble(str1[1]), Integer.parseInt(str1[2]));
        creationDate = new Date();
        if (notNull(str1[3])) height = Double.parseDouble(str1[3]);
        if (notNull(str1[4])) {
            SimpleDateFormat df = new SimpleDateFormat("dd.mm.yyyy");
            birthday = df.parse(str1[4], new ParsePosition(0));
        }
        if (notNull(str1[5])) passportID = str1[5];
        if (notNull(str1[6])) {
            if (notNull(str1[6])) eyeColor = Color.valueOf(str1[6]);
            else eyeColor = null;
        }
        if (notNull(str1[7]) && notNull(str1[10]))
            location = new Location(Double.parseDouble(str1[7]), Float.parseFloat(str1[8]), Double.parseDouble(str1[9]), str1[10]);
    }

    public boolean notNull(String argument) {
        if (argument.equals("")) return false;
        else return true;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

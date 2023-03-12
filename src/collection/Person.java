package collection;

import collection.Coordinates;
import collection.Location;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.chrono.ChronoLocalDate;
import java.util.*;


public class Person implements Comparable{
    private int id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.util.Date creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Double height; //Поле может быть null, Значение поля должно быть больше 0
    private java.util.Date birthday; //Поле может быть null
    private String passportID; //Длина строки должна быть не меньше 9, Длина строки не должна быть больше 26, Поле может быть null
    private Color eyeColor; //Поле может быть null
    private Location location; //Поле может быть null
    public Person(String[] str1){
        Random randomID = new Random(new Date().getTime());
        id = randomID.nextInt();
        name = str1[0];
        coordinates = new Coordinates(Double.parseDouble(str1[1]),Integer.parseInt(str1[2]));
        creationDate = new Date();
        height = Double.parseDouble(str1[3]);
        SimpleDateFormat df = new SimpleDateFormat("dd.mm.yyyy");
        birthday = df.parse(str1[4], new ParsePosition(0));
        Random randomPassID = new Random(new Date().getTime());
        UUID uid = UUID.randomUUID();
        passportID = uid.toString();
        eyeColor = Color.valueOf(str1[5]);
        location = new Location(Double.parseDouble(str1[6]),Float.parseFloat(str1[7]),Double.parseDouble(str1[8]),str1[9]);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

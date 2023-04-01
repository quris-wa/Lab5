package collection;

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

    public Person() {
        Random randomID = new Random(new Date().getTime());
        id = Math.abs(randomID.nextInt());
        creationDate = new Date();
    }

    public Person(String[] str1) {
        Random randomID = new Random(new Date().getTime());
        id = Math.abs(randomID.nextInt());
        setName(str1[0]);
        coordinates = new Coordinates(Double.parseDouble(str1[1]), Integer.parseInt(str1[2]));
        creationDate = new Date();
        setHeight(str1[3]);
        setBirthday(str1[4]);
        setPassportID(str1[5]);
        setEyeColor(str1[6]);
        if (notNull(str1[7]) && notNull(str1[10]))
            location = new Location(Double.parseDouble(str1[7]), Float.parseFloat(str1[8]), Double.parseDouble(str1[9]), str1[10]);
    }

    public boolean notNull(String argument) {
        return !argument.equals("");
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Double getHeight() {
        return height;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getPassportID() {
        return passportID;
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        String output;
        output = "ID : " + id + ", имя: " + name + ", координаты: (" + coordinates.getX() + ", " + coordinates.getY()
                + "), дата создания: " + creationDate;
        if (height != null) {
            output += ", рост: " + height;
        }
        if (birthday != null) {
            output += ", дата рождения: " + birthday;
        }
        if (passportID != null) {
            output += ", ID паспорта: " + passportID;
        }
        if (eyeColor != null) {
            output += ", цвет глаз: " + eyeColor;
        }
        if (location != null) {
            if (location.getName() != null)
                output += ", локация " + location.getName();
            output += ", координаты локации: (" + location.getX() + ", " + location.getY() + ", " + location.getZ() + ")";
        }
        output += ";";
        return output;
    }

    public int getId() {
        return id;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setX(String newX) {
        if(coordinates == null)coordinates = new Coordinates(Double.parseDouble(newX), 0);
        coordinates = new Coordinates(Double.parseDouble(newX), coordinates.getY());
    }

    public void setY(String newY) {
        coordinates = new Coordinates(coordinates.getX(), Integer.parseInt(newY));
    }

    public void setHeight(String newHeight) {
        height = Double.parseDouble(newHeight);
    }

    public void setBirthday(String newBirthday) {
        SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        birthday = df.parse(newBirthday, new ParsePosition(0));
    }

    public void setPassportID(String newPassportID) {
        passportID = newPassportID;
    }

    public void setEyeColor(String newEyeColor) {
        if (!newEyeColor.equals("")) eyeColor = Color.valueOf(newEyeColor);
    }

    public void setLocX(String newLocX) {
        location = new Location(Double.parseDouble(newLocX), location.getY(), location.getZ(), location.getName());
    }

    public void setLocY(String newLocY) {
        location = new Location(location.getX(), Float.parseFloat(newLocY), location.getZ(), location.getName());
    }

    public void setLocZ(String newLocZ) {
        location = new Location(location.getX(), location.getY(), Double.parseDouble(newLocZ), location.getName());
    }

    public void setLocName(String newLocName) {
        location = new Location(location.getX(), location.getY(), location.getZ(), newLocName);
    }

}

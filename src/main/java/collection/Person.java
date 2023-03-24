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

    public Person() {

    }
    public Person(String[] str1) {
        Random randomID = new Random(new Date().getTime());
        id = Math.abs(randomID.nextInt());
        name = str1[0];
        coordinates = new Coordinates(Double.parseDouble(str1[1]), Integer.parseInt(str1[2]));
        creationDate = new Date();
        if (notNull(str1[3])) height = Double.parseDouble(str1[3]);
        if (notNull(str1[4])) {
            SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy");
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

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
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

    public Color getEyeColor() {
        return eyeColor;
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
            output += ", рост: " + height.toString();
        }
        if (birthday != null) {
            output += ", дата рождения: " + birthday.toString();
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

    public void changeName(String newName) {
        name = newName;
    }

    public void changeX(String newX) {
        coordinates = new Coordinates(Double.parseDouble(newX), coordinates.getY());
    }

    public void changeY(String newY) {
        coordinates = new Coordinates(coordinates.getX(), Integer.parseInt(newY));
    }

    public void changeHeight(String newHeight) {
        height = Double.parseDouble(newHeight);
    }

    public void changeBirthday(String newBirthday) {
        SimpleDateFormat df = new SimpleDateFormat("dd.mm.yyyy");
        birthday = df.parse(newBirthday, new ParsePosition(0));
    }

    public void changePassportID(String newPassportID) {
        passportID = newPassportID;
    }

    public void changeEyeColor(String newEyeColor) {
        eyeColor = Color.valueOf(newEyeColor);
    }

    public void changeLocX(String newLocX) {
        location = new Location(Double.parseDouble(newLocX), location.getY(), location.getZ(), location.getName());
    }

    public void changeLocY(String newLocY) {
        location = new Location(location.getX(), Float.parseFloat(newLocY), location.getZ(), location.getName());
    }

    public void changeLocZ(String newLocZ) {
        location = new Location(location.getX(), location.getY(), Double.parseDouble(newLocZ), location.getName());
    }

    public void changeLocName(String newLocName) {
        location = new Location(location.getX(), location.getY(), location.getZ(), newLocName);
    }

}

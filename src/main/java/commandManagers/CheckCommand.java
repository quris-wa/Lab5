package commandManagers;

import collection.Color;

import java.text.*;
import java.util.Date;

public class CheckCommand {
    public static boolean checkName(String argument) {
        if (argument.equals("")) {
            System.out.println("Значение не должно быть пустым!");
            return false;
        }
        return true;
    }

    public static boolean checkValueX(String argument) {
        if (argument.equals("")) {
            System.out.println("Значение не должно быть пустым!");
            return false;
        }
        try {
            Double doubleNum = Double.parseDouble(argument);
        } catch (NumberFormatException e) {
            System.out.println("Значение должно быть в типе данных Double");
            return false;
        }
        if (Double.parseDouble(argument) <= -886) {
            System.out.println("Значение должно быть больше, чем -886");
            return false;
        } else return true;
    }

    public static boolean checkValueY(String argument) {
        if (argument.equals("")) {
            System.out.println("Значение не должно быть пустым!");
            return false;
        }
        try {
            Integer integerNum = Integer.parseInt(argument);
        } catch (NumberFormatException e) {
            System.out.println("Значение должно быть в типе данных Integer");
            return false;
        }
        if (Double.parseDouble(argument) <= -512) {
            System.out.println("Значение должно быть больше, чем -512");
            return false;
        } else return true;
    }

    public static boolean checkValueHeight(String argument) {
        if (argument.equals("")) return true;
        try {
            Double doubleNum = Double.parseDouble(argument);
        } catch (NumberFormatException e) {
            System.out.println("Значение должно быть в типе данных Double");
            return false;
        }
        if (Double.parseDouble(argument) <= 0) {
            System.out.println("Значение должно быть больше, чем 0");
            return false;
        } else return true;
    }

    public static boolean checkDate(String argument) {
        if (argument.equals("")) return true;
        Date date;
        SimpleDateFormat df = new SimpleDateFormat("dd.mm.yyyy");
        date = df.parse(argument, new ParsePosition(0));
        if (date == null) {
            System.out.println("Дата должна быть в формате ДД.ММ.ГГГГ");
            return false;
        } else return true;

    }

    public static boolean checkPassport(String argument) {
        if (argument.equals("")) return true;
        if (argument.length() > 26) {
            System.out.println("Длина ID паспорта не должна быть больше 26");
            return false;
        } else if (argument.length() < 9) {
            System.out.println("Длина ID паспорта не должна быть меньше 9");
            return false;
        }
        return true;
    }

    public static boolean checkEyeColor(String argument) {
        if (argument.equals("")) return true;
        try {
            Color.valueOf(argument);
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println("Цвет глаз должен соответсовать одному из значение: BLACK, YELLOW, ORANGE");
            return false;
        }
    }

    public static boolean checkValueLocX(String argument) {
        if (argument.equals("")) return true;
        try {
            Double doubleNum = Double.parseDouble(argument);
        } catch (NumberFormatException e) {
            System.out.println("Значение должно быть в типе данных Double");
            return false;
        }
        return true;
    }

    public static boolean checkValueLocY(String argument) {
        if (argument.equals("")) {
            System.out.println("Значение не должно быть пустым!");
            return false;
        }
        try {
            Float floatNum = Float.parseFloat(argument);
        } catch (NumberFormatException e) {
            System.out.println("Значение должно быть в типе данных Float");
            return false;
        }
        return true;
    }

    public static boolean checkValueLocZ(String argument) {
        if (argument.equals("")) {
            System.out.println("Значение не должно быть пустым!");
            return false;
        }
        try {
            Double doubleNum = Double.parseDouble(argument);
        } catch (NumberFormatException e) {
            System.out.println("Значение должно быть в типе данных Double");
            return false;
        }
        return true;
    }
}

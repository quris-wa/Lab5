package command_managers;

import collection.Color;
import user_managers.UserManager;

import java.time.format.DateTimeParseException;

import static java.time.LocalDateTime.parse;

/**
 * CheckCommand is class for checking fields.
 */
public class CheckCommand {
    /**
     * checks is name null
     */
    public static boolean checkName(String argument) {
        if (argument.equals("")) {
            System.out.println("Значение не должно быть пустым!");
            return false;
        }
        return true;
    }

    /**
     * checks is X null, double and greater than -886
     */
    public static boolean checkValueX(String argument) {
        if (argument.equals("")) {
            System.out.println("Значение не должно быть пустым!");
            return true;
        }
        try {
            Double.parseDouble(argument);
        } catch (NumberFormatException e) {
            System.out.println("Значение должно быть в типе данных Double");
            return true;
        }
        if (Double.parseDouble(argument) <= -886) {
            System.out.println("Значение должно быть больше, чем -886");
            return true;
        } else return false;
    }

    /**
     * checks is Y null, Integer and greater than -512
     */
    public static boolean checkValueY(String argument) {
        if (argument.equals("")) {
            System.out.println("Значение не должно быть пустым!");
            return true;
        }
        try {
            Integer.parseInt(argument);
        } catch (NumberFormatException e) {
            System.out.println("Значение должно быть в типе данных Integer");
            return true;
        }
        if (Double.parseDouble(argument) <= -512) {
            System.out.println("Значение должно быть больше, чем -512");
            return true;
        } else return false;
    }

    /**
     * checks is height double and greater than 0
     */
    public static boolean checkValueHeight(String argument) {
        if (argument.equals("")) return false;
        try {
            Double.parseDouble(argument);
        } catch (NumberFormatException e) {
            System.out.println("Значение должно быть в типе данных Double");
            return true;
        }
        if (Double.parseDouble(argument) <= 0) {
            System.out.println("Значение должно быть больше, чем 0");
            return true;
        } else return false;
    }

    /**
     * checks whether the date matches the format
     */
    public static boolean checkDate(String argument) {
        if (argument.equals("")) return false;
        try {
            parse(argument);
        } catch (DateTimeParseException e) {
            System.out.println("Неверный формат даты рождения!");
            BirthdayManager.readBirthday();
            return false;
        }
        return true;
    }

    /**
     * checks is passport ID longer than 8 and shorter than 27
     */
    public static boolean checkPassport(String argument) {
        if (argument.equals("")) return false;
        if (argument.length() > 26) {
            System.out.println("Длина ID паспорта не должна быть больше 26");
            return true;
        } else if (argument.length() < 9) {
            System.out.println("Длина ID паспорта не должна быть меньше 9");
            return true;
        }
        return false;
    }

    /**
     * checks is eye color is exist
     */
    public static boolean checkEyeColor(String argument) {
        if (argument.equals("")) return false;
        try {
            Color.valueOf(argument);
            return false;
        } catch (IllegalArgumentException e) {
            System.out.println("Цвет глаз должен соответствовать одному из значение: BLACK, YELLOW, ORANGE");
            return true;
        }
    }

    public static boolean checkValueLocX(String argument) {
        if (argument.equals("")) return false;
        try {
            Double.parseDouble(argument);
        } catch (NumberFormatException e) {
            System.out.println("Значение должно быть в типе данных Double");
            return true;
        }
        return false;
    }

    public static boolean checkValueLocY(String argument) {
        if (argument.equals("")) {
            System.out.println("Значение не должно быть пустым!");
            return true;
        }
        try {
            Float.parseFloat(argument);
        } catch (NumberFormatException e) {
            System.out.println("Значение должно быть в типе данных Float");
            return true;
        }
        return false;
    }

    public static boolean checkValueLocZ(String argument) {
        if (UserManager.getCommandArgument().equals("")) {
            System.out.println("Значение не должно быть пустым!");
            return true;
        }
        try {
            Double.parseDouble(argument);
        } catch (NumberFormatException e) {
            System.out.println("Значение должно быть в типе данных Double");
            return true;
        }
        return false;
    }
}

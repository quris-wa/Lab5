package collection;

public class Coordinates {
    private Double x; //Значение поля должно быть больше -886, Поле не может быть null
    private Integer y; //Значение поля должно быть больше -512, Поле не может быть null
    public Coordinates(Double x, Integer y){
        this.x = x;
        this.y = y;
    }
}

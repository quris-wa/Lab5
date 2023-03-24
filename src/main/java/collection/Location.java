package collection;

public class Location {
    private double x;
    private float y;
    private double z;
    private String name; //Поле может быть null

    public Location(double x, float y, double z, String name) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Double getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public Double getZ() {
        return z;
    }
}

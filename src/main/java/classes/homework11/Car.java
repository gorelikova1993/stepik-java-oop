package classes.homework11;
import java.util.Calendar;
public class Car {
    private String brand;
    private String owner;
    private double volume;
    private int yearOfMade;
    private static int currentYear;

    static {
        Calendar cal = Calendar.getInstance();
        currentYear = cal.get(Calendar.YEAR);
    }

    public Car(String brand, String surnameOwner, double engineCapacity, int yearOfCreation) {
        this.brand = brand;
        this.owner = surnameOwner;
        this.volume = engineCapacity;
        this.yearOfMade = yearOfCreation;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getYearOfMade() {
        return yearOfMade;
    }

    public void setYearOfMade(int yearOfMade) {
        this.yearOfMade = yearOfMade;
    }

    public static int getCurrentYear() {
        return currentYear;
    }

    public int getLife() {
        return currentYear - this.getYearOfMade();
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", owner='" + owner + '\'' +
                ", volume=" + volume +
                ", yearOfMade=" + yearOfMade +
                '}';
    }
}

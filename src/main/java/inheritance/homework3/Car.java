package inheritance.homework3;

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

    public Car(String brand, String owner, double volume, int yearOfMade) {
        this.brand = brand;
        this.owner = owner;
        this.volume = volume;
        this.yearOfMade = yearOfMade;
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

    public static void setCurrentYear(int currentYear) {
        Car.currentYear = currentYear;
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

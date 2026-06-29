package wrapper_classes_generics.homework15;

public class Car {
    private String brand;
    private double volume;

    public Car(String brand, double volume) {
        this.brand = brand;
        this.volume = volume;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return brand + ";" + volume;
    }
}

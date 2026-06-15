package classes.homework11;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // scanner.useLocale(Locale.US);
        int arrSize = scanner.nextInt();
        Car[] cars = new Car[arrSize];
        int newCar = Integer.MAX_VALUE;
        for (int i = 0; i < arrSize; i++) {
            String brand = scanner.next();
            String owner = scanner.next();
            double volume = scanner.nextDouble();
            int year = scanner.nextInt();
            Car car = new Car(brand, owner, volume, year);
            if (car.getLife() < newCar) {
                newCar = car.getLife();
            }
            cars[i] = car;
        }
        scanner.skip("\n");
        int number = scanner.nextInt() - 1;
        double volume = scanner.nextDouble();
        cars[number].setVolume(volume);
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println();
        for (Car car : cars) {
            if (car.getLife() == newCar) {
                System.out.println(car);
            }
        }
    }
}

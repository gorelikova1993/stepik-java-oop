package inheritance.homework3;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();
        Car[] cars = new Car[arrSize];

        for (int i = 0; i < arrSize; i++) {
            int type = scanner.nextInt();
            String brand = scanner.next();
            String owner = scanner.next();
            double volume = scanner.nextDouble();
            int yearOfMade = scanner.nextInt();
            switch (type) {
                case 1:
                    Car car = new Car(brand, owner, volume, yearOfMade);
                    cars[i] = car;
                    break;
                case 2:
                    double capacity = scanner.nextDouble();
                    Truck truck = new Truck(brand, owner, volume, yearOfMade, capacity);
                    cars[i] = truck;
                    break;
            }
        }
        scanner.skip("\n");
        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println();
        double capacity = scanner.nextDouble();
        boolean isExisted = false;
        for (Car car : cars) {
            if (car instanceof Truck) {
                if (((Truck) car).getCapacity() >= capacity && car.getLife() <= 8) {
                    isExisted = true;
                    System.out.println(car);
                }
            }
        }
        if(!isExisted) {
            System.out.println("NO");
        }
    }
}

package wrapper_classes_generics.homework15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Garage garage = new Garage(size);
        scanner.nextLine();

        while (true) {
            int type = scanner.nextInt();

            if (type == 4) {
                break;
            }

            if (type == 1) {
                String brand = scanner.next();
                double volume = scanner.nextDouble();
                int numBox = scanner.nextInt();
                Car car = new Car(brand, volume);

                try {
                    garage.putCar(car, numBox);
                } catch (ErrorBoxException e) {
                    int freeBox = garage.getFreeBoxNumber();
                    if (freeBox != -1) {
                        try {
                            garage.putCar(car, freeBox);
                        } catch (ErrorBoxException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                }
            }

            if (type == 2) {
                int numBox = scanner.nextInt();
                try {
                    Car car = garage.getCar(numBox);
                    System.out.println(car);
                } catch (ErrorBoxException e) {
                    System.out.println("ERROR");
                }
            }

            if (type == 3) {
                System.out.println("----------------");
                for (Car car : garage) {
                    System.out.println(car);
                }
                System.out.println("----------------");
            }
        }
        scanner.close();


    }
}

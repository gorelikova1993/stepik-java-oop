package wrapper_classes_generics.homework4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String breed = scanner.next();
        String colourCollar = scanner.next();
        double sizeCollar = scanner.nextDouble();

        Dog dog1 = new Dog(name, breed, colourCollar, sizeCollar);


        String name2 = scanner.next();
        String breed2 = scanner.next();
        String colourCollar2 = scanner.next();
        double sizeCollar2 = scanner.nextDouble();

        Dog dog2 = new Dog(name2, breed2, colourCollar2, sizeCollar2);

        if (dog1.compareTo(dog2) == 1) {
            System.out.println("Первая собака больше");
        } else if (dog1.compareTo(dog2) == -1) {
            System.out.println("Вторая собака больше");
        } else {
            System.out.println("Собаки одинакового размера");
        }
    }
}

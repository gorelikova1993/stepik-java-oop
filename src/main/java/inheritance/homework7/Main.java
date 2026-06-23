package inheritance.homework7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();

        Pet[] pets = new Pet[arrSize];
        for (int i = 0; i < arrSize; i++) {
            int type = scanner.nextInt();
            String surname = scanner.next();
            int age = scanner.nextInt();
            String breed = scanner.next();
            switch (type) {
                case 1:
                    Dog dog = new Dog(surname, age, breed);
                    pets[i] = dog;
                    break;
                case 2:
                    Cat cat = new Cat(surname, age, breed);
                    pets[i] = cat;
                    break;
            }
        }
        for (Pet pet : pets) {
            System.out.print(pet.getClass().getSimpleName() + " " + pet.getNickname() + ":");
            pet.getNoise();
        }
        System.out.println();
        for (Pet pet : pets) {
            if (pet instanceof Cat) {
                System.out.println(pet);
            }
        }
    }
}

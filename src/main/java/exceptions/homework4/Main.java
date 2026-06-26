package exceptions.homework4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte cars = scanner.nextByte();
        Parking parking = new Parking((byte) 10);
        System.out.println("Приехали на парковку");
        try {
            parking.check(cars);
            System.out.println("Припарковались");
        } catch (TooManyCarsException e) {
            System.out.println("Вся парковка занята. Свободных мест нет.");
            System.out.println("Припарковались в другом месте");
        } finally {
            System.out.println("Выходим из машин");
        }

    }
}

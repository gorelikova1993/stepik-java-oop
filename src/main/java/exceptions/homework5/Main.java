package exceptions.homework5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Luggage luggage = new Luggage(10);
        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextDouble();
        System.out.println("Надо пройти регистрацию на рейс");
        try {
            luggage.checkLuggage(weight);
            System.out.println("Доплата за вес не нужна");
        } catch (HeavyLuggageException e) {
            System.out.println(e.getMessage());
            System.out.println("Нужно оплатить превышение веса по тарифу");
        }
        System.out.println("Регистрация пройдена");
    }
}

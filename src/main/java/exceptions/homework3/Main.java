package exceptions.homework3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cook cook = new Cook();
        String product = scanner.nextLine();
        cook.turnOvenOn();
        try {
            cook.bake(product);
            System.out.println("Блюдо готово");
        } catch (BakingException e) {
            System.out.println("Блюдо полностью испортилось: " + e.getMessage());;
        } finally {
            cook.turnOvenOff();
        }
    }
}

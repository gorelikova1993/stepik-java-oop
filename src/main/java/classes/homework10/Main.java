package classes.homework10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();
        if (arrSize < 0) {
            System.out.println("ERROR");
        } else {
            int maxTotal = 0;
            Purchase[] purchases = new Purchase[arrSize];
            for (int i = 0; i < arrSize; i++) {
                String name = scanner.next();
                int price = scanner.nextInt();
                int quantity = scanner.nextInt();
                Purchase purchase = new Purchase(new Commodity(name, price), quantity);
                if (purchase.getCost() > maxTotal) {
                    maxTotal = purchase.getCost();
                }
                purchases[i] = purchase;
            }
            for (Purchase purchase : purchases) {
                if(purchase.getCost() == maxTotal) {
                    System.out.println(purchase);
                }
            }

        }
    }
}

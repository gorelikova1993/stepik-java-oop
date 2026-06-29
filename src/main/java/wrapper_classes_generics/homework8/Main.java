package wrapper_classes_generics.homework8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MySet<Purchase> purchases = new MySet<>(3);
        String line = scanner.nextLine();
        while (!line.equals("end")) {
            String[] parts = line.split(" ");
            String name = parts[0];
            int price = Integer.parseInt(parts[1]);
            int count = Integer.parseInt(parts[2]);
            Purchase purchase = new Purchase(name, price, count);
            purchases.add(purchase);
            line = scanner.nextLine();
        }
        purchases.print();
    }
}

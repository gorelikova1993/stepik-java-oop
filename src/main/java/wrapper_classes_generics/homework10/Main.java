package wrapper_classes_generics.homework10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Purchase> purchaseList = new ArrayList<>();
        String line = scanner.nextLine();
        while (!line.equals("end")) {
            String[] parts = line.split(" ");
            int type = Integer.parseInt(parts[0]);
            String name = parts[1];
            int price = Integer.parseInt(parts[2]);
            int count = Integer.parseInt(parts[3]);
            switch (type) {
                case 1:
                    Purchase purchase = new Purchase(name, price, count);
                    purchaseList.add(purchase);
                    break;
                case 2:
                    int discount = Integer.parseInt(parts[4]);
                    DiscountPurchase discountPurchase = new DiscountPurchase(name, price, count,discount);
                    purchaseList.add(discountPurchase);
                    break;
            }
            line = scanner.nextLine();
        }
        int sum = 0;
        for (Purchase purchase : purchaseList) {
            sum += purchase.getCost();
        }
        System.out.println("Total sum = " + sum);
    }
}

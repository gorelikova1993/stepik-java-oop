package inheritance.homework2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int arrSize = scanner.nextInt();
        Purchase[] purchases = new Purchase[arrSize];

        double discount = scanner.nextDouble();
        int minAmount = scanner.nextInt();
        FixDiscountPurchase.setDiscount(discount);
        FlowDiscountPurchase.setDiscount(discount);
        FlowDiscountPurchase.setMinAmount(minAmount);



        for (int i = 0; i < arrSize; i++) {
            int type = scanner.nextInt();
            String name = scanner.next();
            int price = scanner.nextInt();
            int count = scanner.nextInt();
            switch (type) {
                case 1:
                    Purchase purchase = new Purchase(new Commodity(name,price), count);
                    purchases[i] = purchase;
                    break;
                case 2:
                    FixDiscountPurchase fixDiscountPurchase = new FixDiscountPurchase(new Commodity(name, price), count);
                    purchases[i] = fixDiscountPurchase;
                    break;
                case 3:
                    FlowDiscountPurchase flowDiscountPurchase = new FlowDiscountPurchase(new Commodity(name, price), count);
                    purchases[i] = flowDiscountPurchase;
                    break;
            }
        }
        for (Purchase purchase : purchases) {
            System.out.println(purchase);
        }
        int maxPrice = 0;
        int index = -1;
        for (int i = 0; i < arrSize; i++) {
            int maxCost = purchases[i].getCost();
            if (maxCost > maxPrice) {
                maxPrice = maxCost;
            }
        }

        for (int i = 0; i < arrSize; i++) {
            int maxCost = purchases[i].getCost();
            if (maxCost == maxPrice) {
                System.out.println(i);
                break;
            }
        }
        boolean allEqual = true;
        for (int i = 1; i < arrSize; i++) {
            if (!purchases[0].equals(purchases[i])) {
                allEqual = false;
                break;
            }
        }
        if (allEqual && arrSize > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

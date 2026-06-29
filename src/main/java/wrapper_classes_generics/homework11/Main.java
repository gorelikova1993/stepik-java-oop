package wrapper_classes_generics.homework11;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();
        Purchase[] purchases = new Purchase[arrSize];
        int i = 0;
        while (i < arrSize) {
            String name = scanner.next();
            int price = scanner.nextInt();
            int count = scanner.nextInt();
            Purchase purchase = new Purchase(name, price, count);
            purchases[i] = purchase;
            i++;
        }
        Arrays.sort(purchases, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        for (Purchase purchase : purchases) {
            System.out.println(purchase);
        };
        System.out.println();
        Arrays.sort(purchases, (o1, o2) -> o1.getTotal() - o2.getTotal());
        for (Purchase purchase : purchases) {
            System.out.println(purchase);
        };
    }
}

package classes.homework4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Commodity commodity = new Commodity();

        Scanner scanner = new Scanner(System.in);

        String nameCommodity = scanner.nextLine();
        int costCommodity = scanner.nextInt();

        commodity.setName(nameCommodity);
        commodity.setCost(costCommodity);

        int countPurchase = scanner.nextInt();
        Purchase purchase = new Purchase(commodity, countPurchase);
        purchase.show();

        int newCostCommodity = scanner.nextInt();
        commodity.setCost(newCostCommodity);
        System.out.println();

        purchase.show();

    }
}

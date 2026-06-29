package wrapper_classes_generics.homework5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> positiveList = new ArrayList<>(); //0
        List<Integer> negativeList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int num;
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                if (num >= 0) {
                    positiveList.add(num);
                } else {
                    negativeList.add(num);
                }
             } else {
                String line = scanner.next();
                if (line.equals("finish")) {
                    break;
                } else {
                    positiveList.add(0);
                }
            }
        }
        if (positiveList.isEmpty()) {
            System.out.println("Пустой список");
        } else {
            Collections.sort(positiveList);
            for (Integer num : positiveList) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        if (negativeList.isEmpty()) {
            System.out.println("Пустой список");
        } else {
            Collections.sort(negativeList);
            for (Integer num : negativeList) {
                System.out.print(num + " ");
            }
        }
    }
}

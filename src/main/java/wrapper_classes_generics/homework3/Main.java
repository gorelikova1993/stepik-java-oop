package wrapper_classes_generics.homework3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] arr = line.split("#");
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            try {
                double num = Double.parseDouble(arr[i]);
                sum+=num;
            } catch (NumberFormatException e){
            }

        }
        System.out.printf("%.1f", sum);
    }
}

package wrapper_classes_generics.homework2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        boolean isExisted = false;
        for (int i = 0; i < line.length(); i++) {
            char current = line.charAt(i);
            if (Character.isDigit(current)) {
                sb.append(current);
                isExisted = true;
            } else {
                sb.append(" ");
            }
        }
        if (isExisted) {
            String str = sb.toString();
            String[] arr = str.trim().split("\\s+");
            int max = 0;
            for (int i = 0; i < arr.length; i++) {
                try {
                    int num = Integer.parseInt(arr[i]);
                    if (num > max) {
                        max = num;
                    }
                } catch (NumberFormatException e) {
                    System.out.println(0);
                    ;
                }

            }
            System.out.println(max);
        } else {
            System.out.println(0);
        }
    }
}

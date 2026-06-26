package exceptions.homework6;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrSize = 0;

        while (true) {
            if (scanner.hasNextInt()) {
                arrSize = scanner.nextInt();
                if (arrSize > 0) {
                    break;
                } else {
                    System.out.println("Введите положительный размер массива!");
                }
            } else {
                System.out.println("Размер массива должен быть целым числом!");
                scanner.next();
            }
        }

        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            int num = 0;
            if (scanner.hasNextInt()) {
                num =scanner.nextInt();
            } else {
                scanner.next();//очищаем буфер
            }
            arr[i] = num;
        }
        try {
            int index = scanner.nextInt();
            System.out.println("Извлечено из массива: " + arr[index]);
        } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Неверный индекс");
        }
        System.out.println(Arrays.toString(arr));
    }
}

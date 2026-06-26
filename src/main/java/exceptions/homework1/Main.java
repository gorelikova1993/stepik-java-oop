package exceptions.homework1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long seed = scanner.nextLong();
        Random random = new Random(seed);
        int size = random.nextInt(-10, 11);
        try {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = i;
            }
            System.out.println(Arrays.toString(arr));
        } catch (NegativeArraySizeException e){
            System.out.println("Неверный размер массива: " + size);
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
    }
}

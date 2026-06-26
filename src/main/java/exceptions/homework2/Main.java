package exceptions.homework2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long seed = scanner.nextLong();
        Random random = new Random(seed);
        int arrSize = random.nextInt(1, 11);

        int[] arr = new int[arrSize];
        for (int i = 0; i < 3; i++) {
            int index = scanner.nextInt();
            int value = scanner.nextInt();
            try {
                arr[index] = value;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Индекс не попал в массив");
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}


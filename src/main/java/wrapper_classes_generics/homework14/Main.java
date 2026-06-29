package wrapper_classes_generics.homework14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        Range range = new Range(start, end);
        range.forEach(item -> System.out.print(item + " "));
    }
}

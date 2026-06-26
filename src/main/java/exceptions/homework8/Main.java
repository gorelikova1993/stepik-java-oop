package exceptions.homework8;

import exceptions.homework7.QueueException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stackSize = scanner.nextInt();
        Stack stack = new Stack(stackSize);

        int choice;
        char sim;
        try {
            while (true) {
                choice = scanner.nextInt(); //вводим выбор пользователя
                try {
                    switch (choice) {
                        case 1:
                            sim = scanner.next().charAt(0); //чтение символа
                            stack.push(sim);
                            break;
                        case 2:
                            sim = stack.pop();
                            System.out.println("Извлечено: " + sim);
                            break;
                        case 3:
                            stack.print();
                            break;
                        case 4:
                            stack.clear();
                            break;
                        default:
                            return; //окончание программы
                    }
                } catch (StackException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        } catch (InputMismatchException ex) {
            System.out.println("Некорректный ввод данных");
        }
    }
}

package exceptions.homework7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue queue = new Queue(scan.nextInt()); //вводим размер буфера и создаем очередь

        int choice;
        char sim;
        try {
            while (true) {
                choice = scan.nextInt(); //вводим выбор пользователя
                try {
                    switch (choice) {
                        case 1:
                            sim = scan.next().charAt(0); //чтение символа
                            queue.add(sim);
                            break;
                        case 2:
                            sim = queue.poll();
                            System.out.println("Извлечено: " + sim);
                            break;
                        case 3:
                            queue.print();
                            break;
                        case 4:
                            queue.clear();
                            break;
                        default:
                            return; //окончание программы
                    }
                } catch (QueueException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        } catch (InputMismatchException ex) {
            System.out.println("Некорректный ввод данных");
        }
    }
}

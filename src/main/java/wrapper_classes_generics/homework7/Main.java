package wrapper_classes_generics.homework7;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Student> stack = new Stack<>(10);
        String line = scanner.nextLine();;
        while (!line.equals("Конец")) {
            String[] parts = line.split(" ");
            String surname = parts[0];
            int age = Integer.parseInt(parts[2]);
            double ball = Double.parseDouble(parts[1]);
            Student student = new Student(surname, ball, age);
            try {
                stack.push(student);
            } catch (StackException e) {
                throw new RuntimeException(e);
            }
            line = scanner.nextLine();
        }
        try {
            stack.print();
        } catch (StackException e) {
            System.out.println("Стек пуст");;
        }

    }
}

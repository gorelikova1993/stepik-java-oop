package wrapper_classes_generics.homework6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        List<Student> adults = new ArrayList<>();
        List<Student> minors = new ArrayList<>();
        while (!line.equals("end")) {
            String[] parts = line.split(" ");
            String surname = parts[0];
            int age = Integer.parseInt(parts[2]);
            double ball = Double.parseDouble(parts[1]);
            Student student = new Student(surname, ball, age);
            if (age >= 18 ) {
                adults.add(student);
            } else {
                minors.add(student);
            }
            line = scanner.nextLine();
        }
        if (minors.isEmpty()) {
            System.out.println("Пустой список");
        } else {
            System.out.println(minors.toString());
        }
        if (adults.isEmpty()) {
            System.out.println("Пустой список");
        } else {
            System.out.println(adults.toString());
        }
    }
}

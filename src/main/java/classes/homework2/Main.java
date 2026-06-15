package classes.homework2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Scanner scanner = new Scanner(System.in);
        employee1.surname = scanner.next();
        employee1.gender = scanner.next();
        employee1.age = scanner.nextInt();
        employee1.salary = scanner.nextInt();

        if (employee1.isPensioner()) {
            employee1.changeSalary(0.9);
        }
        employee1.show();
    }
}

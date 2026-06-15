package classes.homework6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrSize = scanner.nextInt();
        if (arrSize < 0) {
            System.out.println("ERROR");
        } else {
            Employee[] arrEmp = new Employee[arrSize];
            for (int i = 0; i < arrSize; i++) {
                String surname = scanner.next();
                String gender = scanner.next();
                int age = scanner.nextInt();
                int salary = scanner.nextInt();
                Employee employee = new Employee(surname, gender, age, salary);
                if (employee.isPensioner()) {
                    employee.setSalary(90000);
                }
                arrEmp[i] = employee;
            }
            for (Employee emp : arrEmp) {
                emp.show();
                System.out.println();
            }
        }
    }
}

package inheritance.homework4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();

        Employee[] employees = new Employee[arrSize];
        for (int i = 0; i < arrSize; i++) {
            int type = scanner.nextInt();
            String surname = scanner.next();
            String gender = scanner.next();
            int age = scanner.nextInt();
            int salary = scanner.nextInt();
            switch (type) {
                case 1:
                    Employee employee = new Employee(surname, gender, age, salary);
                    employees[i] = employee;
                    break;
                case 2:
                    String status = scanner.next();
                    String specialization = scanner.next();
                    Programmer programmer = new Programmer(surname, gender, age, salary, status, specialization);
                    employees[i] = programmer;
                    break;
                case 3:
                    char gruppa = scanner.next().charAt(0);
                    Account account = new Account(surname, gender, age, salary, gruppa);
                    employees[i] = account;
                    break;
            }
        }
        for (Employee emp : employees) {
            emp.show();
        }

        int allSalary = 0;
        int maxSalary = 0;
        for (Employee emp : employees) {
            if (emp.getSalary() > maxSalary) {
                maxSalary = emp.getSalary();
            }
            allSalary += emp.getSalary();
        }
        System.out.println(allSalary);


        for (Employee emp : employees) {
            if (emp.getSalary() == maxSalary) {
                emp.show();
                break;
            }
        }
        System.out.println();
        boolean isExistedFronted = false;
        for (Employee emp : employees) {
            if (emp instanceof Programmer) {
                if (((Programmer) emp).getSpecialization().equals("frontend")) {
                    emp.show();
                    isExistedFronted = true;
                }
            }
        }
        if (!isExistedFronted) {
            System.out.println("NO");
        }

    }
}

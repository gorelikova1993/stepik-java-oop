package classes.homework2;

public class Employee {
    String surname;
    String gender;
    int age;
    int salary;

    public boolean isPensioner() {
        return (gender.equals("female") && age >= 58) || (gender.equals("male") && age >= 63);
    }

    public void changeSalary(double koef) {
        salary = (int) (salary * koef);
    }
    public void show() {
        System.out.printf("%s;%s;%d;%d", surname, gender, age, salary);
    }
}

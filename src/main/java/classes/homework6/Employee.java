package classes.homework6;

public class Employee {
    private String surname;
    private String gender;
    private int age;
    private int salary;

    public Employee() {
    }

    public Employee(String surname, String gender, int age, int salary) {
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isPensioner() {
        return (this.getGender().equals("female") && this.getAge() >= 58) || (this.getGender().equals("male") && this.getAge() >= 63);
    }

    public void changeSalary(double koef) {
        int salary = (int) (this.getSalary() * koef);
        this.setSalary(salary);
    }
    public void show() {
        System.out.printf("%s;%s;%d;%d", this.getSurname(), this.getGender(), this.getAge(), this.getSalary());
    }
}

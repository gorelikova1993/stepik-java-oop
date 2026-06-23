package inheritance.homework4;

public class Account extends Employee{
    private char gruppa;

    public Account(char gruppa) {
        this.gruppa = gruppa;
    }

    public Account(String surname, String gender, int age, int salary, char gruppa) {
        super(surname, gender, age, salary);
        this.gruppa = gruppa;
    }

    public char getGruppa() {
        return gruppa;
    }

    public void setGruppa(char gruppa) {
        this.gruppa = gruppa;
    }

    @Override
    public void show() {
        System.out.printf("%s;%s;%d;%d;%s", this.getSurname(), this.getGender(), this.getAge(), this.getSalary(), gruppa);
        System.out.println();
    }
}

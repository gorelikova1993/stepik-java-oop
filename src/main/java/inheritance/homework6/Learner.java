package inheritance.homework6;

public abstract class Learner {
    private String surname;
    private int grade1;
    private int grade2;

    public Learner(String surname, int grade1, int grade2) {
        this.surname = surname;
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGrade1() {
        return grade1;
    }

    public void setGrade1(int grade1) {
        this.grade1 = grade1;
    }

    public int getGrade2() {
        return grade2;
    }

    public void setGrade2(int grade2) {
        this.grade2 = grade2;
    }

    public Learner() {

    }

    public double averageGrade() {
        return (grade1 + grade2) / 2.0;
    }

    public abstract int holidays();
}

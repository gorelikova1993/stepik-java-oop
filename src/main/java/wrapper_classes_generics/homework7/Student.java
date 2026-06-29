package wrapper_classes_generics.homework7;

public class Student {
    private String surname;
    private double avgBall;
    private int age;

    public Student(String surname, double avgBall, int age) {
        this.surname = surname;
        this.avgBall = avgBall;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getAvgBall() {
        return avgBall;
    }

    public void setAvgBall(double avgBall) {
        this.avgBall = avgBall;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return surname + ";" + avgBall + ";" + age;

    }
}

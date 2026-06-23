package inheritance.homework1;

public class Trial {
    private static int passingGrade;
    private String surname;
    private int ball1;
    private int ball2;

    public Trial(String surname, int ball1, int ball2) {
        this.surname = surname;
        this.ball1 = ball1;
        this.ball2 = ball2;
    }

    public Trial(String surname) {
        this.surname = surname;
        this.ball1 = 0;
        this.ball2 = 0;
    }

    public Trial() {
        this.ball1 = 0;
        this.ball2 = 0;
    }

    public static int getPassingGrade() {
        return passingGrade;
    }

    public static void setPassingGrade(int passingGrade) {
        Trial.passingGrade = passingGrade;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBall1() {
        return ball1;
    }

    public void setBall1(int ball1) {
        this.ball1 = ball1;
    }

    public int getBall2() {
        return ball2;
    }

    public void setBall2(int ball2) {
        this.ball2 = ball2;
    }

    public boolean isPassed() {
        if (ball1 >= passingGrade && ball2 >= passingGrade) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return surname + ";" + ball1 + ";" + ball2;
    }

}

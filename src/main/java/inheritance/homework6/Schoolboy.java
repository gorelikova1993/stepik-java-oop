package inheritance.homework6;

public class Schoolboy extends Learner{
    private String school;
    private String classAtSchool;

    public Schoolboy(String surname, int grade1, int grade2, String school, String classAtSchool) {
        super(surname, grade1, grade2);
        this.school = school;
        this.classAtSchool = classAtSchool;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getClassAtSchool() {
        return classAtSchool;
    }

    public void setClassAtSchool(String classAtSchool) {
        this.classAtSchool = classAtSchool;
    }

    @Override
    public String toString() {
        return super.getSurname() + ";" + super.getGrade1() + ";" +
                super.getGrade2() + ";" + school + ";" + classAtSchool;
    }

    @Override
    public int holidays() {
        return 124;
    }
}

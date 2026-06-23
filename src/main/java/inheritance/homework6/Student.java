package inheritance.homework6;

public class Student extends Learner{
    private String university;
    private String group;
    private static int baseScholarship;

    public Student(String surname, int grade1, int grade2, String university, String group) {
        super(surname, grade1, grade2);
        this.university = university;
        this.group = group;
    }

    public int calculateScholarship(){
        if(averageGrade() >= 9){
            return (int)(baseScholarship * 1.6);
        }else if(averageGrade() >= 8){
            return (int)(baseScholarship * 1.4);
        }else if(averageGrade() >= 6){
            return (int)(baseScholarship * 1.2);
        }else if(averageGrade() >= 5){
            return baseScholarship;
        }else{
            return 0;
        }
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public static int getBaseScholarship() {
        return baseScholarship;
    }

    public static void setBaseScholarship(int baseScholarship) {
        Student.baseScholarship = baseScholarship;
    }

    @Override
    public int holidays() {
        return 74;
    }

    @Override
    public String toString() {
        return super.getSurname() + ";" + super.getGrade1() + ";" +
                super.getGrade2() + ";" + university + ";" + group;
    }
}

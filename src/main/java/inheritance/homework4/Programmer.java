package inheritance.homework4;

public class Programmer extends Employee {
    private String status;
    private String specialization;

    public Programmer(String status, String specialization) {
        this.status = status;
        this.specialization = specialization;
    }

    public Programmer(String surname, String gender, int age, int salary, String status, String specialization) {
        super(surname, gender, age, salary);
        this.status = status;
        this.specialization = specialization;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void show() {
        System.out.printf("%s;%s;%d;%d;%s", this.getSurname(), this.getGender(),
                this.getAge(), this.getSalary(), status);
        System.out.println();
    }

}

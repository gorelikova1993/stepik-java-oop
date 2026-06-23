package inheritance.homework1;

public class LightTrial extends Trial{

    public LightTrial(String surname, int ball1, int ball2) {
        super(surname, ball1, ball2);
    }

    public LightTrial(String surname) {
        super(surname);
    }

    public LightTrial() {
        super();
    }

    @Override
    public boolean isPassed() {
        return super.getBall1() + super.getBall2() >= getPassingGrade();
    }
}

package inheritance.homework1;

public class StrongTrial extends Trial{
    private static int givenTime;
    private int takenTime;

    public StrongTrial(String surname, int ball1, int ball2, int takenTime) {
        super(surname, ball1, ball2);
        this.takenTime = takenTime;
    }

    public StrongTrial(String surname, int takenTime) {
        super(surname);
        this.takenTime = takenTime;
    }

    public StrongTrial(int takenTime) {
        super();
        this.takenTime = takenTime;
    }

    public static int getGivenTime() {
        return givenTime;
    }

    public static void setGivenTime(int givenTime) {
        StrongTrial.givenTime = givenTime;
    }

    @Override
    public boolean isPassed() {
        return super.isPassed() && takenTime <= givenTime;
    }

    @Override
    public String toString() {
        return super.toString() + ";" + takenTime;
    }
}

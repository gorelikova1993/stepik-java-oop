package inheritance.homework1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gradingBall = scanner.nextInt();
        int time = scanner.nextInt();
        int arrSize = scanner.nextInt();

        Trial.setPassingGrade(gradingBall);
        StrongTrial.setGivenTime(time);

        Trial[] trials = new Trial[arrSize];
        for (int i = 0; i < arrSize; i++) {
            int type = scanner.nextInt();
            switch (type) {
                case 1:
                    String surname = scanner.next();
                    int ball1 = scanner.nextInt();
                    int ball2 = scanner.nextInt();
                    Trial trial = new Trial(surname, ball1, ball2);
                    trials[i] = trial;
                    break;
                case 2:
                    String lightSurname = scanner.next();
                    int lightBall1 = scanner.nextInt();
                    int lightBall2 = scanner.nextInt();
                    LightTrial lightTrial = new LightTrial(lightSurname, lightBall1, lightBall2);
                    trials[i] = lightTrial;
                    break;
                case 3:
                    String strongSurname = scanner.next();
                    int strongBall1 = scanner.nextInt();
                    int strongBall2 = scanner.nextInt();
                    int strongTime = scanner.nextInt();
                    StrongTrial strongTrial = new StrongTrial(strongSurname, strongBall1, strongBall2, strongTime);
                    trials[i] = strongTrial;
                    break;
            }
        }

        for (Trial t : trials) {
            System.out.println(t);
        }

        System.out.println();

        for (Trial t : trials) {
            if (t.isPassed()) {
                System.out.println(t);
            }
        }
    }
}

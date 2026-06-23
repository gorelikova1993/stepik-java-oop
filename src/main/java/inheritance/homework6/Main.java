package inheritance.homework6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int scholarship = scanner.nextInt();
        Student.setBaseScholarship(scholarship);

        int arrSize = scanner.nextInt();
        Learner[] learners = new Learner[arrSize];
        for (int i = 0; i < arrSize; i++) {
            int type = scanner.nextInt();
            String surname = scanner.next();
            int grade1 = scanner.nextInt();
            int grade2 = scanner.nextInt();
            String school = scanner.next();
            String group = scanner.next();
            switch (type) {
                case 1:
                    Schoolboy schoolboy = new Schoolboy(surname, grade1, grade2, school, group);
                    learners[i] = schoolboy;
                    break;
                case 2:
                    Student student = new Student(surname, grade1, grade2, school, group);
                    learners[i] = student;
                    break;
            }
        }
        double sumAverage = 0;
        for (Learner learner : learners) {
            sumAverage += learner.averageGrade();
            System.out.println(learner + " каникулы: " + learner.holidays());
        }
        double totalAverage = sumAverage / arrSize;
        System.out.printf("%.1f", totalAverage);
        System.out.println();

        boolean isExisted = false;
        int sumScholarship = 0;
        for (Learner learner : learners) {
            if (learner instanceof Student) {
                int current = ((Student)learner).calculateScholarship();
                sumScholarship += current;
                isExisted = true;
                System.out.println(learner);
            }
        }
        if (isExisted) {
            System.out.println(sumScholarship);
        } else {
            System.out.println("NO");

        }
    }
}

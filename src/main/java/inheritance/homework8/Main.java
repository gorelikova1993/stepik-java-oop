package inheritance.homework8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();
        IShape[] shapes = new IShape[arrSize];

        for (int i = 0; i < arrSize; i++) {
            int type = scanner.nextInt();
            switch (type) {
                case 1:
                    double a = scanner.nextDouble();
                    double b = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(a, b);
                    shapes[i] = rectangle;
                    break;
                case 2:
                    double c = scanner.nextDouble();
                    Cube cube = new Cube(c);
                    shapes[i] = cube;
                    break;
            }
        }
        double max = 0.0;
        for (IShape shape : shapes) {
            if (shape instanceof Rectangle) {
                if (max < shape.computeSquare()) {
                    max = shape.computeSquare();
                }
            }
            System.out.printf("%.2f ", shape.computeSquare());
        }
        System.out.println();
        boolean isExisted = false;
        for (IShape shape : shapes) {
            if (shape instanceof  Rectangle) {
                if (shape.computeSquare() == max) {
                    Rectangle rectangle = (Rectangle) shape;
                    System.out.printf("Прямоугольник сторона 1 = %.1f, сторона 2 = %.1f Площадь = %.2f%n",
                            rectangle.getA(),
                            rectangle.getB(),
                    rectangle.computeSquare());
                    isExisted = true;
                    break;
                }
            }
        }
        if (!isExisted) {
            System.out.println("ERROR");
        }
    }
}

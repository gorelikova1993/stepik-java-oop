package wrapper_classes_generics.homework1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();
        if (expression.contains("+")) {
            int index = expression.indexOf("+");
            try {
                int num1 = Integer.parseInt(expression.substring(0, index));
                int num2 = Integer.parseInt(expression.substring(index + 1));
                int numTotal = num1 + num2;
                System.out.println(num1 + "+" + num2 + "=" + numTotal);

            } catch (RuntimeException e) {
                System.out.println("Error");;
            }
        } else if (expression.contains("-")) {
            int index = expression.indexOf("-");
            try {
                int num1 = Integer.parseInt(expression.substring(0, index));
                int num2 = Integer.parseInt(expression.substring(index + 1));
                int numTotal = num1 - num2;
                System.out.println(num1 + "-" + num2 + "=" + numTotal);

            } catch (RuntimeException e) {
                System.out.println("Error");;
            }
        } else if (expression.contains("*")) {
            int index = expression.indexOf("*");
            try {
                int num1 = Integer.parseInt(expression.substring(0, index));
                int num2 = Integer.parseInt(expression.substring(index + 1));
                int numTotal = num1 * num2;
                System.out.println(num1 + "*" + num2 + "=" + numTotal);

            } catch (RuntimeException e) {
                System.out.println("Error");;
            }
        } else if (expression.contains("/")) {
            int index = expression.indexOf("/");
            try {
                int num1 = Integer.parseInt(expression.substring(0, index));
                int num2 = Integer.parseInt(expression.substring(index + 1));
                int numTotal = num1 / num2;
                System.out.println(num1 + "/" + num2 + "=" + numTotal);

            } catch (RuntimeException e) {
                System.out.println("Error");;
            }
        } else if (expression.contains("%")) {
            int index = expression.indexOf("%");
            try {
                int num1 = Integer.parseInt(expression.substring(0, index));
                int num2 = Integer.parseInt(expression.substring(index + 1));
                int numTotal = num1 % num2;
                System.out.println(num1 + "%" + num2 + "=" + numTotal);

            } catch (RuntimeException e) {
                System.out.println("Error");;
            }
    } else {
            System.out.println("Error");
        }
    }
}

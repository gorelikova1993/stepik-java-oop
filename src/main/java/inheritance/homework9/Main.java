package inheritance.homework9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();
        Transport[] transports = new Transport[arrSize];
        for (int i = 0; i < arrSize; i++) {
            int type = scanner.nextInt();
            double weight = scanner.nextDouble();
            switch (type) {
                case 1:
                    Lorry lorry = new Lorry(weight);
                    transports[i] = lorry;
                    break;
                case 2:
                    Ship ship = new Ship(weight);
                    transports[i] = ship;
                    break;
            }
        }
        double currentWeight = scanner.nextDouble();
        for (Transport transport : transports) {
            if (transport.canCarry(currentWeight)) {
                transport.add(currentWeight);
            }
        }
        for (Transport transport : transports) {
            System.out.println(transport);
        }
    }
}

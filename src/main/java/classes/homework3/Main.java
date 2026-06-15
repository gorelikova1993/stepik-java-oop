package classes.homework3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BusinessTrip businessTrip1 = new BusinessTrip();
        businessTrip1.fi = scanner.nextLine();
        businessTrip1.numberOfDays = scanner.nextInt();
        businessTrip1.transportCost = scanner.nextInt();

        businessTrip1.show();
    }
}

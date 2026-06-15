package classes.homework9;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrSize = scanner.nextInt();
        if (arrSize < 0) {
            System.out.println("ERROR");
        } else {
            BusinessTrip[] businessTrips = new BusinessTrip[arrSize];
            for (int i = 0; i < arrSize - 1;i ++) {
                String fi = scanner.next();
                int days = scanner.nextInt();
                int transportOfCost = scanner.nextInt();
                BusinessTrip businessTrip = new BusinessTrip(fi, transportOfCost, days);
                businessTrips[i] = businessTrip;
            }
            scanner.skip("\n");
            businessTrips[arrSize - 1] = new BusinessTrip(businessTrips[0]);
            String newSurname = scanner.nextLine();
            businessTrips[0].setFi(newSurname);
            for (BusinessTrip trip : businessTrips) {
                System.out.println(trip.toString());
            }
            System.out.println();
            int index = scanner.nextInt();
            for (int i = 0; i < arrSize; i++) {
                if (businessTrips[index].equals(businessTrips[i])) {
                    System.out.println(businessTrips[i].toString());
                }
            }
        }
    }
}

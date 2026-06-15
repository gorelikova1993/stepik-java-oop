package classes.homework7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Thing thing = new Thing("wire", new Material("steel", 7850), 0.03);
        thing.show();
        Scanner scanner = new Scanner(System.in);
        double newVolume = scanner.nextDouble();
        thing.setVolume(newVolume);
        Material copper = new Material("copper", 8500);
        thing.setMaterial(copper);
        thing.show();
    }
}

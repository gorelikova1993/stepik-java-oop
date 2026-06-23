package inheritance.homework5.task2.Demo;

import inheritance.homework5.task2.Library.Bridge;
import inheritance.homework5.task2.Library.SuspensionBridge;
import inheritance.homework5.task2.Library.WaterBridge;

public class Main {
    public static void println(Bridge bridge) {
        System.out.println(bridge.getCarsCount());
    }

    public static void main(String[] args) {
        WaterBridge waterBridge = new WaterBridge();
        SuspensionBridge suspensionBridge = new SuspensionBridge();
        println(waterBridge);
        println(suspensionBridge);
    }
}

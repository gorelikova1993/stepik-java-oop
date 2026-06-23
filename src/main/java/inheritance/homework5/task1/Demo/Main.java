package inheritance.homework5.task1.Demo;

import inheritance.homework5.task1.Elements.Keyboard;
import inheritance.homework5.task1.Elements.Monitor;
import inheritance.homework5.task1.Elements.Mouse;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer(new Keyboard(), new Mouse(), new Monitor());
        computer.show();
    }
}

package inheritance.homework5.task1.Demo;

import inheritance.homework5.task1.Elements.Keyboard;
import inheritance.homework5.task1.Elements.Monitor;
import inheritance.homework5.task1.Elements.Mouse;

public class Computer {
    private Keyboard keyboard;
    private Mouse mouse;
    private Monitor monitor;

    public Computer(Keyboard keyboard, Mouse mouse, Monitor monitor) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public void show() {
        System.out.println(keyboard.getName());
        System.out.println(monitor.getName());
        System.out.println(mouse.getName());
    }
}

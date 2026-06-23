package inheritance.homework5.task1.Elements;

public class Monitor implements CompItem{

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}

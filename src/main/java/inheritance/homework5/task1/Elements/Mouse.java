package inheritance.homework5.task1.Elements;

public class Mouse implements CompItem{
    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}

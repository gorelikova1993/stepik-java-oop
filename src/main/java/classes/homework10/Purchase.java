package classes.homework10;

public class Purchase {
    private Commodity name;
    private int count;

    public Purchase(Commodity name, int count) {
        this.name = name;
        this.count = count;
    }

    public Purchase() {
    }

    @Override
    public String toString() {
        return name.getName() + ";" + name.getCost() + ";" + count + ";" + getCost();
    }

    public int getCost() {
        return name.getCost() * this.count;
    }

    public void show() {
        System.out.println("Наименование товара: " + name.getName());
        System.out.println("Цена товара: " + name.getCost());
        System.out.println("Количество: " + this.count);
        System.out.println("Стоимость покупки: " + getCost());
    }
}

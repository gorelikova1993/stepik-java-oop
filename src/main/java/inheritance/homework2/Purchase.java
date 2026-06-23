package inheritance.homework2;


import java.util.Objects;

public class Purchase {
    private Commodity name;
    private int count;

    public Purchase(Commodity name, int count) {
        this.name = name;
        this.count = count;
    }

    public Purchase(Commodity name) {
        this.name = name;
    }

    public Commodity getName() {
        return name;
    }

    public void setName(Commodity name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Purchase)) return false;
        Purchase purchase = (Purchase) o;
        return Objects.equals(name, purchase.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
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

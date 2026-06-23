package inheritance.homework2;

import java.util.Objects;

public class Commodity {
    private String name;
    private int cost;

    public Commodity(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public Commodity() {
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Commodity commodity = (Commodity) o;
        return cost == commodity.cost && Objects.equals(name, commodity.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost);
    }

    public void show() {
        System.out.println("Наименование товара: " + this.getName());
        System.out.println("Цена товара: " + this.getCost());
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return name + ";" + cost;
    }
}

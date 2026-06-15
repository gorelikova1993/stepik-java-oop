package classes.homework4;

public class Commodity {
    private String name;
    private int cost;

    public Commodity(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public Commodity() {
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
}

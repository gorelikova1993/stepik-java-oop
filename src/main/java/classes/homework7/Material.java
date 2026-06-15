package classes.homework7;

public class Material {
    private String name;
    private int hardness;

    public Material(String name, int hardness) {
        this.name = name;
        this.hardness = hardness;
    }

    public String getName() {
        return name;
    }

    public int getHardness() {
        return hardness;
    }
}

package inheritance.homework9;

public class Lorry implements Transport{
    private double maxWeight;
    private double totalWeight;

    public Lorry(double maxWeight) {
        this.maxWeight = maxWeight;
        this.totalWeight = 0;
    }

    public Lorry(double maxWeight, double totalWeight) {
        this.maxWeight = maxWeight;
        this.totalWeight = totalWeight;
    }

    public Lorry() {
        this.maxWeight = 0;
        this.totalWeight = 0;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }


    @Override
    public boolean canCarry(double weight) {
        if (weight > maxWeight) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void add(double weight) {
        this.totalWeight += weight;
    }

    @Override
    public double getTotalWeight() {
        return totalWeight;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "maxWeight=" + maxWeight +
                ", totalWeight=" + totalWeight +
                '}';
    }
}

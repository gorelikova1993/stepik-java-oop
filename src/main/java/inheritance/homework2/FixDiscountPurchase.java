package inheritance.homework2;

public class FixDiscountPurchase extends Purchase{
    private static double discount;

    public FixDiscountPurchase(Commodity name, int count) {
        super(name, count);
    }

    public FixDiscountPurchase(Commodity name) {
        super(name);
    }

    public FixDiscountPurchase() {
    }

    public static double getDiscount() {
        return discount;
    }

    public static void setDiscount(double discount) {
        FixDiscountPurchase.discount = discount;
    }

    @Override
    public int getCost() {
        int total = (int) (super.getCost() * discount);
        return super.getCost() - total;
    }

    @Override
    public String toString() {
        return super.getName().getName() + ";" + super.getName().getCost() + ";" + super.getCount() + ";" + discount + ";" + getCost();
    }
}

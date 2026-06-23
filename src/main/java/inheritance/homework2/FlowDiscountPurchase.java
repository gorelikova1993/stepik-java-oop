package inheritance.homework2;

public class FlowDiscountPurchase extends Purchase {
    public static double discount;
    public static int minAmount;

    public FlowDiscountPurchase(Commodity name, int count) {
        super(name, count);
    }

    public FlowDiscountPurchase(Commodity name) {
        super(name);
    }

    public FlowDiscountPurchase() {
    }

    public static double getDiscount() {
        return discount;
    }

    public static void setDiscount(double discount) {
        FlowDiscountPurchase.discount = discount;
    }

    public static int getMinAmount() {
        return minAmount;
    }

    public static void setMinAmount(int minAmount) {
        FlowDiscountPurchase.minAmount = minAmount;
    }

    @Override
    public int getCost() {
        if (super.getCount() >= minAmount) {
            int total = (int) (super.getCost() * discount);
            return super.getCost() - total;
        }
        return super.getCost();
    }

    @Override
    public String toString() {
        return super.getName().getName() + ";" + super.getName().getCost() + ";" + super.getCount() + ";" + discount + ";" + minAmount + ";" +getCost();
    }
}

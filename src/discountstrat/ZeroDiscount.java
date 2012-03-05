package discountstrat;

public class ZeroDiscount implements DiscountStrategy {

    private double baseRate;
//    private double price;
//    private double qty;

    @Override
    public double getBaseRate() {
        return baseRate;
    }

    @Override
    public double getDiscountAmt(double qty, double price) {
        return 0;
    }

    @Override
    public double getMinQty() {
        return 0;
    }

    @Override
    public void setMinQty(double minQty) {
    }

    @Override
    public void setBaseRate(double rate) {
        baseRate = rate;
    }

    // add test code
    public static void main(String[] args) {
        DiscountStrategy ds = new ZeroDiscount();
        double discount = ds.getDiscountAmt(5, 1.50);

        if (discount == 0) {
            System.out.println("Winner");
        } else {
            System.out.println("Fail");
        }
    }
}

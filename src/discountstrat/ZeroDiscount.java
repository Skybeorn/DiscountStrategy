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
}
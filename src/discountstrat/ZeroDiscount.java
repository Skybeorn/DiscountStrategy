package discountstrat;

public class ZeroDiscount implements DiscountStrategy {

    private double baseRate;
    private double price;
    private double qty;

    @Override
    public double getRate() {
        return baseRate;
    }

    @Override
    public double getDiscount() {
        return 0;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getQuanitiy() {
        return qty;
    }

    @Override
    public void setRate(double baseRate) {
        this.baseRate = baseRate;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setQuanitiy(double qty) {
        this.qty = qty;
    }
}
package discountstrat;

/**
 *
 * @author Instlogin
 */
public class NoDiscount implements DiscountStrategy {
    private double baseRate;
    private double price;
    private double qty;
    private double min;

    public double getDiscount() {
        return 0;
    }

    public double getRate() {
        return baseRate;
    }

    public void setRate(double baseRate) {
        this.baseRate = baseRate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuanitiy() {
        return qty;
    }

    public void setQuanitiy(double qty) {
        this.qty = qty;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }


    public String toString() {
        return "No Discount";
    }
}
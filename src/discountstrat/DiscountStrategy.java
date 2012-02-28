package discountstrat;

public interface DiscountStrategy {

    double getRate();

    double getDiscount();

    double getMin();

    double getPrice();

    double getQuanitiy();

    void setRate(double baseRate);

    void setMin(double min);

    void setPrice(double price);

    void setQuanitiy(double qty);


}
package discountstrat;

public interface DiscountStrategy {

    double getRate();

    double getDiscount();

    double getPrice();

    double getQuanitiy();

    void setRate(double baseRate);

    void setPrice(double price);

    void setQuanitiy(double qty);


}
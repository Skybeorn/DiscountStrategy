package discountstrat;

public interface DiscountStrategy {

    double getBaseRate();

    double getDiscountAmt(double qty, double price);

    double getMinQty();

    void setMinQty(double minQty);

    void setBaseRate(double baseRate);

//    void setPrice(double price);
//
//    void setQuanitiy(double qty);


}
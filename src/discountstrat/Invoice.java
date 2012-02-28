package discountstrat;


public class Invoice {

    //Cutomer object
    private Customer customer;
    
    //Lineitem Object
    private LineItem[] lineItems = new LineItem[0];

    Invoice(String customerActNo) {
     
    }

    void addLineItem(String productId, double qty) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    


}
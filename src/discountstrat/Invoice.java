package discountstrat;


public class Invoice {

    private Customer customer;
    private LineItem[] lineItems = new LineItem[0];
    
    //Constructor for Invoice
    public Invoice(String customerActNo) {
        customer = this.findCustomer(customerActNo);
        if(customer == null) {
            customer = new Customer("Unknown", "Unknown", "Unknown");
        }
    }

    // NOte the Invoice only knows about Customer and LineItem, thereby
    // minimizing dependencies. Why should the Invoice know about Product?
    // Only the LineItem needs to know that.
    public void addLineItem(String prodId, double qty) {
        LineItem[] temp = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, temp, 0, lineItems.length);
        temp[temp.length-1] = new LineItem(prodId, qty);
        lineItems = temp;
    }

}
package discountstrat;


public class CashRegister {

    private Invoice invoice;

    public void startNewSale(String customerId) {
        invoice = new Invoice(customerId);
    }

    public void addNewLineItem(String productId, double qty) {
        invoice.addLineItem(productId, qty);
    }

    public void displayInvoice() {
        System.out.println(invoice.getInvoiceDataAsString());
    }
}

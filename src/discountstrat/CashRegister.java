package discountstrat;

import DiscountStrategy.Invoice;

public class CashRegister {

    private Invoice invoice;

    public void startNewSale(String customerActNo) {
        invoice = new Invoice(customerActNo);
    }

    public void addNewLineItem(String productId, double qty) {
        invoice.addLineItem(productId, qty);
    }

    public void displayInvoice() {
        System.out.println();
    }
}

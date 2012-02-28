package discountstrat;

import discountstrat.CashRegister;

public class StartDemo {
    public static void main(String[] args) {
        
        //Why do we Create This? What's the SIMPLE idea behind it, not the Advanced concept.
        //This is the CashRegister Object??????
        //By creating this object we are able call it below by doing cr.methodHere
        CashRegister cr = new CashRegister();
        
        //This is the CashRegister object in Motion. We can call it's methods
        //By cr.methodName
        cr.startNewSale("1234");
        cr.addNewLineItem("A100", 2);
        cr.addNewLineItem("B321", 9);
        cr.addNewLineItem("C444", 1);

        cr.displayInvoice();
        

    }
}
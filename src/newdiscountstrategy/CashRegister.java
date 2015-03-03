
package newdiscountstrategy;


public class CashRegister {

    private Receipt receipt;

    public void startSale(String custId) {
        receipt = new Receipt(custId);
    }

    public void addProduct(String prodId, int qty) {
        receipt.addItem(prodId, qty);
    }

    public void endSale() {
        receipt.printReceipt();

    }

}

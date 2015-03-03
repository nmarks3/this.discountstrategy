
package newdiscountstrategy;

public class Receipt {

    private Customer customer;
    private LineItem[] lineItems = new LineItem[0];
    private ReceiptDataAccessStrategy db = new FakeDatabase(); //do not instantiate objects here, should be passed in through startup class
        

    public Receipt(String custId) {
        this.customer = db.findCustomer(custId); 
    }

    public void printReceipt() {
        System.out.println(customer.getName());
        for (LineItem lineItem : lineItems) {
            System.out.println(lineItem.getProdName() + " " + lineItem.getProdPrice());
            System.out.println("Your discount " + lineItem.getDiscount());
            
            // this does work, but it's incomplete
        }
        System.out.println("You've saved: " + getTotalDiscount());
    }

    private double getTotalDiscount() {
        double total = 0;
        for (LineItem item : lineItems) {
            total += item.getDiscount();
        }
        return total;
    }

    public void addItem(String prodId, int qty) {
        LineItem item = new LineItem(findProduct(prodId), qty);
        addItemToArray(item);
    }

    private Product findProduct(String prodId) {
        return db.findProduct(prodId);
    }

    private void addItemToArray(LineItem item) {
        LineItem[] temp = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, temp, 0, lineItems.length);
        temp[lineItems.length] = item;
        lineItems = temp;
    }


}


package newdiscountstrategy;


public class LineItem {

    private Product product; //flexability << could implement interface
    private int qty;

    public LineItem(Product product, int qty) { // should lookup product here
        this.product = product;
        this.qty = qty;
    }

    public int getQty() {
        return qty;
    }

    public double getItemTotal() {
        return product.getDiscountPrice(qty);
    }

    public double getDiscount() {
        return product.getDiscountAmt(qty);
    }

    public Product getProduct() {
        return product;
    }

    public String getProdId() {
        return product.getProdId();
    }

    public String getProdName() {
        return product.getName();
    }

    public double getProdPrice() {
        return product.getPrice();
    }
}

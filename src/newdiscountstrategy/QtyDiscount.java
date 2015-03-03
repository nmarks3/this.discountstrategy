
package newdiscountstrategy;


public class QtyDiscount implements DiscountStrategy {

    private double discountRate = 0.15;
    private double price;
    private int qty;
    private int minQty;

    public QtyDiscount(double price, int minQty) {
        this.minQty = minQty;
    }

    @Override
    public double getDiscountPrice(double price, int qty) {
        return price * qty - getDiscountAmt(price, qty);
    }

    @Override
    public double getDiscountAmt(double price, int qty) {

        if (qty >= getMinQty()) {
            return price * discountRate * qty;
        } else {
            return 0;
        }
    }

    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getMinQty() {
        return minQty;
    }

    public void setMinQty(int minQty) {
        this.minQty = minQty;
    }

}

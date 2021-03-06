
package newdiscountstrategy;


public class PercentDiscount implements DiscountStrategy {

    private double discountRate = 0.10;
    private int qty;

    public PercentDiscount(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public double getDiscountAmt(double price, int qty) {
        return qty * price * discountRate;
    }

    @Override
    public double getDiscountPrice(double price, int qty) {
        return price * qty - getDiscountAmt(price, qty);
    }

    @Override
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

}

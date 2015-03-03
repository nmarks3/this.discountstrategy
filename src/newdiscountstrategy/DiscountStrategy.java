
package newdiscountstrategy;

public interface DiscountStrategy {

    double getDiscountAmt(double price, int qty);

    double getDiscountPrice(double price, int qty);

    double getDiscountRate();

    void setDiscountRate(double discountRate);

}

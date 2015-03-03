
package newdiscountstrategy;


public interface ReceiptDataAccessStrategy {

    Customer findCustomer(String custId);

    Product findProduct(String prodId);

}

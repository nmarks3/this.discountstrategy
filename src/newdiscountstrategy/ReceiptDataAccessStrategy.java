/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newdiscountstrategy;

/**
 *
 * @author sawyer
 */
public interface ReceiptDataAccessStrategy {

    Customer findCustomer(String custId);

    Product findProduct(String prodId);

}

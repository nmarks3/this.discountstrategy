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
public interface DiscountStrategy {

    double getDiscountAmt(double price, int qty);

    double getDiscountPrice(double price, int qty);

    double getDiscountRate();

    void setDiscountRate(double discountRate);

}

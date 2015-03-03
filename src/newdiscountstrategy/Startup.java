
package newdiscountstrategy;


public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CashRegister sale = new CashRegister();
       
        sale.startSale("100");
        sale.addProduct("A101", 5);
        sale.addProduct("B205", 7);
        sale.endSale();
        
        
        
       
        
    }
    
    
    
    
}

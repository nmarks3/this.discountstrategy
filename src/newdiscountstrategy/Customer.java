
package newdiscountstrategy;

public class Customer implements ICustomer {

    private String name;
    private String custId;

    public Customer(String custId, String name) {
        this.name = name;
        this.custId = custId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getCustId() {
        return custId;
    }

    @Override
    public void setCustId(String custId) {
        this.custId = custId;
    }

}

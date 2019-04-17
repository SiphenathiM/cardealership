package ac.za.cput.cardealership.domain;

public class Customer extends Person{

    private int discount;
    private String type;

    public Customer(String id, String firstname, String lastname, String phoneNumber, String address, int discount, String type) {
        super(id, firstname, lastname, phoneNumber, address);
        this.discount = discount;
        this.type = type;
    }

    public int getDiscount() {
        return discount;
    }

    public String getType() {
        return type;
    }
}

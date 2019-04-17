package ac.za.cput.cardealership.domain;

public class Salesperson extends Person {

    private double salary;
    private String position;

    public Salesperson(String id, String firstname, String lastname, String phoneNumber, String address, double salary, String position) {
        super(id, firstname, lastname, phoneNumber, address);
        this.salary = salary;
        this.position = position;
    }
}

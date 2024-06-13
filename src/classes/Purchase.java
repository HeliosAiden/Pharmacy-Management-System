package classes;

public class Purchase {
    private String bar_code;
    private String name;
    private String type;
    public Company company;
    public Drug drug;
    public User customer;
    private int quantity;
    private double amount; // amount = quantity * price
}

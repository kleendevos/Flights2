package be.vdab.Flights;

/**
 * Created by vdabcursist on 07/09/2017.
 */
public class Ticket {
    int id;
    double price;

    public Ticket() {
    }

    public Ticket(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

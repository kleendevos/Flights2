package be.vdab.Flights;

import javax.persistence.*;

/**
 * Created by vdabcursist on 07/09/2017.
 */

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (nullable = false)
    private double price;

    @ManyToOne
    private Passenger passenger;

    @ManyToOne
    private Flight flight;

    public Ticket() {
    }

    public Ticket(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
        passenger.addticket(this);
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }


}

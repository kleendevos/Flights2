package be.vdab.Flights;

import javax.persistence.*;

/**
 * Created by vdabcursist on 07/09/2017.
 */

@Entity
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (unique = true, nullable = false)
    private String number;  //uniek

    @Column (nullable = false)
    private String departure;  // not null
    @Column (nullable = false)
    private String destination;  // not null


    public Flight() {
    }

    public Flight(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", departure='" + departure + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}


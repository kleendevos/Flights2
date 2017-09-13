package be.vdab.Flights;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vdabcursist on 07/09/2017.
 */

@Entity
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    private String firstName;
    private String lastName;
    private int frequentFlyer;
    public String fullName;

    @OneToMany(mappedBy = "passenger")
    private List<Ticket> tickets = new ArrayList<>();

    public Passenger() {
    }

    public Passenger(String firstName, String lastName, int frequentFlyer) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.frequentFlyer = frequentFlyer;
    }

    public Passenger(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getFrequentFlyer() {
        return frequentFlyer;
    }

    public void setFrequentFlyer(int frequentFlyer) {
        this.frequentFlyer = frequentFlyer;
    }

    public String fullName () {

        return getFirstName() + " " + getLastName();
    }

    @Override
    public String toString() {
        return "be.vdab.air.Passenger{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", frequentFlyer=" + frequentFlyer +
                '}';
    }

    public void addticket(Ticket ticket) {
        tickets.add(ticket);
        }
    }


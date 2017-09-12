package be.vdab.Flights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vdabcursist on 12/09/2017.
 */
@Repository //specifieke vorm van Component
public class PassengerRepository {


    private List<String> passengers = new ArrayList<>();

    public PassengerRepository() {
        System.out.println("PassengerRepository wordt aangemaakt");
    }

    public List<String> findAll () {
        List<String> passengers = new ArrayList<>();
        passengers.add("pluto");
        passengers.add("daisy");
        return passengers;
    }

    public Passenger readById (int id) {
        System.out.println("Passenger Id");
        return new Passenger();
    }
}

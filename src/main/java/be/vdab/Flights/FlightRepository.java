package be.vdab.Flights;

import org.springframework.stereotype.Repository;

/**
 * Created by vdabcursist on 12/09/2017.
 */
@Repository
public class FlightRepository {

    private Flightservice flightservice;

    public Flight readById (int id){
        System.out.println("Flight ID");
        return new Flight();
    }

}

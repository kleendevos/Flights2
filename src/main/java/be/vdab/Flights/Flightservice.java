package be.vdab.Flights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by vdabcursist on 12/09/2017.
 */
@Service
public class Flightservice {

    @Autowired
    private FlightRepository flightRepository;

    public Flight findById (int id){
        System.out.println("Flight ID");
        return new Flight();
    }

}

package be.vdab.Flights;

import org.springframework.stereotype.Repository;

/**
 * Created by vdabcursist on 12/09/2017.
 */

@Repository
public class TicketRepository {

    public Ticket persist (Passenger p, double price, Flight f){
        System.out.println ("persist");
        return new Ticket();
    }
}

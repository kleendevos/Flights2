package be.vdab.Flights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by vdabcursist on 12/09/2017.
 */

@Service
public class TicketService {

    @Autowired
    public TicketRepository ticketRepository;

    public Ticket create (Flight f, Passenger p, double price) {
        System.out.println("create ticket");
        return new Ticket();
    }



}

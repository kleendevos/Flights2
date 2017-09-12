package be.vdab.Flights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by vdabcursist on 12/09/2017.
 */
@Service
public class ReservationService {

    @Autowired
    TicketService ticketService;
    @Autowired
    PassengerService passengerService;
    @Autowired
    Flightservice flightservice;


    public Ticket bookTicketForFlight (Passenger p, Flight f){
        System.out.println("Book ticket for" + p + "for Flight" + f);
        ticketService.create(f,p,120);
        return new Ticket();
    }




}

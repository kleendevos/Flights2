package be.vdab.Flights.web.api;

import be.vdab.Flights.Passenger;
import be.vdab.Flights.PassengerRepository;
import be.vdab.Flights.Ticket;
import be.vdab.Flights.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by vdabcursist on 15/09/2017.
 */
@RestController
@RequestMapping ("api/passenger")
public class PassengerRESTcontroller {

    @Autowired
    PassengerRepository passengerRepository;
    TicketRepository ticketRepository;

    @RequestMapping(method = RequestMethod.GET, path = "all", produces = "application/json")
    //@ResponseBody niet nodig want zit al in RESTcontroller
    public List<Passenger> allPassengers(){
        return passengerRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "{pid}", produces = "application/json")
    public Passenger getByid (@PathVariable("pid") int id){
        return passengerRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "{dpid}", produces = "application/json")
    public void deleteByid (@PathVariable ("dpid") int id){
        Passenger passenger = passengerRepository.findOne(id);
        for (Ticket ticket: passenger.getTickets()){
            ticket.setPassenger(null);
            ticketRepository.save(ticket);
        }
        passengerRepository.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/api/passenger", consumes = "application/json", produces = "application/json")
        public ResponseEntity <Passenger> create (@RequestBody Passenger input){
        if (input.getId() != null) {
           return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        passengerRepository.save(input);
        return new ResponseEntity<>(input, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/api/passenger", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Passenger> update (@RequestBody Passenger input){
        if (input.getId() == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        if(!passengerRepository.exists(input.getId())) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        passengerRepository.save(input);
        return new ResponseEntity<>(input, HttpStatus.OK);
    }




}

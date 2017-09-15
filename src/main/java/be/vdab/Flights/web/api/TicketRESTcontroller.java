package be.vdab.Flights.web.api;

import be.vdab.Flights.Ticket;
import be.vdab.Flights.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;



@RestController
public class TicketRESTcontroller {

    @Autowired
    TicketRepository ticketRepository;

    @RequestMapping(method = RequestMethod.GET, path = "/api/ticket/all", produces = "application/json")
    //@ResponseBody niet nodig want zit al in RESTcontroller
    public List<Ticket> allTickets(){
        return ticketRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/api/ticket/{tid}", produces = "application/json")
    public Ticket getByid (@PathVariable ("tid") int id){
        return ticketRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/api/ticket/{dtid}", produces = "application/json")
    public void deleteByid (@PathVariable ("dtid") int id){
        ticketRepository.delete(id);
    }



}

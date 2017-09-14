package be.vdab.Flights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by vdabcursist on 14/09/2017.
 */
@Controller
public class Ticketcontroller {

    @Autowired
    TicketRepository ticketRepository;

    @RequestMapping ("tickets.html")
    public String MyFlightTickts (Map<String, Object> model){

        List<Ticket> tickets = ticketRepository.findAll();
        model.put("flightTickets", tickets);

        return "Ticketlist";
    }

}

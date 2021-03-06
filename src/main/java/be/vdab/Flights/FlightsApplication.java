package be.vdab.Flights;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class FlightsApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(FlightsApplication.class, args);

//		String s = ac.getBean(String.class);
//		System.out.println(s);

		//PassengerService ps = ac.getBean(PassengerService.class);
//		ps.getAll();
//		System.out.println(ps.getAll());

		//ReservationService rs = ac.getBean(ReservationService.class);
//		rs.bookTicketForFlight(new Passenger("Minnie", "Mouse"),new Flight("SN506"));

		PassengerRepository pr = ac.getBean(PassengerRepository.class);
		List<Passenger> passengerList = pr.findAllByOrderByFirstName();
		for (Passenger passenger : passengerList) {
			System.out.println(passenger.getFirstName());
		}

		Passenger p = pr.readByFirstNameOrLastName("Erik", "Erikson");
		System.out.println(p.getFrequentFlyer());

		System.out.println (pr.findAll());

		FlightRepository fr = ac.getBean(FlightRepository.class);
		System.out.println(fr.readBynumber("SN507"));
		System.out.println(fr.readBynumber("SN509"));
		System.out.println(fr.countFlightByDeparture("Brussels"));


//		Passenger p = new Passenger("Minnie", "Mouse");
//		p.setFrequentFlyer(15000);
//		pr.save(p);

//		Passenger p2 = new Passenger("Mickey", "Mouse");
//		p2.setFrequentFlyer(30000);
//		p2.fullName();
//		pr.save(p2);

//		Passenger p3 = new Passenger("Donald", "Duck");
//		p3.setFrequentFlyer(40000);
//		pr.save(p3);

		//pr.deleteById(5);
		//System.out.println(pr.readById(12));

		//FlightRepository fr = ac.getBean(FlightRepository.class);
//		Flight f = new Flight("SN511");
//		f.setDeparture("Brussels");
//		f.setDestination("Copenhagen");
//		fr.save(f);

		TicketRepository tr = ac.getBean(TicketRepository.class);
		System.out.print(tr.findOne(1000));




//		Ticket t = new Ticket(450);
//		t.setPassenger(p2);
//		t.setFlight(f);
//		tr.save(t);

//		Ticket t2 = new Ticket(600);
//		t2.setPassenger(p);
//		t2.setFlight(f);
//		tr.save(t2);












//		PassengerRepository pr = ac.getBean(PassengerRepository.class);
//		pr.findAll();
//		System.out.println(pr.findAll());





	}
}


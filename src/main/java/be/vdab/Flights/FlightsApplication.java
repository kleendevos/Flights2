package be.vdab.Flights;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FlightsApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(FlightsApplication.class, args);

//		String s = ac.getBean(String.class);
//		System.out.println(s);

		PassengerService ps = ac.getBean(PassengerService.class);
		ps.getAll();
		System.out.println(ps.getAll());

		ReservationService rs = ac.getBean(ReservationService.class);
		rs.bookTicketForFlight(new Passenger("Minnie", "Mouse"),new Flight("SN506"));
//		PassengerRepository pr = ac.getBean(PassengerRepository.class);
//		pr.findAll();
//		System.out.println(pr.findAll());





	}
}


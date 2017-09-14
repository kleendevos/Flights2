package be.vdab.Flights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vdabcursist on 12/09/2017.
 */
@Service // maar één passengerservice in je systeem - specifiekere vorm van component
public class PassengerService {

    @Autowired // vervanger van constructor onderaan
    PassengerRepository pr;

//    public PassengerService(PassengerRepository pr) {
//        this.pr = pr;
//        System.out.println("Passenger bean wordt nu aangemaakt");
//    }

//    public List<String> getAll() {
//        System.out.println("get all inside  Passenger Service");
//        return pr.findAll();
//    }

   public Passenger findById (int id){
        System.out.println("Passenger Id");
        return new Passenger();
   }
}

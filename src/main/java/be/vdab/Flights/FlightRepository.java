package be.vdab.Flights;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

/**
 * Created by vdabcursist on 12/09/2017.
 */

public interface FlightRepository extends JpaRepository<Flight,Integer>{

    Flight readBynumber (String flightnumber);
    Flight getByDepartureAndDestination (String departure, String destination);
    Flight findFlightByDeparture (String departure);
    int countFlightByDeparture (String departure);


}
//@Repository
//@Transactional
//public class FlightRepository {
//
//    @PersistenceContext
//    private EntityManager em;
//
//    private Flightservice flightservice;
//
//    public Flight readById (int id){
//        return em.find(Flight.class,id);
//    }
//
//
//    public void save(Flight f) {
//        em.persist(f);
//    }
//
//    public void readById (Flight f){
//        em.find(Flight.class,id);
//    }
//
//    public void deleteById (int id) {
//        Flight f = em.getReference(Flight.class, id);
//        em.remove(f);
//    }
//
//    public void update (Flight f) {
//        em.merge(f);
//    }
//
//    public Flight queryByFlightNumber (String flightnumber){
//       TypedQuery<Flight> f = em.createQuery("select f from Flight f where f.number =:fn ",Flight.class);
//       f.setParameter("fn", flightnumber);
//       return f.getSingleResult();
//    }
//}

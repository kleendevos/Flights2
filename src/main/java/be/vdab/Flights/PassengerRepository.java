package be.vdab.Flights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vdabcursist on 12/09/2017.
 */

public interface PassengerRepository extends JpaRepository <Passenger,Integer>{

    Passenger readByFirstNameOrLastName (String FirstName, String LastName);
    List<Passenger> findAllByOrderByFirstName();

}
//@Repository //specifieke vorm van Component
//@Transactional
//public class PassengerRepository {
//
//    @PersistenceContext
//    private EntityManager em;
//
//
//    private List<String> passengers = new ArrayList<>();
//
//    public PassengerRepository() {
//        System.out.println("PassengerRepository wordt aangemaakt");
//    }
//
//    public List<String> findAll () {
//        List<String> passengers = new ArrayList<>();
//        passengers.add("pluto");
//        passengers.add("daisy");
//        return passengers;
//    }
//
//    public Passenger readById (int id) {
//        return em.find(Passenger.class,id);
//    }
//
//    public void deleteById (int id) {
//        Passenger p = em.getReference(Passenger.class, id);
//        em.remove(p);
//    }
//
//    public void update (Passenger p) {
//        em.merge(p);
//    }
//
//
//    public void save (Passenger p){
//        em.persist(p);
//    }
//
//    public List<Passenger> findAllPassengers(){
//       TypedQuery<Passenger> q = em.createQuery("select p from Passenger p ORDER BY p.firstName", Passenger.class);
//
//       return q.getResultList();
//
//    }
//
//}

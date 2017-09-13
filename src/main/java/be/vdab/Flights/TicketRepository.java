package be.vdab.Flights;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

/**
 * Created by vdabcursist on 12/09/2017.
 */

@Repository
@Transactional
public class TicketRepository {

    @PersistenceContext
    private EntityManager em;

    public Ticket persist (Passenger p, double price, Flight f){
        System.out.println ("persist");
        return new Ticket();
    }

    public void save (Ticket t){
        em.persist(t);
    }

    public void readById (Ticket t){
        em.find(Ticket.class,id);
    }

    public void deleteById (int id) {
        Ticket t = em.getReference(Ticket.class, id);
        em.remove(t);
    }

    public void update (Ticket t) {
        em.merge(t);
    }


}

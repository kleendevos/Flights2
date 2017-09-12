package be.vdab.Flights;

/**
 * Created by vdabcursist on 07/09/2017.
 */
public class Flight {
    Integer id;
    String number;

    public Flight() {
    }

    public Flight(String number) {
        this.number = number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "be.vdab.air.Flight{" +
                "id=" + id +
                ", number='" + number + '\'' +
                '}';
    }
}

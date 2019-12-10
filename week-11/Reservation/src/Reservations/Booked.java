package Reservations;

import java.util.ArrayList;
import java.util.List;

public class Booked {

    private List<Reservation> bookedReservations = new ArrayList<>();

    public Booked() {
    }

    public void add(Reservation newReservation) {
        this.bookedReservations.add(newReservation);
    }

    public void printReservations() {
        for (int i = 0; i < this.bookedReservations.size(); i++) {
            System.out.println(this.bookedReservations.get(i));

        }
    }


}

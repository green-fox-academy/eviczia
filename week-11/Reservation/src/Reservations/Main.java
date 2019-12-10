package Reservations;

public class Main {
    public static void main(String[] args) {

        Booked myReservations = new Booked();
        for (int i = 0; i < 10; i++) {
            myReservations.add(new Reservation());
        }

        myReservations.printReservations();

    }
}

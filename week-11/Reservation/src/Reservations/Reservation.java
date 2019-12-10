package Reservations;

public class Reservation implements Reservationy {

    String bookingCode;
    String bookingDOW;

    public Reservation() {
        this.bookingCode = getCodeBooking();
        this.bookingDOW = getDowBooking();
    }

    @Override
    public String toString() {
        return "Booking# " + bookingCode + " for " + bookingDOW;
    }

    @Override
    public String getDowBooking() {
        String[] dow = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        return dow[(int) (Math.random() * 7)];
    }

    @Override
    public String getCodeBooking() {
        StringBuilder buildCode = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            buildCode.append(getRandomCapitolLetterOrNumber());
        }
        return buildCode.toString();
    }

    public String getRandomCapitolLetterOrNumber() {
        if ((int) (Math.random() * 36) <= 26) {
            return String.valueOf((char) (int) (Math.random() * 26 + 65));
        } else {
            return String.valueOf((char) (int) (Math.random() * 10 + 48));
        }
    }
}

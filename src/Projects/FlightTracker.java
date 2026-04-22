package Projects;

import java.util.ArrayList;

class BookingRecord {
    String passengerName;
    String flightNumber;
    String seatNumber;

    public BookingRecord(String passengerName, String flightNumber, String seatNumber) {
        this.passengerName = passengerName;
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
    }
}

public class FlightTracker {
    private ArrayList<BookingRecord> bookings;

    public FlightTracker() {
        bookings = new ArrayList<BookingRecord>();
    }

    public void bookFlight(String passengerName, String flightNumber, String seatNumber) {
        bookings.add(new BookingRecord(passengerName, flightNumber, seatNumber));
    }

    public void cancelBooking(String passengerName, String flightNumber) {
        for (int i = 0; i < bookings.size(); i++){
            if (bookings.get(i).flightNumber.equals(flightNumber) && bookings.get(i).passengerName.equals(passengerName)){
                bookings.remove(i);
                return;
            }
        }
    }

    public boolean isBooked(String passengerName, String flightNumber) {
        for (int i = 0; i < bookings.size(); i ++){
            if (bookings.get(i).passengerName.equals(passengerName)&& bookings.get(i).flightNumber.equals(flightNumber)) return true;
        }
        return false;
    }

    public int countPassengersOnFlight(String flightNumber) {
        int count = 0;
        for (int i = 0; i < bookings.size(); i ++){
            if (bookings.get(i).flightNumber.equals(flightNumber)){
                count ++;
            }
        }
        return count;
    }

    public int countPassengersInSeatRow(String flightNumber, String rowNumber) {
        int count = 0;
        for (int i = 0; i < bookings.size(); i ++){
            if (bookings.get(i).flightNumber.equals(flightNumber) && bookings.get(i).seatNumber.startsWith(rowNumber)){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        FlightTracker ft = new FlightTracker();

        // Example tests you can run:
         ft.bookFlight("Alice", "QF12", "14A");
         ft.bookFlight("Bob", "QF12", "14C");
         ft.bookFlight("Charlie", "UA840", "22B");
         System.out.println(ft.isBooked("Alice", "QF12"));
         System.out.println(ft.countPassengersOnFlight("QF12"));
         System.out.println(ft.countPassengersInSeatRow("QF12", "14"));
         ft.cancelBooking("Bob", "QF12");
         System.out.println(ft.isBooked("Bob", "QF12"));
    }
}

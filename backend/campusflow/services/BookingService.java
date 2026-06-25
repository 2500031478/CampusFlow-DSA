package backend.campusflow.services;

import java.util.ArrayList;
import java.util.List;
import backend.campusflow.models.Booking;

public class BookingService {

    private List<Booking> bookings = new ArrayList<>();

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public List<Booking> getBookings() {
        return bookings;
    }
}
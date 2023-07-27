package org.java.apartment_booking.reservation;

import java.util.List;

public interface ReservationService {

    List<Reservation> getAllReservations();

    Reservation getReservationById(int reservationId);

    void saveOrUpdateReservation(Reservation reservation);

    void deleteReservation(int reservationId);
}

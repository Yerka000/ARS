package kz.aitu.restpro2422.restpro.services;

import kz.aitu.restpro2422.restpro.entities.Flight;
import kz.aitu.restpro2422.restpro.entities.Passenger;
import kz.aitu.restpro2422.restpro.entities.Reservation;
import kz.aitu.restpro2422.restpro.repositories.FlightRepository;
import kz.aitu.restpro2422.restpro.repositories.PassengerRepository;
import kz.aitu.restpro2422.restpro.repositories.ReservationRepository;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
    private final ReservationRepository reservationRepository;
    private final FlightRepository flightRepository;
    private final PassengerRepository passengerRepository;

    public ReservationService(ReservationRepository reservationRepository, FlightRepository flightRepository, PassengerRepository passengerRepository) {
        this.reservationRepository = reservationRepository;
        this.flightRepository = flightRepository;
        this.passengerRepository = passengerRepository;
    }

    public Reservation bookFlight(Long passengerId, Long flightId) {
        Passenger passenger = passengerRepository.findById(passengerId).orElseThrow();
        Flight flight = flightRepository.findById(flightId).orElseThrow();
        Reservation reservation = new Reservation(passenger, flight);
        return reservationRepository.save(reservation);
    }
}

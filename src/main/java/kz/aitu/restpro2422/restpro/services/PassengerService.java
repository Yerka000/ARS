package kz.aitu.restpro2422.restpro.services;

import kz.aitu.restpro2422.restpro.entities.Passenger;
import kz.aitu.restpro2422.restpro.repositories.PassengerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {
    private final PassengerRepository passengerRepository;

    public PassengerService(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    public List<Passenger> getAllPassengers() {
        return passengerRepository.findAll();
    }

    public Passenger addPassenger(Passenger passenger) {
        return passengerRepository.save(passenger);
    }
}
package kz.aitu.restpro2422.restpro.services;

import kz.aitu.restpro2422.restpro.entities.Flight;
import kz.aitu.restpro2422.restpro.


        repositories.FlightRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FlightService {
    private final FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    public Flight addFlight(Flight flight) {
        return flightRepository.save(flight);
    }
}

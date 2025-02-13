package kz.aitu.restpro2422.restpro.repositories;

import kz.aitu.restpro2422.restpro.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
}


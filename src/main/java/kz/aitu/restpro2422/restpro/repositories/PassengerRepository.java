package kz.aitu.restpro2422.restpro.repositories;

import kz.aitu.restpro2422.restpro.entities.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}

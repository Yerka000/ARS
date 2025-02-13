package kz.aitu.restpro2422.restpro.repositories;

import kz.aitu.restpro2422.restpro.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
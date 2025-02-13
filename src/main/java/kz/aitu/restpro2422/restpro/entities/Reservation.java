package kz.aitu.restpro2422.restpro.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class Reservation extends Entity {
    @ManyToOne
    private Passenger passenger;

    @ManyToOne
    private Flight flight;

    public Reservation(Passenger passenger, Flight flight) {
        this.passenger = passenger;
        this.flight = flight;
        flight.bookSeat();
    }
}


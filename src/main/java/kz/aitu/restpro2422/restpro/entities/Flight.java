package kz.aitu.restpro2422.restpro.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "flights")
public final class Flight extends Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String flightNumber;
    private String origin;
    private String destination;
    private int capacity;
    private int bookedSeats = 0;

    public boolean isAvailable() {
        return bookedSeats < capacity;
    }

    public void bookSeat() {
        if (isAvailable()) {
            bookedSeats++;
        } else {
            throw new IllegalStateException("No seats available.");
        }
    }
}

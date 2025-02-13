package kz.aitu.restpro2422.restpro.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Passenger extends Entity {
    private String name;
    private int age;
    private String passportNumber;
}

package cleanCode.planes;

import lombok.*;

@AllArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public abstract class Plane {
    String model;
    private int maxSpeed;
    private int maxFlightDistance;
    private int maxLoadCapacity;
}
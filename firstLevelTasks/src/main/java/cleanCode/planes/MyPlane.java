package cleanCode.planes;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString
@EqualsAndHashCode(callSuper = true)
@Getter
public class MyPlane extends Plane {
    public MyPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
    }
}
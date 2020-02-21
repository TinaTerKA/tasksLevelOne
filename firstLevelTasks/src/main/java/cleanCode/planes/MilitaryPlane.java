package cleanCode.planes;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import models.MilitaryType;

@Getter
@EqualsAndHashCode(callSuper = true)
@ToString
public class MilitaryPlane extends Plane {
    private MilitaryType type;

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryType type) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
    }
}
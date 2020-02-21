package cleanCode.planes;

import lombok.*;
import models.ClassificationLevel;
import models.ExperimentalTypes;

@ToString
@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
public class ExperimentalPlane extends Plane {
    private ExperimentalTypes type;
    private ClassificationLevel classificationLevel;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalTypes type, ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
        this.classificationLevel = classificationLevel;
    }
}
import Planes.ExperimentalPlane;
import lombok.AllArgsConstructor;
import lombok.ToString;
import models.MilitaryType;
import Planes.MilitaryPlane;
import Planes.PassengerPlane;
import Planes.Plane;

import java.util.*;
import java.util.stream.Collectors;

@ToString
@AllArgsConstructor
public class Airport {
    private List<? extends Plane> planes;

    public List<PassengerPlane> getPassengerPlane() {
        List<PassengerPlane> passengerPlanes = new ArrayList<>();
        for (Plane p : this.planes) {
            if (p instanceof PassengerPlane) {
                passengerPlanes.add((PassengerPlane) p);
            }
        }
        return passengerPlanes;
    }

    public List<MilitaryPlane> getMilitaryPlanes() {
        List<MilitaryPlane> militaryPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof MilitaryPlane) {
                militaryPlanes.add((MilitaryPlane) plane);
            }
        }
        return militaryPlanes;
    }

    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        List<PassengerPlane> passengerPlanes = getPassengerPlane();
        PassengerPlane planeWithMaxCapacity = passengerPlanes.get(0);
        for (PassengerPlane passengerPlane : passengerPlanes) {
            if (passengerPlane.getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity()) {
                planeWithMaxCapacity = passengerPlane;
            }
        }
        return planeWithMaxCapacity;
    }

    public List<MilitaryPlane> getTransportMilitaryPlanes() {
        List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
        for (MilitaryPlane plane : getMilitaryPlanes()) {
            while (plane.getType().equals(MilitaryType.TRANSPORT)) {
                transportMilitaryPlanes.add(plane);
            }
        }
        return transportMilitaryPlanes;
    }

    public List<MilitaryPlane> getBomberMilitaryPlanes() {
        List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
        for (MilitaryPlane plane : getMilitaryPlanes()) {
            if (plane.getType().equals(MilitaryType.BOMBER)) {
                bomberMilitaryPlanes.add(plane);
            }
        }
        return bomberMilitaryPlanes;
    }

    public List<? extends Plane> getExperimentalPlanes() {
        List<ExperimentalPlane> experimentalPlanes = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane instanceof ExperimentalPlane) {
                experimentalPlanes.add((ExperimentalPlane) plane);
            }
        }
        return experimentalPlanes;
    }

    public Airport sortByMaxDistance() {
        planes = planes.stream().sorted(Comparator.comparingInt(Plane::getMaxFlightDistance)).collect(Collectors.toList());
        return this;
    }

    /**
     * Sorts by max speed
     *
     * @return Airport
     */
    public Airport sortByMaxSpeed() {
        planes = planes.stream().sorted(Comparator.comparingInt(Plane::getMaxSpeed)).collect(Collectors.toList());
        return this;
    }

    public Airport sortByMaxLoadCapacity() {
        planes = planes.stream().sorted(Comparator.comparingInt(Plane::getMaxLoadCapacity)).collect(Collectors.toList());
        return this;
    }

    public List<? extends Plane> getPlanes() {
        return planes;
    }
}
package com.av.design.lld;

import java.util.Optional;

public interface ParkingStrategy {
    Optional<ParkingSpot> findParkingSpot(Vehicle vehicle);

}

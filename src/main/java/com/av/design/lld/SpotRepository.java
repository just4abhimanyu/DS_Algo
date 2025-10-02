package com.av.design.lld;

import java.util.Optional;

public interface SpotRepository {
    Optional<ParkingSpot> findNearestAvailableSpot(VehicleType type);
    void occupySpot(String spotId);
    void freeSpot(String spotId);
}

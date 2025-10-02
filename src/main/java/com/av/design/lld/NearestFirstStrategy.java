package com.av.design.lld;

import java.util.Optional;

public class NearestFirstStrategy implements ParkingStrategy {

    private final SpotRepository spotRepo;

    public NearestFirstStrategy(SpotRepository spotRepo) {
        this.spotRepo = spotRepo;
    }


    @Override
    public Optional<ParkingSpot> findParkingSpot(Vehicle vehicle) {
        return spotRepo.findNearestAvailableSpot(vehicle.getVehicleType());
    }
}

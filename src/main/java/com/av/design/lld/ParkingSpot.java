package com.av.design.lld;

public class ParkingSpot {

    private final String id;
    private final SpotType spotType;
    private final int level;
    private final int number;
    private volatile boolean occupied;

    private ParkingSpot(String id, SpotType spotType, int level, int number) {
        this.id = id;
        this.spotType = spotType;
        this.level = level;
        this.number = number;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public String getId() {
        return id;
    }
    public SpotType getSpotType() {
        return spotType;
    }
    public int getLevel() {
        return level;
    }
    public int getNumber() {
        return number;
    }
    public boolean isOccupied() {
        return occupied;
    }
}

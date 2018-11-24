package com.trafficmon;

public abstract class ZoneBoundaryCrossing {

    private final Vehicle vehicle;
    private long time;

    public ZoneBoundaryCrossing(Vehicle vehicle, long time) {
        this.vehicle = vehicle;
        this.time = time;
    }

    public ZoneBoundaryCrossing(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.time = System.currentTimeMillis();
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public long timestamp() {
        return time;
    }

    public void setTimeStamp(long time){
        this.time = time;
    }


}
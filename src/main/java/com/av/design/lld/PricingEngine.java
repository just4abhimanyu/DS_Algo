package com.av.design.lld;

public class PricingEngine {
    public static double compute(Ticket t) {

        long millis = Long.getLong(t.getExitTime()) - Long.getLong(t.getEntryTime());
        long hours = (millis + 3600*1000 - 1) / (3600*1000); // ceil hours
        double rate = PricingPolicy.getRateFor(t.getSpotType());
        return hours * rate;
    }
}

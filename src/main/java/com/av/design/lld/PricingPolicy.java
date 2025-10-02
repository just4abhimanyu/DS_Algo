package com.av.design.lld;

import java.util.HashMap;
import java.util.Map;

public class PricingPolicy {
    private static final Map<SpotType, Double> rateMap = new HashMap<>();
    static {

        rateMap.put(SpotType.MOTORCYCLE, 10.0);   // ₹10/hour
        rateMap.put(SpotType.COMPACT, 20.0);      // ₹20/hour
        rateMap.put(SpotType.LARGE, 30.0);        // ₹30/hour
        rateMap.put(SpotType.HANDICAPPED, 15.0);  // discounted
        rateMap.put(SpotType.EV, 25.0);
    }

    public static double getRateFor(SpotType spotType) {
        return rateMap.getOrDefault(spotType, 20.0);
    }
}

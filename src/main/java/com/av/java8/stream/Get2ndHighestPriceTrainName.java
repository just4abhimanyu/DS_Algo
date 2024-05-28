package com.av.java8.stream;

import com.av.pojo.Train;

import java.util.*;
import java.util.stream.Collectors;

/**
 *  Get the second-highest price and return tran name
 */

public class Get2ndHighestPriceTrainName {
    private static List<Train> getTrains(){
        // Create instances of trains
        List<Train> trains = new ArrayList<>();
        trains.add(new Train("adult", 100));
        trains.add(new Train("child", 50));
        trains.add(new Train("adult", 100));
        trains.add(new Train("adult", 100));
        trains.add(new Train("child", 50));

        return trains;
    }
    public static void main(String[] args) {

        List<Train> trains = getTrains();
        // Group the trains by passenger type
        Map<String, List<Train>> groupedByPassengerType = trains.stream()
                .collect(Collectors.groupingBy(Train::getPassengerType));
        System.out.println("groupedByPassengerType="+groupedByPassengerType);

        // Find the second-highest price for each group
        groupedByPassengerType.forEach((passengerType, trainList) -> {
            Optional<Integer> secondHighestPrice = trainList.stream()
                                                            .map(Train::getPrice)
                                                            .distinct() // Remove duplicates
                                                            .sorted(Comparator.reverseOrder())
                                                            .skip(1) // Skip the highest price
                                                            .findFirst();
            System.out.println("Second highest price for " + passengerType + " train: " +
                    (secondHighestPrice.isPresent() ? secondHighestPrice.get() : "No such price"));
        });
    }
}

package com.av.pojo;

public class Train {
    private String passengerType;
    private int price;

    public Train(String passengerType, int price) {
        this.passengerType = passengerType;
        this.price = price;
    }

    public String getPassengerType() {
        return passengerType;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Train{" +
                "passengerType='" + passengerType + '\'' +
                ", price=" + price +
                '}';
    }
}

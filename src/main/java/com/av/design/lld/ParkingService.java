package com.av.design.lld;

import java.util.Optional;

public class ParkingService {

    private final ParkingStrategy parkingStrategy;
    private final TicketRepository ticketRepository;
    private final SpotRepository spotRepository;
    private final PaymentService paymentService;

    public ParkingService(ParkingStrategy parkingStrategy, TicketRepository ticketRepository, SpotRepository spotRepository, PaymentService paymentServiceFinal) {
        this.parkingStrategy = parkingStrategy;
        this.ticketRepository = ticketRepository;
        this.spotRepository = spotRepository;
        this.paymentService = paymentServiceFinal;
    }
    private final Object lock = new Object();

    public Ticket parkVehicle(Vehicle vehicle) throws Exception {
        synchronized(lock){

            Optional<ParkingSpot> spotOpt = parkingStrategy.findParkingSpot(vehicle);
            if(spotOpt.isEmpty()){
                throw new Exception();
            }

            ParkingSpot spot = spotOpt.get();
            spot.setOccupied(true);
            Ticket ticket = new Ticket("ticketzID", "abc", "123");
            ticket.setSpotId(spot.getId());
            ticket.setTicketStatus(TicketStatus.ACTIVE);
            ticketRepository.save(ticket);
            return ticket;
        }
    }
    public double exitVehicle(String ticketId) throws Exception {
        Ticket ticket = ticketRepository.get(ticketId);

        if (ticket == null || ticket.getTicketStatus() != TicketStatus.ACTIVE) throw new Exception();

        long now = System.currentTimeMillis();
        ticket.setExitTime(String.valueOf(now));
        ticketRepository.save(ticket);
        double amount = PricingEngine.compute(ticket);
        // optionally block spot release until payment processed
        paymentService.charge(ticket, amount);

        ticket.setPayableAmount(amount);
        ticket.setTicketStatus(TicketStatus.PAID);
        spotRepository.freeSpot(ticket.getSpotId());
        ticketRepository.update(ticket);
        return amount;
    }

}

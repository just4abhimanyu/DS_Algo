package com.av.design.lld;

public interface TicketRepository {
    void save(Ticket ticket);

    Ticket get(String ticketId);

    void update(Ticket ticket);
}

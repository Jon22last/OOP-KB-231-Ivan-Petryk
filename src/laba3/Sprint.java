package laba3;
import java.util.*;

class Sprint {
    private final int capacity;
    private final int ticketLimit;
    private final List<Ticket> tickets;

    public Sprint(int capacity, int ticketLimit) {
        this.capacity = capacity;
        this.ticketLimit = ticketLimit;
        this.tickets = new ArrayList<>();
    }

    public boolean addUserStory(UserStory userStory) {
        return addTicket(userStory);
    }

    public boolean addBug(Bug bug) {
        return addTicket(bug);
    }

    private boolean addTicket(Ticket ticket) {
        if (ticket == null || ticket.isCompleted()) return false;
        if (tickets.size() >= ticketLimit) return false;
        if (getTotalEstimate() + ticket.getEstimate() > capacity) return false;
        tickets.add(ticket);
        return true;
    }

    public Ticket[] getTickets() {
        return tickets.toArray(new Ticket[0]);
    }

    public int getTotalEstimate() {
        return tickets.stream().mapToInt(Ticket::getEstimate).sum();
    }
}

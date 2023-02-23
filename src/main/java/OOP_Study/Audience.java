package OOP_Study;

public class Audience {
    private Bag bag;

    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }
}

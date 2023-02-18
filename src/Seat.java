public class Seat implements Comparable<Seat> {
    private String seatNumber;
    private double price;
    private boolean reserved = false;

    public Seat(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public boolean reserve() {
        reserved = true;
        return true;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public boolean isReserved() {
        return reserved;
    }

    public boolean cancel() {
        reserved = false;
        return true;
    }

    @Override
    public int compareTo(Seat seat) {
        return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
    }
}


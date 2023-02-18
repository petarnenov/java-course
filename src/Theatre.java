import java.util.*;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();
    private int seatsPerRow = 0;

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;
        this.seatsPerRow = seatsPerRow;

        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                double price = 12.00;

                if ((row < 'D') && (seatNum >= 4 && seatNum <= 9)) {
                    price = 14.00;
                } else if ((row > 'F') || (seatNum < 4 || seatNum > 9)) {
                    price = 7.00;
                }

                Seat seat = new Seat(row + String.format("%02d", seatNum), price);
                seats.add(seat);
            }
        }

        Collections.sort(seats);
    }

    public boolean reserveSeat(String seatNumber) {
        Seat searchSeat = new Seat(seatNumber, 0);
        int requestedSeat = Collections.binarySearch(seats, searchSeat, null);
        if (requestedSeat >= 0) {
            return seats.get(requestedSeat).reserve();
        } else {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
    }

    public boolean cancelSeat(String seatNumber) {
        Seat searchSeat = new Seat(seatNumber, 0);
        int requestedSeat = Collections.binarySearch(seats, searchSeat, null);
        if (requestedSeat >= 0) {
            return seats.get(requestedSeat).cancel();
        } else {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
    }

    public void getSeats() {
        int currentRow = 0;
        for (Seat seat : seats) {
            System.out.print(seat.isReserved() ? Colors.RED : seat.getPrice() > 7 ? seat.getPrice() > 12 ? Colors.GREEN_BOLD : Colors.GREEN_BRIGHT: Colors.GREEN);
            System.out.printf("%s ", seat.getSeatNumber());
            currentRow++;
            if (currentRow % seatsPerRow == 0) {
                System.out.println();
            }
        }
        System.out.print(Colors.RESET);
        System.out.println();
    }

    public String getTheatreName() {
        return theatreName;
    }
}

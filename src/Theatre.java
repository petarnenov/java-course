import java.util.*;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();
    private int numRows = 0;

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;
        this.numRows = numRows;

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
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = null;
        for (Seat seat : seats) {
            if (seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }

        if (requestedSeat == null) {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }

        return requestedSeat.isReserved() ? false : requestedSeat.reserve();
    }

    public boolean cancelSeat(String seatNumber) {
        Seat requestedSeat = null;
        for (Seat seat : seats) {
            if (seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }

        if (requestedSeat == null) {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }

        return requestedSeat.isReserved() ? requestedSeat.cancel() : false;
    }

    public void getSeats() {
        int currentRow = 0;
        for (Seat seat : seats) {
            System.out.print(seat.isReserved() ? Colors.RED : Colors.GREEN);
            System.out.printf("%s ", seat.getSeatNumber());
            currentRow++;
            if (currentRow % numRows == 0) {
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


public class App {
    public static void main(String[] args) {

        System.out.println("Happy Coding!");

        Theatre national = new Theatre("National", 8, 12);
        national.reserveSeat("E01");
        national.getSeats();
        national.cancelSeat("E01");
        national.getSeats();
    }
}

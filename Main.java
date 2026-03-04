class Screening {
    String movieName;
    String showtime;
    int screenNumber;
    int availableSeats;

    Screening(String movieName, String showtime, int screenNumber, int availableSeats) {
        this.movieName = movieName;
        this.showtime = showtime;
        this.screenNumber = screenNumber;
        this.availableSeats = availableSeats;
    }

    void bookTickets(int count) {
        if (count <= availableSeats) {
            availableSeats -= count;
            System.out.println(count + " tickets booked for " + movieName);
        } else {
            System.out.println("Not enough seats for " + movieName);
        }
    }

    void cancelBooking(int count) {
        availableSeats += count;
        System.out.println(count + " tickets cancelled for " + movieName);
    }

    void display() {
        System.out.println("Movie: " + movieName);
        System.out.println("Showtime: " + showtime);
        System.out.println("Screen: " + screenNumber);
        System.out.println("Available Seats: " + availableSeats);
        System.out.println("----------------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        Screening s1 = new Screening("Pushpa2", "7PM", 1, 100);
        Screening s2 = new Screening("Salaar", "8PM", 2, 80);

        s1.bookTickets(5);
        s1.bookTickets(3);
        s2.bookTickets(10);

        s1.cancelBooking(2);

        s1.display();
        s2.display();
    }
}

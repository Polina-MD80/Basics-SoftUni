import java.util.Scanner;

public
class CinemaTickets {
    public static
    void main (String[] args) {
        Scanner scanner      = new Scanner (System.in);
        String  movie        = scanner.nextLine ();
        int     totalTickets = 0;
        int     totalFree    = 0;

        int    student  = 0;
        int    standard = 0;
        int    kid      = 0;
        double percent  = 0;


        while (!movie.equals ("Finish")) {
            int freeSeatsPerMovie = Integer.parseInt (scanner.nextLine ());
            totalFree = totalFree + freeSeatsPerMovie;
            String typeOfTicket   = scanner.nextLine ();
            int    ticketPerMovie = 0;
            while (!typeOfTicket.equals ("End")) {

                if (typeOfTicket.equals ("student")) {
                    student++;
                } else if (typeOfTicket.equals ("standard")) {
                    standard++;
                } else if (typeOfTicket.equals ("kid")) {
                    kid++;
                }
                ticketPerMovie++;
                totalTickets++;
                if (ticketPerMovie == freeSeatsPerMovie) {
                    break;
                }

                typeOfTicket = scanner.nextLine ();
            }


            percent = 100.0 * ticketPerMovie / freeSeatsPerMovie;
            System.out.printf ("%s - %.2f%% full.%n", movie, percent);


            movie = scanner.nextLine ();
        }
        System.out.printf ("Total tickets: %d%n", totalTickets);
        System.out.printf ("%.2f%% student tickets.%n", 100.0 * student / totalTickets);
        System.out.printf ("%.2f%% standard tickets.%n", 100.0 * standard / totalTickets);
        System.out.printf ("%.2f%% kids tickets.%n", 100.0 * kid / totalTickets);
    }
}
import java.util.Scanner;

public
class VacationBooksList {
    public static
    void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        int totalPages   = Integer.parseInt (scanner.nextLine ());
        int pagesPerHour = Integer.parseInt (scanner.nextLine ());
        int day          = Integer.parseInt (scanner.nextLine ());

        int hoursPerDay = (totalPages / pagesPerHour) / day;

        System.out.println (hoursPerDay);
    }
}

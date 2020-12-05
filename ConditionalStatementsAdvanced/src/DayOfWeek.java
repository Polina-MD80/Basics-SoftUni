import java.util.Scanner;

public
class DayOfWeek {
    public static
    void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int     input   = Integer.parseInt (scanner.nextLine ());
        if (input == 1) {
            System.out.println ("Monday");
        } else if (input == 2) {
            System.out.println ("Tuesday");
        } else if (input == 3) {
            System.out.println ("Wednesday");
        } else if (input == 4) {
            System.out.println ("Thursday");
        } else if (input == 5) {
            System.out.println ("Friday");
        } else if (input == 6) {
            System.out.println ("Saturday");
        } else if (input == 7) {
            System.out.println ("Sunday");
        } else   {
            System.out.println ("Error");
        }
    }
}

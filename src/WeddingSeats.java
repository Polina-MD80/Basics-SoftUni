import java.util.Scanner;

public
class WeddingSeats {
    public static
    void main (String[] args) {
        Scanner scanner       = new Scanner (System.in);
        char    maxSector     = scanner.nextLine ().charAt (0);
        int     rowsInSectorA = Integer.parseInt (scanner.nextLine ());
        int     seatsInOddRow = Integer.parseInt (scanner.nextLine ());
        int     count         = 0;
        int total=0;

        for (char i = 'A'; i <= maxSector; i++) {
            count++;
            for (int j = 1; j < rowsInSectorA + count; j++) {
                for (char k = 'a'; k < 'a' + seatsInOddRow + 2; k++) {
                    boolean x  = j % 2 != 0;
                    boolean x1 = k < 'a' + seatsInOddRow;
                    boolean y  = j % 2 == 0;
                    boolean y1 = k < 'a' + seatsInOddRow + 2;
                    if ((x && x1) || (y && y1)) {
                        total++;


                        System.out.printf ("%c%d%c%n", i, j, k);
                    }

                }

            }

        }
        System.out.println (total);

    }
}


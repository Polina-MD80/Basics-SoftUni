import java.util.Scanner;

public
class SumOfTwoNumbers {
    public static
    void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int     first   = Integer.parseInt (scanner.nextLine ());
        int     second  = Integer.parseInt (scanner.nextLine ());
        int     magic   = Integer.parseInt (scanner.nextLine ());
        int     counter = 0;
        boolean isFound = false;
        for (int i = first; i <= second; i++) {
            for (int j = first; j <= second; j++) {
                counter++;
                if (i + j == magic) {
                    isFound = true;
                    System.out.printf ("Combination N:%d (%d + %d = %d)", counter, i, j, magic);
                    break;
                }

            }
            if (isFound) {
                break;
            }

        }if (!isFound){
            System.out.printf ("%d combinations - neither equals %d", counter, magic);
        }
    }
}

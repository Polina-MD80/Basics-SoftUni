import java.util.Scanner;

public
class SpecialNumber {
    public static
    void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int     n       = Integer.parseInt (scanner.nextLine ());


        for (int i = 1111; i <= 9999; i++) {
            String number = "" + i;
            int count = 0;

            for (int j = 0; j < number.length (); j++) {
                int digit = Integer.parseInt ("" + number.charAt (j));
                if (digit != 0) {

                    if (n % digit == 0) {
                        count++;
                        if (count == 4) {
                            System.out.print (i + " ");
                        }
                    }


                }

            }
        }
    }
}


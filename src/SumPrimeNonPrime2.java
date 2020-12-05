import java.util.Scanner;

public
class SumPrimeNonPrime2 {
    public static
    void main (String[] args) {
        Scanner scanner     = new Scanner (System.in);
        String  command     = scanner.nextLine ();
        int     primeSum    = 0;
        int     nonPrimeSum = 0;

        while (!command.equals ("stop")) {
            boolean nonPrime = false;
            int count  = 0;
            int number = Integer.parseInt (command);
            if (number < 0) {
                System.out.println ("Number is negative.");
                command = scanner.nextLine ();
                continue;
            }
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    count++;
                }

                if (count == 2) {
                    nonPrimeSum += number;
                    nonPrime = true;
                    break;

                }
            }
            if (!nonPrime) {
                primeSum += number;
            }
            command= scanner.nextLine ();
        }
        System.out.printf ("Sum of all prime numbers is: %d%n", primeSum);
        System.out.printf ("Sum of all non prime numbers is: %d", nonPrimeSum);

    }
}


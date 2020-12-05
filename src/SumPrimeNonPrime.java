import java.util.Scanner;

public
class SumPrimeNonPrime {
    public static
    void main (String[] args) {
        Scanner scanner     = new Scanner (System.in);
        String  command     = scanner.nextLine ();
        int     primeSum    = 0;
        int     nonPrimeSum = 0;

        while (!command.equals ("stop")) {
            int     number   = Integer.parseInt (command);
            boolean nonPrime = false;

            if (number < 0) {
                System.out.println ("Number is negative.");
            } else if (number == 1 || number == 0 || number == 3) {
                primeSum += number;

            } else {
                for (int i = 2; i <= number / 2; i++) {
                    if (number % i == 0) {
                        nonPrime = true;
                        break;
                    }
                }
                if (nonPrime) {
                    nonPrimeSum+=number;

                }else {
                    primeSum+=number;
                }
            }
            command = scanner.nextLine ();


        }
        System.out.printf ("Sum of all prime numbers is: %d%n", primeSum);
        System.out.printf ("Sum of all non prime numbers is: %d", nonPrimeSum);
    }
}


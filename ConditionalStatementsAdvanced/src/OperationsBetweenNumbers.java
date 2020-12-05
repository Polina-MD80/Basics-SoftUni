import java.util.Scanner;

public
class OperationsBetweenNumbers {
    public static
    void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        int    n1        = Integer.parseInt (scanner.nextLine ());
        int    n2        = Integer.parseInt (scanner.nextLine ());
        char   operator  = scanner.nextLine ().charAt (0);
        String evenOrOdd = "";
        int    result    = 0;
        double result1   = 0;

        if (operator == '+' || operator == '-' || operator == '*') {
            if (operator == '+') {
                result = n1 + n2;
            } else if (operator == '-') {
                result = n1 - n2;
            } else {
                result = n1 * n2;
            }
            if (result % 2 == 0) {
                evenOrOdd = "even";
            } else {
                evenOrOdd = "odd";
            }
            System.out.printf ("%d %c %d = %d - %s", n1, operator, n2, result, evenOrOdd);
        }
        if (n2 == 0 && ((operator == '/') || (operator == '%'))) {
            System.out.printf ("Cannot divide %d by zero", n1);
        } else if (operator == '%') {
            result = n1 % n2;
            System.out.printf ("%d %c %d = %d", n1, operator, n2, result);
        } else if (operator == '/') {
            result1 = 1.0 * n1 / n2;
            System.out.printf ("%d %c %d = %.2f", n1, operator, n2, result1);

        }

    }
}

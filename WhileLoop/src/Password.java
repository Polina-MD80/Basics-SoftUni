import java.util.Scanner;

public
class Password {
    public static
    void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        String username = scanner.nextLine ();
        String pass = scanner.nextLine ();
        String input = scanner.nextLine ();
        while (!input.equals (pass)){
            input = scanner.nextLine ();
        }
        System.out.printf ("Welcome %s!", username);
    }
}

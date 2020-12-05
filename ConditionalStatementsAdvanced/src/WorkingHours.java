import java.util.Scanner;

public
class WorkingHours {
    public static
    void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int time = Integer.parseInt (scanner.nextLine ());
        String day = scanner.nextLine ();

        if ((time > 18)||(time<10)||day.equals ("Sunday")) {
            System.out.println ("closed");
        }else {
            System.out.println ("open");
        }
    }
}

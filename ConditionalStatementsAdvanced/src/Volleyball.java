import java.util.Scanner;

public
class Volleyball {
    public static
    void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        String year = scanner.nextLine ();
        int hollyDay = Integer.parseInt (scanner.nextLine ());
        int weekendAway = Integer.parseInt (scanner.nextLine ());
        int weekendSofia = 48-weekendAway;
        double volleySofia =weekendSofia * 3.0/4 + hollyDay*2.0/3;
        double volley = (double) weekendAway + volleySofia;
        if (year.equals ("normal")){
            System.out.println (Math.floor (volley));
        }if (year.equals ("leap")) {
            System.out.println (Math.floor (volley*1.15));
        }
    }
}

import java.util.Scanner;

public
class OnTimeForExam {
    public static
    void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        int examHour = Integer.parseInt (scanner.nextLine ());
        int examMin  = Integer.parseInt (scanner.nextLine ());
        int arrHour  = Integer.parseInt (scanner.nextLine ());
        int arrMin   = Integer.parseInt (scanner.nextLine ());

        int examTime = examHour * 60 + examMin;
        int arrTime  = arrHour * 60 + arrMin;
        int diffMin  = examTime - arrTime;
        int h = diffMin/60;
        int m = diffMin%60;

        if (diffMin > 0 && diffMin <= 30) {
            System.out.printf ("On time%n%d minutes before the start", m);

        } else if (diffMin == 0) {
            System.out.println ("On time");

        } else if (diffMin > 30) {
            if (h==0) {
                System.out.printf ("Early%n%d minutes before the start",m);
            }else if (m<=9) {
                System.out.printf ("Early%n%d:0%d hours before the start", h, m);
            }else {
                System.out.printf ("Early%n%d:%d hours before the start",h,m);}

        } else if (diffMin < 0) {
            if (h==0) {
                System.out.printf ("Late%n%d minutes after the start",Math.abs (m));
            }else if (Math.abs (m)<=9) {
                System.out.printf ("Late%n%d:0%d hours after the start", Math.abs (h), Math.abs (m));
            }else {
                System.out.printf ("Late%n%d:%d hours after the start", Math.abs (h), Math.abs (m));}
        }
    }
}
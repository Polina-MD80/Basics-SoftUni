import java.util.Scanner;

public
class FishTank {
    public static
    void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int length = Integer.parseInt (scanner.nextLine ());
        int width = Integer.parseInt (scanner.nextLine ());
        int height = Integer.parseInt (scanner.nextLine ());
        double percentage = Double.parseDouble (scanner.nextLine ());
        double waterVolume = (length*width*height*(1-percentage/100))/1000;
        System.out.printf ("%.2f",waterVolume);
    }
}

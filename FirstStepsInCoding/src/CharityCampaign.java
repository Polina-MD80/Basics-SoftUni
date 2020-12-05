import java.util.Scanner;

public
class CharityCampaign {
    public static
    void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int day = Integer.parseInt (scanner.nextLine ());
        int chefs = Integer.parseInt (scanner.nextLine ());
        int cakes = Integer.parseInt (scanner.nextLine ());
        int goff = Integer.parseInt (scanner.nextLine ());
        int pancakes = Integer.parseInt (scanner.nextLine ());
        double totalMoney = day*chefs*(cakes*45+goff*5.80+pancakes*3.20);
        System.out.printf ("%.2f",totalMoney-totalMoney/8);
    }
}

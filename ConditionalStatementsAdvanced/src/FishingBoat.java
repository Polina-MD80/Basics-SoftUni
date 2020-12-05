import java.util.Scanner;

public
class FishingBoat {
    public static
    void main (String[] args) {
        Scanner scanner        = new Scanner (System.in);
        int     budget         = Integer.parseInt (scanner.nextLine ());
        String  season         = scanner.nextLine ();
        int     fishers        = Integer.parseInt (scanner.nextLine ());
        boolean even           = fishers % 2 == 0;
        double  pricePerSeason = 0;
        double  price          = 0;
        double  evenDiscount   = 1;
        if (even) {
            evenDiscount = 0.95;

        }
        if (season.equals ("Autumn")) {
            pricePerSeason = 4200;
            if (fishers <= 6) {
                price = pricePerSeason * 0.9;
            } else if (fishers <= 11) {
                price = pricePerSeason * 0.85;

            } else {
                price = pricePerSeason * 0.75;
            }
        } else if (season.equals ("Summer")) {
            pricePerSeason = 4200;
            if (fishers <= 6) {
                price = pricePerSeason * 0.9 * evenDiscount;
            } else if (fishers <= 11) {
                price = pricePerSeason * 0.85 * evenDiscount;

            } else {
                price = pricePerSeason * 0.75 * evenDiscount;
            }
        } else if (season.equals ("Spring")) {
            pricePerSeason = 3000;
            if (fishers <= 6) {
                price = pricePerSeason * 0.9 * evenDiscount;
            } else if (fishers <= 11) {
                price = pricePerSeason * 0.85 * evenDiscount;

            } else {
                price = pricePerSeason * 0.75 * evenDiscount;
            }
        } else if (season.equals ("Winter")) {
            pricePerSeason = 2600;
            if (fishers <= 6) {
                price = pricePerSeason * 0.9 * evenDiscount;
            } else if (fishers <= 11) {
                price = pricePerSeason * 0.85 * evenDiscount;

            } else {
                price = pricePerSeason * 0.75 * evenDiscount;
            }
        }
        double diff = budget - price;
        if (diff >= 0) {
            System.out.printf ("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf ("Not enough money! You need %.2f leva.", Math.abs (diff));
        }
    }
}
import java.util.Scanner;

public
class Journey {
    public static
    void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        double budget = Double.parseDouble (scanner.nextLine ());
        String season = scanner.nextLine ();
        String accommodation = "";
        String where = "";
        double percent = 0;
        double moneySpent=0;
        if (season.equals ("summer")) {
            accommodation = "Camp";

        }else if (season.equals ("winter")) {
            accommodation= "Hotel";
        }
        if (budget>1000) {
            where = "Europe";
            percent = 0.9;
            accommodation = "Hotel";
        }else if (budget<=100) {
            where = "Bulgaria";
            if (season.equals ("summer")) {
                percent=0.3;
            }else if (season.equals ("winter")){
                percent = 0.7;
            }
        }else {
            where = "Balkans";
            if (season.equals ("summer")) {
                percent=0.4;
            }else if (season.equals ("winter")){
                percent = 0.8;
            }
        }

        moneySpent = percent*budget;
        System.out.printf ("Somewhere in %s%n%s - %.2f", where,accommodation,moneySpent);
    }
}

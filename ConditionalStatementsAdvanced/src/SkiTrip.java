import java.util.Scanner;

public
class SkiTrip {
    public static
    void main (String[] args) {
        Scanner scanner               = new Scanner (System.in);
        int     days                  = Integer.parseInt (scanner.nextLine ());
        String  roomSize              = scanner.nextLine ();
        String  evaluation            = scanner.nextLine ();
        double  pricePerNight         = 0;
        double  discountPerEvaluation = 0;
        int     nights                = days - 1;

        switch (roomSize) {
            case "room for one person":
                pricePerNight = 18;
                break;
            case "apartment":

                if (nights < 10) {
                    pricePerNight = 25 - 25 * 0.3;
                } else if (nights <= 15) {
                    pricePerNight = 25 - 25 * 0.35;
                } else {
                    pricePerNight = 25 - 25 * 0.5;
                }


                break;
            case "president apartment":
                if (nights < 10) {
                    pricePerNight = 35 - 35 * 0.1;
                } else if (nights <= 15) {
                    pricePerNight = 35 - 35 * 0.15;
                } else {
                    pricePerNight = 35 - 35 * 0.2;
                }
                break;
        }
        if (evaluation.equals ("positive")) {
            System.out.printf ("%.2f", nights * pricePerNight * 1.25);
        } else if (evaluation.equals ("negative")) {
            System.out.printf ("%.2f", nights * pricePerNight * 0.9);
        }

    }
}
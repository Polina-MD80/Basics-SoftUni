import java.util.Scanner;

public
class SummerOutfit {
    public static
    void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int t = Integer.parseInt (scanner.nextLine ());
        String timeOfDay = scanner.nextLine ();
        String outfit = "";
        String shoes = "";
        if (timeOfDay.equals ("Morning")) {
            if (t>=10&&t<=18) {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            }else if (t>18&&t<=24) {
                outfit= "Shirt";
                shoes= "Moccasins";
            }else if (t>=25) {
                outfit= "T-Shirt";
                shoes= "Sandals";
            }
        }else if (timeOfDay.equals ("Afternoon")) {
            if (t>=10&&t<=18) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }else if (t>18&&t<=24) {
                outfit= "T-Shirt";
                shoes= "Sandals";
            }else if (t>=25) {
                outfit= "Swim Suit";
                shoes= "Barefoot";
            }

        }else if (timeOfDay.equals ("Evening")) {
            if (t>=10&&t<=18) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }else if (t>18&&t<=24) {
                outfit= "Shirt";
                shoes= "Moccasins";
            }else if (t>=25) {
                outfit= "Shirt";
                shoes= "Moccasins";
            }

        }
        System.out.printf ("It's %d degrees, get your %s and %s.", t, outfit, shoes);
    }
}

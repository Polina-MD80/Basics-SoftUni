import java.util.Scanner;

public
class FruitMarket {
    public static
    void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        double strawPrice= Double.parseDouble (scanner.nextLine ());
        double bananaKg = Double.parseDouble (scanner.nextLine ());
        double orangeKg = Double.parseDouble (scanner.nextLine ());
        double raspKg = Double.parseDouble (scanner.nextLine ());
        double strawKg = Double.parseDouble (scanner.nextLine ());

        double raspPrice = strawPrice*0.5;
        double orangePrice = raspPrice*0.6;
        double bananaPrice = raspPrice*0.2;

        double totalPrise = strawKg*strawPrice+bananaKg*bananaPrice+orangeKg*orangePrice+raspKg*raspPrice;
        System.out.printf ("%.2f",totalPrise);
    }
}

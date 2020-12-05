import java.util.Scanner;

public
class Travelling {
    public static
    void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        String country = scanner.nextLine ();

        while (!country.equals ("End")){
            double neededMoney = Double.parseDouble (scanner.nextLine ());
            while (neededMoney>0){
                double savedMoney = Double.parseDouble (scanner.nextLine ());
                neededMoney -= savedMoney;
            }
            System.out.printf ("Going to %s!%n",country);
            country = scanner.nextLine ();
        }
    }
}

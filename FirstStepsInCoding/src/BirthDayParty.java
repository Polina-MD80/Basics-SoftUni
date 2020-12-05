import java.util.Scanner;

public
class BirthDayParty {
    public static
    void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int hireHall = Integer.parseInt (scanner.nextLine ());
        double cake = hireHall*0.2;
        double beverages = cake*0.55;
        double animator = hireHall/3.0;
        double totalPrice = hireHall+beverages+cake+animator;
        System.out.println (totalPrice);
    }
}

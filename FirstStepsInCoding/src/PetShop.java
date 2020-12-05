import java.util.Scanner;

public
class PetShop {
    public static
    void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int dogs = Integer.parseInt (scanner.nextLine ());
        int pet = Integer.parseInt (scanner.nextLine ());
        double totalFoodPrice = dogs*2.5 + pet*4.0;
        System.out.println (totalFoodPrice+" lv.");
    }
}

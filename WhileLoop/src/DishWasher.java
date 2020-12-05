import java.util.Scanner;

public
class DishWasher {
    public static
    void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int bottles = Integer.parseInt (scanner.nextLine ());
        int mlLitres = bottles*750;
        String dishes = scanner.nextLine ();
        int count = 0;
        int countDishes = 0;
        int countPots = 0;

        while (!dishes.equals ("End")){
            int number = Integer.parseInt (dishes);
            count++;
            if (count%3==0){
                countPots+=number;
                mlLitres=mlLitres-number*15;
            }else {
                countDishes+=number;
                mlLitres = mlLitres - number*5;
            }
            if (mlLitres<0){
                System.out.printf ("Not enough detergent, %d ml. " +
                                   "more necessary!", Math.abs (mlLitres));break;
            }
            dishes=scanner.nextLine ();

        }if (dishes.equals ("End")){
            System.out.println ("Detergent was enough!");
            System.out.printf ("%d dishes and %d pots were washed.%n",
                    countDishes,countPots);
            System.out.printf ("Leftover detergent %d ml.",mlLitres);
        }
    }
}

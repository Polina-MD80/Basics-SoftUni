import java.util.Scanner;

public
class ToyShop {
    public static
    void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        double holidayPrice = Double.parseDouble (scanner.nextLine ());
        int puzzel = Integer.parseInt (scanner.nextLine ());
        int doll = Integer.parseInt (scanner.nextLine ());
        int teddyBear = Integer.parseInt (scanner.nextLine ());
        int minion = Integer.parseInt (scanner.nextLine ());
        int lorry = Integer.parseInt (scanner.nextLine ());
        int count = puzzel+doll+teddyBear+minion+lorry;
        double totalSum = puzzel*2.6+doll*3+teddyBear*4.1+minion*8.2+lorry*2;
        if (count>=50){
            totalSum=totalSum*0.75;
        }
        double restSum = totalSum*0.9;
        if (restSum>=holidayPrice){
            System.out.printf ("Yes! %.2f lv left.", restSum-holidayPrice);
        }else{
            System.out.printf ("Not enough money! %.2f lv needed.", holidayPrice-restSum);
        }
    }
}

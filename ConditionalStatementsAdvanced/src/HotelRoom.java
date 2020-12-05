import java.util.Scanner;

public
class HotelRoom {
    public static
    void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        String month  = scanner.nextLine ();
        int    nights = Integer.parseInt (scanner.nextLine ());

        double priceAppPerNight    = 0;
        double priceStudioPerNight = 0;
        double priceStudio=0;
        double priceApp=0;


        if (month.equals ("May") || month.equals ("October")) {
            priceStudioPerNight = 50;
            priceAppPerNight = 65;
            priceStudio=priceStudioPerNight*nights;
            priceApp =priceAppPerNight*nights;

            if (nights>7&&nights<=14) {
                priceStudio = priceStudio*0.95;
            }else if (nights>14){
                priceStudio = priceStudio*0.7;
                priceApp = priceApp*0.90;
            }


        } else if (month.equals ("June") || month.equals ("September")) {
            priceStudioPerNight= 75.20;
            priceAppPerNight = 68.70;
            priceStudio=priceStudioPerNight*nights;
            priceApp =priceAppPerNight*nights;
            if (nights>14){
                priceStudio = priceStudio*0.8;
                priceApp = priceApp*0.9;
            }

        } else if (month.equals ("July") || month.equals ("August")) {
            priceStudioPerNight = 76;
            priceAppPerNight = 77;
            priceStudio=priceStudioPerNight*nights;
            priceApp =priceAppPerNight*nights;
            if (nights>14){
                priceApp = priceApp*0.9;
            }

        }
        System.out.printf ("Apartment: %.2f lv.%nStudio: %.2f lv.", priceApp,priceStudio);
    }
}

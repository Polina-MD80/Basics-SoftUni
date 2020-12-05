import java.util.Scanner;

public
class EqualSumsEvenOddPosition {
    public static
    void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int num1 = Integer.parseInt (scanner.nextLine ());
        int num2 = Integer.parseInt (scanner.nextLine ());


        for (int i = num1; i <=num2 ; i++) {
            String number = "" +i;
            int oddSum = 0;
            int evenSum =0;
            for (int j = 0; j < number.length (); j++) {
                int digit = Integer.parseInt (""+number.charAt (j));
                if (j%2==0){
                    oddSum +=digit;

                }else {
                    evenSum+=digit;
                }


            }if (evenSum==oddSum){
                System.out.print (i+" ");
            }

        }
    }
}

import java.util.Scanner;

public
class NumberPyramid {
    public static
    void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt (scanner.nextLine ());
        int count = 1;
        boolean end = false;
        for (int row = 1; row <=n ; row++) {
            for (int coll = 1; coll <=row ; coll++) {

                System.out.print (count+" ");

                if (count==n){
                    end = true; break;
                }
                count++;

            }
            System.out.println ();
            if (end){
                break;
            }

        }
    }
}

import java.util.Scanner;

public
class ExcellentResut {
    public static
    void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        double grade = Double.parseDouble (scanner.nextLine ());
        if (grade>=5){
            System.out.printf ("Excellent!");
        }
    }
}

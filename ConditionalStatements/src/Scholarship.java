import java.util.Scanner;

public
class Scholarship {
    public static
    void main (String[] args) {
        Scanner scanner        = new Scanner (System.in);
        double  income         = Double.parseDouble (scanner.nextLine ());
        double  result         = Double.parseDouble (scanner.nextLine ());
        double  minSalary      = Double.parseDouble (scanner.nextLine ());
        double  exScholarship  = 0;
        double  socScholarship = 0;
        if (result>=5.5){
            exScholarship=result*25;
        }
        if (income<minSalary){
            if (result > 4.5) {
                socScholarship = minSalary*.35;
            }
        }
        if (result<=4.5){
            System.out.println ("You cannot get a scholarship!");
        }else if ((result>4.5)&&(income>=minSalary)&&(result<5.5) ){
            System.out.println ("You cannot get a scholarship!");
        }else if(socScholarship>exScholarship){
            System.out.printf ("You get a Social scholarship %.0f BGN", Math.floor (socScholarship));
        }else {
            System.out.printf ("You get a scholarship for excellent results %.0f BGN", Math.floor (exScholarship));
        }
    }
}

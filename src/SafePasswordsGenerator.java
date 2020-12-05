import java.util.Scanner;

public
class SafePasswordsGenerator {
    public static
    void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a = Integer.parseInt (scanner.nextLine ());
        int b = Integer.parseInt (scanner.nextLine ());
        int maxPass = Integer.parseInt (scanner.nextLine ());
        int count = 0;
        boolean stop = false;
        for (char i  = 35;  i<=55 ; i++) {

            for (char j = 64; j <=96 ; j++) {

                for (int k = 1; k <=a ; k++) {
                    for (int l = 1; l <=b ; l++) {

                        System.out.printf ("%c%c%d%d%c%c|",i,j,k,l,j,i);
                        count++;
                        if (count==maxPass){
                           stop=true;break;
                        }
                        if (++i>55){
                            i=35;
                        }if (++j>96){
                            j=64;
                        }



                    }if (stop){
                        break;
                    }
                    
                }if (stop){
                    break;
                }

            }if (stop){
                break;
            }
        }
    }
}

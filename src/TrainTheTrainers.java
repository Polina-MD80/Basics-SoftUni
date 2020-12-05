import java.util.Scanner;

public
class TrainTheTrainers {
    public static
    void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        int assessors = Integer.parseInt (scanner.nextLine ());

        String topic = scanner.nextLine ();
        int count = 0;
        double totalSum = 0;

        while (!topic.equals ("Finish")){
            double averagePerTopic = 0;
            double sumPerTopic = 0;
            for (int i = 1; i <=assessors ; i++) {
                double grade = Double.parseDouble (scanner.nextLine ());
                sumPerTopic += grade;
            }averagePerTopic= sumPerTopic/assessors;
            System.out.printf ("%s - %.2f.%n",topic,averagePerTopic);
            totalSum+=averagePerTopic;
            count++;

            topic = scanner.nextLine ();

        }
        System.out.printf ("Student's final assessment is %.2f.",totalSum/count);
    }
}

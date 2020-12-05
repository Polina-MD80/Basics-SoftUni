import java.util.Scanner;

public class Boxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int lenght = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int spaceOfRoom = width * height * lenght;
        String command = scanner.nextLine();
        int sumOfBoxes = 0;
        while (!command.equals("Done")) {
            int boxes = Integer.parseInt(command);
            sumOfBoxes += boxes;
            command = scanner.nextLine();

            if (sumOfBoxes > spaceOfRoom) {
                System.out.printf("No more free space! You need %d Cubic meters more.", sumOfBoxes - spaceOfRoom);
                break;

            }

        }
        if (spaceOfRoom >= sumOfBoxes) {
            System.out.printf("%d Cubic meters left.", spaceOfRoom - sumOfBoxes);
        }
    }

}
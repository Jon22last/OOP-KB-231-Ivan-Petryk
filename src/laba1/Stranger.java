package laba1;
import java.util.Scanner;
// task 4

public class Stranger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many strangers do you want to greet? ");
        int count = scanner.nextInt();
        scanner.nextLine();

        if (count < 0) {
            System.out.println("Error: Quantity cannot be negative.");
        } else if (count == 0) {
            System.out.println("There is no one to greet.");
        } else {
            for (int i = 1; i <= count; i++) {
                System.out.print("Enter the name of a stranger №" + i + ": ");
                String name = scanner.nextLine();
                System.out.println("Hi, " + name);
            }
        }
        scanner.close();
    }
}

package laba1;
import java.util.Scanner;
// task 3

public class Passw {
    final static int password = 1234;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the password: ");
        int input = scanner.nextInt();

        if (input == password) {
            System.out.println("Hello, Agent");
        } else {
            System.out.println("Access denied");
        }
        scanner.close();
    }
}
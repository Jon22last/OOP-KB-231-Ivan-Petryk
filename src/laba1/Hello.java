package laba1;
import java.util.Scanner;
// task 1

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What your name: ");
        String input = scanner.nextLine();
        System.out.println("Hello, " + input);
        scanner.close();
    }
}
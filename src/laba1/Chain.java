package laba1;
import java.util.Scanner;
// task 7

public class Chain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int max = number;

        while (true) {
            number = scanner.nextInt();
            if (number == 0) break;
            if (number > max) max = number;
        }

        System.out.println(max);
        scanner.close();
    }
}
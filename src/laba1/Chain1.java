package laba1;
import java.util.Scanner;
// task 8

public class Chain1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            int number = scanner.nextInt();
            if (number == 0) break;

            sum += number;
            count++;
        }

        int average = sum / count;
        System.out.println(average);
        scanner.close();
    }
}
package laba1;
import java.util.Scanner;
// task 5

public class Snail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();

        if (a <= b && a < h) {
            System.out.println("Impossible");
        } else {
            if (a >= h) {
                System.out.println(1);
            } else {
                int effectiveClimb = a - b;
                int remainingHeight = h - a;
                int fullDays = (int)Math.ceil((double)remainingHeight / effectiveClimb);
                int totalDays = fullDays + 1;

                System.out.println(totalDays);
            }
        }
        scanner.close();
    }
}
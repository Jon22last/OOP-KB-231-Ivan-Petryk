package laba1;
import java.util.Scanner;
// task 9

public class Discrim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double d = b * b - 4 * a * c;

        if (d < 0) {
            System.out.println("no roots");
        } else if (d == 0) {
            double x = -b / (2 * a);
            System.out.println(x);
        } else {
            double sqrtD = Math.sqrt(d);
            double x1 = (-b - sqrtD) / (2 * a);
            double x2 = (-b + sqrtD) / (2 * a);

            if (x1 < x2) {
                System.out.println(x1 + " " + x2);
            } else {
                System.out.println(x2 + " " + x1);
            }
        }
        scanner.close();
    }
}
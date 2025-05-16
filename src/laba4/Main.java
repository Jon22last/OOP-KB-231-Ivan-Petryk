package laba4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Figure figure = null;

        System.out.println("Яку фігуру ви хочете створити?");
        System.out.println("1 - Трикутник");
        System.out.println("2 - Чотирикутник");
        System.out.println("3 - Коло");
        System.out.print("Ваш вибір: ");
        int choice = scanner.nextInt();

        try {
            switch (choice) {
                case 1:
                    System.out.println("Введіть координати трьох точок (x y):");
                    Point a = new Point(scanner.nextDouble(), scanner.nextDouble());
                    Point b = new Point(scanner.nextDouble(), scanner.nextDouble());
                    Point c = new Point(scanner.nextDouble(), scanner.nextDouble());
                    figure = new Triangle(a, b, c);
                    break;
                case 2:
                    System.out.println("Введіть координати чотирьох точок (x y):");
                    Point q1 = new Point(scanner.nextDouble(), scanner.nextDouble());
                    Point q2 = new Point(scanner.nextDouble(), scanner.nextDouble());
                    Point q3 = new Point(scanner.nextDouble(), scanner.nextDouble());
                    Point q4 = new Point(scanner.nextDouble(), scanner.nextDouble());
                    figure = new Quadrilateral(q1, q2, q3, q4);
                    break;
                case 3:
                    System.out.print("Введіть координати центру (x y): ");
                    Point center = new Point(scanner.nextDouble(), scanner.nextDouble());
                    System.out.print("Введіть радіус: ");
                    double radius = scanner.nextDouble();
                    figure = new Circle(center, radius);
                    break;
                default:
                    System.out.println("Невірний вибір.");
                    return;
            }

            System.out.println("\nФігура створена:");
            System.out.println(figure);
            System.out.println("Площа: " + figure.area());
            System.out.println("Центроїд: " + figure.centroid());

        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }

        scanner.close();
    }
}
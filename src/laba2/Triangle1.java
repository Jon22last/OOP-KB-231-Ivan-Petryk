package laba2;
// Task 3

class Point {
    public final double x;
    public final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ";" + y + ")";
    }
}

class Triangle {
    private final Point a;
    private final Point b;
    private final Point c;

    public Triangle(Point a, Point b, Point c) {
        if (areCollinear(a, b, c)) {
            throw new IllegalArgumentException("Точки не можуть лежати на одній прямій (трикутник вироджений)");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        return 0.5 * Math.abs(
            a.x * (b.y - c.y) +
            b.x * (c.y - a.y) +
            c.x * (a.y - b.y)
        );
    }

    public Point centroid() {
        double x = (a.x + b.x + c.x) / 3;
        double y = (a.y + b.y + c.y) / 3;
        return new Point(x, y);
    }

    private boolean areCollinear(Point p1, Point p2, Point p3) {
        double area = 0.5 * Math.abs(
            p1.x * (p2.y - p3.y) +
            p2.x * (p3.y - p1.y) +
            p3.x * (p1.y - p2.y)
        );
        return area == 0;
    }
}

public class Triangle1 {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(2, 3);

        Triangle triangle = new Triangle(p1, p2, p3);

        System.out.println("Площа: " + triangle.area());
        System.out.println("Центроїд: " + triangle.centroid());
    }
}
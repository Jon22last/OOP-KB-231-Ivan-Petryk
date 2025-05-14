package laba2;
// task 1

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

class Line {
    private final double k;
    private final double b;

    public Line(double k, double b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line other) {
        if (this.k == other.k) {
            return null;
        }

        double x = (other.b - this.b) / (this.k - other.k);
        double y = this.k * x + this.b;

        return new Point(x, y);
    }
}

public class Main {
    public static void main(String[] args) {
        Line line1 = new Line(1, 1);
        Line line2 = new Line(-1, 3);

        Point result = line1.intersection(line2);
        if (result == null) {
            System.out.println("Лінії не перетинаються або збігаються");
        } else {
            System.out.println("Точка перетину: " + result);
        }
    }
}


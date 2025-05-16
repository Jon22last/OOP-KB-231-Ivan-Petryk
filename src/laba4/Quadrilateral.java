package laba4;

class Quadrilateral extends Figure {
    private final Point a, b, c, d;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        if (areCollinear(a, b, c) || areCollinear(b, c, d) || areCollinear(a, c, d)) {
            throw new IllegalArgumentException("Фігура вироджена");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    private boolean areCollinear(Point p1, Point p2, Point p3) {
        double area = 0.5 * Math.abs(
                p1.x * (p2.y - p3.y) +
                p2.x * (p3.y - p1.y) +
                p3.x * (p1.y - p2.y));
        return area == 0;
    }

    @Override
    public double area() {
        Triangle t1 = new Triangle(a, b, c);
        Triangle t2 = new Triangle(a, c, d);
        return t1.area() + t2.area();
    }

    @Override
    public Point centroid() {
        double x = (a.x + b.x + c.x + d.x) / 4;
        double y = (a.y + b.y + c.y + d.y) / 4;
        return new Point(x, y);
    }

    @Override
    public String toString() {
        return "Quadrilateral[A" + a + " B" + b + " C" + c + " D" + d + "]";
    }
}

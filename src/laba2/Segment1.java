package laba2;
// task 2

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

class Segment {
    private final Point start;
    private final Point end;

    public Segment(Point start, Point end) {
        if (start.x == end.x && start.y == end.y) {
            throw new IllegalArgumentException("Початок і кінець не можуть бути однією точкою");
        }
        this.start = start;
        this.end = end;
    }

    public double length() {
        double dx = end.x - start.x;
        double dy = end.y - start.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public Point middle() {
        double midX = (start.x + end.x) / 2;
        double midY = (start.y + end.y) / 2;
        return new Point(midX, midY);
    }

    public Point intersection(Segment another) {
        double x1 = start.x, y1 = start.y;
        double x2 = end.x, y2 = end.y;
        double x3 = another.start.x, y3 = another.start.y;
        double x4 = another.end.x, y4 = another.end.y;

        double denom = (x1 - x2)*(y3 - y4) - (y1 - y2)*(x3 - x4);
        if (denom == 0) {
            return null;
        }

        double px = ((x1*y2 - y1*x2)*(x3 - x4) - (x1 - x2)*(x3*y4 - y3*x4)) / denom;
        double py = ((x1*y2 - y1*x2)*(y3 - y4) - (y1 - y2)*(x3*y4 - y3*x4)) / denom;
        Point inter = new Point(px, py);

        if (onSegment(inter, this) && onSegment(inter, another)) {
            return inter;
        } else {
            return null;
        }
    }

    private boolean onSegment(Point p, Segment s) {
        return Math.min(s.start.x, s.end.x) <= p.x && p.x <= Math.max(s.start.x, s.end.x) &&
               Math.min(s.start.y, s.end.y) <= p.y && p.y <= Math.max(s.start.y, s.end.y);
    }
}
public class Segment1 {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 4);
        Segment seg1 = new Segment(p1, p2);

        Point p3 = new Point(0, 4);
        Point p4 = new Point(4, 0);
        Segment seg2 = new Segment(p3, p4);

        System.out.println("Довжина: " + seg1.length());
        System.out.println("Середина: " + seg1.middle());

        Point cross = seg1.intersection(seg2);
        System.out.println("Перетин: " + (cross != null ? cross : "немає"));
    }
}
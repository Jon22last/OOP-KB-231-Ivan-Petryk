package laba4;

class Circle extends Figure {
    private final Point center;
    private final double radius;

    public Circle(Point center, double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радіус повинен бути додатнім");
        }
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public Point centroid() {
        return center;
    }

    @Override
    public String toString() {
        return "Circle[" + center + " Radius=" + radius + "]";
    }
}

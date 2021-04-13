package task2;

public class Point {
    private double a;
    private double b;

    public Point(double a1, double b1) {
        this.a = a1;
        this.b = b1;
    }
    public double distance(Point p1, Point p2) {
        return Math.sqrt((p2.a - p1.a) * (p2.a - p1.a) + (p2.b - p1.b) * (p2.b - p1.b));
    }

    @Override
    public String toString() {
        return "Point{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}

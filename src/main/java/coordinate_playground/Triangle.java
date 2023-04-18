package coordinate_playground;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Triangle {
    private List<Point> points = new ArrayList<>();
    public Triangle(Point p1, Point p2, Point p3) {
        if (p1.equals(p2) || p2.equals(p3) || p1.equals(p3)) {
            throw new IllegalArgumentException("Must be triangle");
        }
        points.add(p1);
        points.add(p2);
        points.add(p3);
        points.sort(new PointComparator());
    }

    public double area() {
        double a = new Line(points.get(0), points.get(1)).distance();
        double b = new Line(points.get(0), points.get(2)).distance();
        double c = new Line(points.get(1), points.get(2)).distance();
        double s = (a+b+c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

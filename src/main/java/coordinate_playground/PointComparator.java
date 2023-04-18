package coordinate_playground;

import java.util.Comparator;

public class PointComparator implements Comparator<Point> {
    @Override
    public int compare(Point p1, Point p2) {
        if (p1.getX() < p2.getX()) {
            return -1;
        }

        if (p1.getX() > p2.getX()) {
            return 1;
        }

        return Integer.compare(p2.getY(), p1.getY());

    }
}
package coordinate_playground;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Square {
    private List<Point> points = new ArrayList<>();

    public Square(Point point1, Point point2, Point point3, Point point4) {
        points.add(point1);
        points.add(point2);
        points.add(point3);
        points.add(point4);
        points.sort(new PointComparator());
        System.out.println("points = " + points);

        if(points.get(0).getX() == points.get(3).getX() || points.get(0).getY() == points.get(3).getY()){
            throw new IllegalArgumentException("opposite must have no same x and y");
        }
        if(points.get(1).getX() != points.get(0).getX() || points.get(1).getY() != points.get(3).getY()){
            throw new IllegalArgumentException("second point must have same x with first and same y with last");
        }
        if(points.get(2).getX() != points.get(3).getX() || points.get(2).getY() != points.get(0).getY()){
            throw new IllegalArgumentException("third point must have same x with first and same y with last");
        }

    }


    public double area() {
        return (points.get(0).getY() - points.get(1).getY()) * (points.get(2).getX() - points.get(0).getX());
    }
}

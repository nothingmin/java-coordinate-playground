package coordinate_playground;

public class Line {
    private final Point end;
    private final Point start;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }


    public double distance() {
        return Math.sqrt(Math.pow(start.getX()-end.getX(),2) + Math.pow(start.getY() - end.getY(),2));
    }
}

package coordinate_playground;

public class Line {
    private final Position end;
    private final Position start;

    public Line(Position start, Position end) {
        this.start = start;
        this.end = end;
    }


    public double distance() {
        return Math.sqrt(Math.pow(start.getX()-end.getX(),2) + Math.pow(start.getY() - end.getY(),2));
    }
}

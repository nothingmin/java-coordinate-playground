package coordinate_playground;

import java.util.List;

public class Coordinate {
    private static final String NEWLINE = System.getProperty("line.separator");

    private final Positions positions = new Positions();

    public void addPosition(Position position) {
        positions.addPosition(position);
    }

    public boolean isExist(Position position) {
        return positions.isExist(position);
    }

}

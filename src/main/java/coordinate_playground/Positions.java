package coordinate_playground;

import java.util.ArrayList;
import java.util.List;

public class Positions {
    private static final String NEWLINE = System.getProperty("line.separator");
    private static final int COORDINATE_MAX_LENGTH = 24;

    private final List<Position> positions = new ArrayList<>();

    public void addPosition(Position position) {
        positions.add(position);
    }

    public boolean isExist(Position position) {
        return positions.contains(position);
    }
}

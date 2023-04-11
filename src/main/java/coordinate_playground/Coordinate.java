package coordinate_playground;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Coordinate {
    private final Positions positions = new Positions();

    public void addPosition(Position position) {
        positions.addPosition(position);
    }

    public boolean isExist(Position position) {
        return positions.isExist(position);

    }
}

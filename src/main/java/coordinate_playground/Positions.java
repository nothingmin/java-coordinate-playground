package coordinate_playground;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Positions {
    private final List<Position> positions = new ArrayList<>();

    public void addPosition(Position position) {
        positions.add(position);
    }

    public boolean isExist(Position position) {
        return positions.contains(position);
    }

}

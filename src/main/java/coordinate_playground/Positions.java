package coordinate_playground;

import java.util.ArrayList;
import java.util.List;

public class Positions {
    private List<Position> positions = new ArrayList<>();

    public void addPosition(Position position) {
        positions.add(position);
    }

    public boolean isExist(Position position) {
        return positions.contains(position);
    }
}

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

    public List<List<Boolean>> toArray(){
        ArrayList<List<Boolean>> coordinate = getEmptyCoordinate();
        for (Position position : positions) {
            coordinate.get(24 - position.getY()).set(position.getX(), true);
        }
        return coordinate;
    }

    private static ArrayList<List<Boolean>> getEmptyCoordinate() {
        ArrayList<List<Boolean>> coordinate = new ArrayList<>(25);
        for(int i =0;i<25;i++){
            coordinate.add(getEmptyRow());
        }
        return coordinate;
    }

    private static List<Boolean> getEmptyRow() {
        List<Boolean> row = new ArrayList<>(25);
        for(int j=0;j<25;j++){
            row.add(false);
        }
        return row;
    }
}

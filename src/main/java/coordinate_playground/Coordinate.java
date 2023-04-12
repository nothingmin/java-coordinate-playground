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

    public String print() {
        List<List<Boolean>> positionsArray = positions.toArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (List<Boolean> booleans : positionsArray) {
            for (Boolean aBoolean : booleans) {
                if (aBoolean) {
                    stringBuilder.append("X");
                } else {
                    stringBuilder.append(" ");
                }
            }
            stringBuilder.append(NEWLINE);
        }
        return stringBuilder.toString();
    }
}

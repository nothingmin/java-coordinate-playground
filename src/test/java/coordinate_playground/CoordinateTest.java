package coordinate_playground;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CoordinateTest {
    private static final String NEWLINE = System.getProperty("line.separator");

    @Test
    public void add_position() {
        Coordinate coordinate = new Coordinate();
        coordinate.addPosition(new Position(1, 1));
        assertThat(coordinate.isExist(new Position(1, 1))).isEqualTo(true);
    }

    @Test
    public void print() {
        Coordinate coordinate = new Coordinate();
        coordinate.addPosition(new Position(10, 15));
        assertThat(coordinate.print()).isEqualTo(
                "                         " + NEWLINE +
                        "                         " + NEWLINE +
                        "                         " + NEWLINE +
                        "                         " + NEWLINE +
                        "                         " + NEWLINE +
                        "                         " + NEWLINE +
                        "                         " + NEWLINE +
                        "                         " + NEWLINE +
                        "                         " + NEWLINE +
                        "          X              " + NEWLINE +
                        "                         " + NEWLINE +
                        "                         " + NEWLINE +
                        "                         " + NEWLINE +
                        "                         " + NEWLINE +
                        "                         " + NEWLINE +
                        "                         " + NEWLINE +
                        "                         " + NEWLINE +
                        "                         " + NEWLINE +
                        "                         " + NEWLINE +
                        "                         " + NEWLINE +
                        "                         " + NEWLINE +
                        "                         " + NEWLINE +
                        "                         " + NEWLINE +
                        "                         " + NEWLINE +
                        "                         " + NEWLINE
        );
    }
}

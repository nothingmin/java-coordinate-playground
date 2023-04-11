package coordinate_playground;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CoordinateTest {

    @Test
    public void add_position(){
        Coordinate coordinate = new Coordinate();
        coordinate.addPosition(new Position(1, 1));
        assertThat(coordinate.isExist(new Position(1, 1))).isEqualTo(true);
    }
}

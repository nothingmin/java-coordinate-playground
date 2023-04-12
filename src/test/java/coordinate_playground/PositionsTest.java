package coordinate_playground;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PositionsTest {
    @Test
    public void add_position(){
        Positions positions = new Positions();
        positions.addPosition(new Position(1,5));
        Assertions.assertThat(positions.isExist(new Position(1, 5))).isEqualTo(true);
    }
}

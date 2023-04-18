package coordinate_playground;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class LineTest {

    @Test
    public void distance(){
        Line line = new Line(new Position(10, 10), new Position(14, 15));
        assertThat(line.distance()).isEqualTo(6.403124,offset(0.0001));
    }

}

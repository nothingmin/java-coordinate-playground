package coordinate_playground;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {
    @Test
    public void area(){
        Square square = new Square(new Point(10, 10), new Point(22, 10), new Point(22, 18), new Point(10, 18));
        Assertions.assertThat(square.area()).isEqualTo(96);
    }
}

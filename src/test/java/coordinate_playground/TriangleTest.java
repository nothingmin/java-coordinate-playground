package coordinate_playground;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


public class TriangleTest {
    @Test
    public void area(){
        Triangle triangle = new Triangle(new Point(10, 10), new Point(22, 10), new Point(22, 18));
        Assertions.assertThat(triangle.area()).isEqualTo(48);
    }

}

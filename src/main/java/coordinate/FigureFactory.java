package coordinate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class FigureFactory {
    static Map<Integer, FigureCreator> creatorMap;
    static {
        creatorMap = new HashMap<>();
        creatorMap.put(Line.LINE_POINT_SIZE, Line::new);
        creatorMap.put(Triangle.TRIANGLE_POINT_SIZE, Triangle::new);
        creatorMap.put(Rectangle.RECTANGLE_POINT_SIZE,Rectangle::new);
    }
    static Figure getInstance(List<Point> points) {
        FigureCreator figureCreator = creatorMap.get(points.size());

        if(figureCreator != null){
            return figureCreator.create(points);
        }

        throw new IllegalArgumentException("유효하지 않은 도형입니다.");
    }
}

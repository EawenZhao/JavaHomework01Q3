import java.util.List;

public class MapTool {
    public void move(List<MapElement> list, double x, double y) {
        for (MapElement element : list) {
            if (element instanceof Point) {
                ((Point) element).setPosition_X(((Point) element).getPosition_X() + x);
                ((Point) element).setPosition_Y(((Point) element).getPosition_Y() + y);
            } else if (element instanceof Line) {
                for (Point point : ((Line) element).points) {
                    point.setPosition_X(point.getPosition_X() + x);
                    point.setPosition_Y(point.getPosition_Y() + y);
                }
            } else {
                throw new RuntimeException("Not movable !");
            }
        }
    }
}

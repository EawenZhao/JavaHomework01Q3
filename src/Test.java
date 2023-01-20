import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Line line = new Line();
        line.points.add(new Point(1,0));
        line.points.add(new Point(2,0));
        line.points.add(new Point(3,0));

        List<MapElement> map = new ArrayList<>();
        map.add(line);
        map.add(new Point(1, 1));
        map.add(new Point(3.5, 4.7));

        MapTool mapTool = new MapTool();
        mapTool.move(map, 3, 3);
    }
}
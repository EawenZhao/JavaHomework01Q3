import java.util.ArrayList;
import java.util.List;

public class Line implements MapElement {
    List<Point> points = new ArrayList<Point>();

    public Line(List<Point> points) {
        this.points = points;
    }

    public Line() {
    }

}

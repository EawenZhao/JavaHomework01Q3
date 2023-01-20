import java.util.List;

public class Point implements MapElement {
    private double Position_X;
    private double Position_Y;

    public double getPosition_X() {
        return Position_X;
    }

    public void setPosition_X(double position_X) {
        Position_X = position_X;
    }

    public double getPosition_Y() {
        return Position_Y;
    }

    public void setPosition_Y(double position_Y) {
        Position_Y = position_Y;
    }

    public Point(double position_X, double position_Y) {
        Position_X = position_X;
        Position_Y = position_Y;
    }

    public Point() {
    }

}

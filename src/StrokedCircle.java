import java.awt.*;

public class StrokedCircle extends Circle {
    public StrokedCircle(Position position, Vector vector, Movable movable, int size, Displayer displayer) {
        super(position, vector, movable, BouncableStrokedRenderer.getInstance(), size, Color.GREEN, displayer);
    }
}
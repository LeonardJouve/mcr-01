import java.awt.*;

public class StrokedSquare extends Square {
    public StrokedSquare(Position position, Vector vector, Movable movable, int size, Displayer displayer) {
        super(position, vector, movable, BouncableStrokedRenderer.getInstance(), size, Color.RED, displayer);
    }
}
import java.awt.*;

public class FilledCircle extends Circle {
    public FilledCircle(Position position, Vector vector, Movable movable, int size, Displayer displayer) {
        super(position, vector, movable, BouncableFilledRenderer.getInstance(), size, Color.BLUE, displayer);
    }
}
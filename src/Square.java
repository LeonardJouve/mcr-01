import java.awt.*;
import java.awt.geom.Rectangle2D;

public abstract class Square extends BouncableShape {
    public Square(Position position, Vector vector, Movable movementManager, Renderer renderer, int size, Color color, Displayer displayer) {
        super(position, vector, size, movementManager, renderer, color, displayer);
    }

    @Override
    public Shape getShape() {
        return new Rectangle2D.Double(position.getX(), position.getY(), size, size);
    }
}

import java.awt.*;
import java.awt.geom.Rectangle2D;

public abstract class Square extends BouncableShape {
    public Square(Position position, Vector vector, Movable movementManager, int size, Color color) {
        super(position, vector, size, movementManager, color);
    }

    public abstract void draw();

    @Override
    public Shape getShape() {
        return new Rectangle2D.Double(position.getX(), position.getY(), size, size);
    }
}

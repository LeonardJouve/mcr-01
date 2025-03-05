import java.awt.*;
import java.awt.geom.Ellipse2D;

public abstract class Circle extends BouncableShape {
    public Circle(Position position, Vector vector, Movable movable, int size, Color color) {
        super(position, vector, size, movable, color);
    }

    public abstract void draw();

    public Shape getShape() {
        return new Ellipse2D.Double(position.getX(), position.getY(), size, size);
    }
}

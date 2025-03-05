import java.awt.*;
import java.awt.geom.Ellipse2D;

public abstract class Circle extends BouncableShape {
    public Circle(Position position, Vector vector, Movable movable, Renderer renderer, int size, Color color, Displayer displayer) {
        super(position, vector, size, movable, renderer, color, displayer);
    }

    public Shape getShape() {
        return new Ellipse2D.Double(position.getX(), position.getY(), size, size);
    }
}

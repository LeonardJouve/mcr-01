import java.awt.*;

public class Circle extends Shape {
    public Circle(Position position, Vector vector, Movable movable, int size) {
        super(position, vector, size, movable);
    }

    public void draw(Graphics2D g) {
        g.setColor(Color.RED);
        g.fillOval(position.getX(), position.getY(), size, size);
    }
}

import java.awt.*;

public class Circle extends Shape {
    public Circle(Position position, Vector vector, Movable movable, int size) {
        super(position, vector, size, movable);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(position.getX(), position.getY(), size, size);
    }
}

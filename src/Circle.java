import java.awt.*;

public class Circle extends Shape {
    private final int radius;

    public Circle(Position position, Vector vector, Movable movable, int radius) {
        super(position, vector, movable);
        this.radius = radius;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(position.getX(), position.getY(), radius, radius);
    }
}

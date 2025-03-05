import java.awt.*;

public class StrokedCircle extends Circle {
    public StrokedCircle(Position position, Vector vector, Movable movable, int size) {
        super(position, vector, movable, size, Color.GREEN);
    }

    @Override
    public void draw() {
        Graphics2D g = DisplayerBouncer.getInstance().getGraphics();
        g.setColor(getColor());
        g.setStroke(new BasicStroke(2));
        g.drawOval(position.getX(), position.getY(), size, size);
    }
}
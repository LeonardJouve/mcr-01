import java.awt.*;

public class FilledCircle extends Circle {
    public FilledCircle(Position position, Vector vector, Movable movable, int size) {
        super(position, vector, movable, size, Color.BLUE);
    }

    @Override
    public void draw() {
        Graphics2D g = DisplayerBouncer.getInstance().getGraphics();
        g.setColor(getColor());
        g.fillOval(position.getX(), position.getY(), size, size);
    }
}
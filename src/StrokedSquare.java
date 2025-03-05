import java.awt.*;

public class StrokedSquare extends Square {
    public StrokedSquare(Position position, Vector vector, Movable movable, int size) {
        super(position, vector, movable, size, Color.RED);
    }

    @Override
    public void draw() {
        Graphics2D g = DisplayerBouncer.getInstance().getGraphics();
        g.setColor(getColor());
        g.setStroke(new BasicStroke(2));
        g.drawRect(position.getX(), position.getY(), size, size);
    }
}
import java.awt.*;

public class FilledSquare extends Square {
    public FilledSquare(Position position, Vector vector, Movable movable, int size) {
        super(position, vector, movable, size, Color.ORANGE);
    }

    @Override
    public void draw() {
        Graphics2D g = DisplayerBouncer.getInstance().getGraphics();
        g.setColor(getColor());
        g.fillRect(position.getX(), position.getY(), size, size);
    }
}
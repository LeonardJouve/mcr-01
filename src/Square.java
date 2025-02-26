import java.awt.*;

public class Square extends Shape {
    public Square(Position position, Vector vector, Movable movementManager, int size) {
        super(position, vector, size, movementManager);
    }

    public void draw(Graphics2D g) {
        g.setColor(Color.BLUE);
        g.fillRect(position.getX(), position.getY(), size, size);
    }
}

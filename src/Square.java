import java.awt.*;

public class Square extends Shape {
    public Square(Position position, Vector vector, Movable movementManager, int size) {
        super(position, vector, size, movementManager);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(position.getX(), position.getY(), size, size);
    }
}

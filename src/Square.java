import java.awt.*;

public class Square extends Shape {
    private final int size;

    public Square(Position position, Vector vector, Movable movementManager, int size) {
        super(position, vector, movementManager);

        this.size = size;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(position.getX(), position.getY(), size, size);
    }
}

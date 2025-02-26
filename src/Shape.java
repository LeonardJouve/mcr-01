import javax.swing.*;
import java.awt.*;

public abstract class Shape {
    protected final Position position;
    protected final int size;
    private final Vector vector;
    private final Movable movable;

    public Shape(Position position, Vector vector, int size, Movable movable) {
        this.position = position;
        this.vector = vector;
        this.size = size;
        this.movable = movable;
    }

    public void move() {
        movable.move(position, vector, size);
    }

    public abstract void draw(Graphics2D graphics);
}

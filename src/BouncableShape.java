import java.awt.*;

public abstract class BouncableShape implements Bouncable {
    protected final Position position;
    protected final int size;
    private final Vector vector;
    private final Movable movable;
    private final Color color;

    public BouncableShape(Position position, Vector vector, int size, Movable movable, Color color) {
        this.position = position;
        this.vector = vector;
        this.size = size;
        this.movable = movable;
        this.color = color;
    }

    public void move() {
        movable.move(position, vector, size);
    }

    public abstract void draw();

    public Color getColor() {
        return color;
    }

    public abstract Shape getShape();
}

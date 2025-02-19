import javax.swing.*;

public abstract class Shape extends JComponent {
    protected final Position position;
    private final Vector vector;
    private final Movable movable;

    public Shape(Position position, Vector vector, Movable movable) {
        this.position = position;
        this.vector = vector;
        this.movable = movable;
    }

    public void move() {
        movable.move(position, vector);
    }
}

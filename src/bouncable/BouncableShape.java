package bouncable;

import bouncable.renderer.Renderer;
import displayer.Displayer;
import movement.Movable;
import utils.Position;
import utils.Vector;

import java.awt.*;

public abstract class BouncableShape implements Bouncable {
    protected final Position position;
    protected final int size;
    private final Vector vector;
    private final Movable movable;
    private final Color color;
    private final Renderer renderer;
    private final Displayer displayer;

    public BouncableShape(Position position, Vector vector, int size, Movable movable, Renderer renderer, Color color, Displayer displayer) {
        this.position = position;
        this.vector = vector;
        this.size = size;
        this.movable = movable;
        this.renderer = renderer;
        this.color = color;
        this.displayer = displayer;
    }

    public void move() {
        movable.move(position, vector, size);
    }

    public void draw() {
        renderer.display(displayer.getGraphics(), this);
    }

    public Color getColor() {
        return color;
    }

    public abstract Shape getShape();
}

package bouncable.circle;

import bouncable.renderer.BouncableStrokedRenderer;
import displayer.Displayer;
import movement.Movable;
import utils.Position;
import utils.Vector;

import java.awt.*;

public class StrokedCircle extends Circle {
    public StrokedCircle(Position position, Vector vector, Movable movable, int size, Displayer displayer) {
        super(position, vector, movable, BouncableStrokedRenderer.getInstance(), size, Color.GREEN, displayer);
    }
}
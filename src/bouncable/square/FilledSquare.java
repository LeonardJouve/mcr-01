package bouncable.square;

import bouncable.renderer.BouncableFilledRenderer;
import displayer.Displayer;
import movement.Movable;
import utils.Position;
import utils.Vector;

import java.awt.*;

public class FilledSquare extends Square {
    public FilledSquare(Position position, Vector vector, Movable movable, int size, Displayer displayer) {
        super(position, vector, movable, BouncableFilledRenderer.getInstance(), size, Color.ORANGE, displayer);
    }
}
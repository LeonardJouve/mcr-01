package bouncable.factory;

import bouncable.circle.Circle;
import bouncable.square.Square;
import displayer.Displayer;
import movement.Movable;
import utils.Position;
import utils.Vector;

public interface ShapeFactory {
    public Circle createCircle(Position position, Vector vector, Movable movable, int size, Displayer displayer);

    public Square createSquare(Position position, Vector vector, Movable movable, int size, Displayer displayer);

}

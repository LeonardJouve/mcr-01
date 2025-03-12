package bouncable.factory;

import bouncable.circle.Circle;
import bouncable.square.Square;
import bouncable.circle.StrokedCircle;
import bouncable.square.StrokedSquare;
import displayer.Displayer;
import movement.Movable;
import utils.Position;
import utils.Vector;

public class StrokedFactory implements ShapeFactory {
    private static StrokedFactory instance;

    private StrokedFactory() {}

    public static StrokedFactory getInstance() {
        if (instance == null) {
            instance = new StrokedFactory();
        }
        return instance;
    }

    @Override
    public Circle createCircle(Position position, Vector vector, Movable movable, int size, Displayer displayer) {
        return new StrokedCircle(position, vector, movable, size, displayer);
    }

    @Override
    public Square createSquare(Position position, Vector vector, Movable movable, int size, Displayer displayer) {
        return new StrokedSquare(position, vector, movable, size, displayer);
    }
}
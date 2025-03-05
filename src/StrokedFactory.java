
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
    public Circle createCircle(Position position, Vector vector, Movable movable, int size) {
        return new StrokedCircle(position, vector, movable, size);
    }

    @Override
    public Square createSquare(Position position, Vector vector, Movable movable, int size) {
        return new StrokedSquare(position, vector, movable, size);
    }
}
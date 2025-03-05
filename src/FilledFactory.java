public class FilledFactory implements ShapeFactory {
    private static FilledFactory instance;

    private FilledFactory() {}

    public static FilledFactory getInstance() {
        if (instance == null) {
            instance = new FilledFactory();
        }
        return instance;
    }

    @Override
    public Circle createCircle(Position position, Vector vector, Movable movable, int size, Displayer displayer) {
        return new FilledCircle(position, vector, movable, size, displayer);
    }

    @Override
    public Square createSquare(Position position, Vector vector, Movable movable, int size, Displayer displayer) {
        return new FilledSquare(position, vector, movable, size, displayer);
    }
}
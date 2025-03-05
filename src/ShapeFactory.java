
public interface ShapeFactory {
    public Circle createCircle(Position position, Vector vector, Movable movable, int size, Displayer displayer);

    public Square createSquare(Position position, Vector vector, Movable movable, int size, Displayer displayer);

}

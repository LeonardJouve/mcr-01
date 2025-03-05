import java.awt.*;

public interface ShapeFactory {
    public Circle createCircle(Position position, Vector vector, Movable movable, int size);

    public Square createSquare(Position position, Vector vector, Movable movable, int size);

}

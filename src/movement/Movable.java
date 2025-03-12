package movement;

import utils.Position;
import utils.Vector;

public interface Movable {
    void move(Position position, Vector vector, int size);

    void setWidth(int width);

    void setHeight(int height);
}

public class MovementManager implements Movable {
    private final int height;
    private final int width;

    public MovementManager(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void move(Position position, Vector vector, int size) {
        if (isOutboundVertical(position, size)) bounceVertical(vector);
        if (isOutboundHorizontal(position, size)) bounceHorizontal(vector);

        position.setX(position.getX() + vector.getDx());
        position.setY(position.getY() + vector.getDy());
    }

    private boolean isOutboundVertical(Position position, int size) {
        return position.getY() < 0 || position.getY() + size >= height;
    }

    private boolean isOutboundHorizontal(Position position, int size) {
        return position.getX() < 0 || position.getX() + size >= width;
    }

    private void bounceVertical(Vector vector) {
        vector.setDy(-vector.getDy());
    }

    private void bounceHorizontal(Vector vector) {
        vector.setDx(-vector.getDx());
    }
}

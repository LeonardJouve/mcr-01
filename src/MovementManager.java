public class MovementManager implements Movable {
    private final Dimension dimension;

    public MovementManager(Dimension dimension) {
        this.dimension = dimension;
    }

    public void move(Position position, Vector vector) {
        if (isOutboundVertical(position)) bounceVertical(vector);
        if (isOutboundHorizontal(position)) bounceHorizontal(vector);

        position.setX(position.getX() + vector.getDx());
        position.setY(position.getY() + vector.getDy());
    }

    private boolean isOutboundVertical(Position position) {
        return position.getY() < 0 || position.getY() >= dimension.height();
    }

    private boolean isOutboundHorizontal(Position position) {
        return position.getX() < 0 || position.getX() >= dimension.width();
    }

    private void bounceVertical(Vector vector) {
        vector.setDy(-vector.getDy());
    }

    private void bounceHorizontal(Vector vector) {
        vector.setDx(-vector.getDx());
    }
}
